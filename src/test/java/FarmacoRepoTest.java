import br.com.vaiDarRuim.apiController.FarmacoController;
import br.com.vaiDarRuim.core.entity.Classificacao;
import br.com.vaiDarRuim.core.entity.Farmaco;
import br.com.vaiDarRuim.core.repository.FarmacoRepo;

import com.github.javafaker.Faker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;



public class FarmacoRepoTest {

    private static EntityManagerFactory factory;
    private static EntityManager manager;
    private static FarmacoRepo farmacoRepo;
    private final Faker faker = new Faker();

    @BeforeAll
    public static void setUp() {
        factory = Persistence.createEntityManagerFactory("oracle");
        manager = factory.createEntityManager();

        farmacoRepo = new FarmacoRepo(manager, Farmaco.class);

        manager.getTransaction().begin();
    }

    @Test
    @Order(1)
    public void testCreateFarmaco() {

        Farmaco farmaco = new Farmaco();
        farmaco.setNomeDaSubstancia(faker.beer().style());
        farmacoRepo.create(farmaco);

        var farmacoInserido = farmacoRepo.findFarmacoByName(farmaco.getNomeDaSubstancia());
        assertNotNull(farmacoInserido);
    }

    @Test
    @Order(2)
    public void testCreateInvalidFarmaco() {

        Farmaco farmaco = new Farmaco();
        farmaco.setNomeDaSubstancia("");
        assertThrows(Exception.class, () -> farmacoRepo.create(farmaco));

    }


    @Test
    @Order(3)
    public void testUpdateFarmaco() {


        Farmaco farmaco = new Farmaco();
        farmaco.setNomeDaSubstancia(faker.beer().yeast());

        farmacoRepo.create(farmaco);

        Farmaco oldFarmaco = new Farmaco();
        oldFarmaco.setNomeDaSubstancia(farmaco.getNomeDaSubstancia());
        oldFarmaco.setCruzamentos(new HashMap<>(farmaco.getCruzamentos()));

        Map<String, Classificacao> cruzamentos = new HashMap<>();
        cruzamentos.put(faker.beer().malt(), Classificacao.VERMELHO);
        farmaco.setCruzamentos(cruzamentos);

        farmacoRepo.update(farmaco);
        assertNotEquals(oldFarmaco.getCruzamentos(), farmaco.getCruzamentos());
    }

    @Test
    @Order(4)
    public void TestFindFarmacoByName() {

        Farmaco farmaco = new Farmaco();
        farmaco.setNomeDaSubstancia(faker.beer().malt());

        farmacoRepo.create(farmaco);

        Farmaco findFarmaco = farmacoRepo.findFarmacoByName(farmaco.getNomeDaSubstancia());

        assertNotNull(findFarmaco);
    }

    @Test
    @Order(5)
    public void testDeleteFarmaco() {
        Farmaco farmaco = new Farmaco();
        farmaco.setNomeDaSubstancia(faker.rockBand().name());
        farmacoRepo.create(farmaco);

        var farmacoInserido = farmacoRepo.findFarmacoByName(farmaco.getNomeDaSubstancia());
        assertNotNull(farmacoInserido);

        farmacoRepo.deleteById(farmaco.getFarmacoId());

        var farmacoExcluido = farmacoRepo.findFarmacoByName(farmaco.getNomeDaSubstancia());
        assertNull(farmacoExcluido);

    }

    @AfterAll
    public static void tearDown(){
        manager.getTransaction().rollback();
        manager.close();
        factory.close();
    }
}
