package br.com.vaiDarRuim.apiController;


import br.com.vaiDarRuim.core.entity.Classificacao;
import br.com.vaiDarRuim.core.entity.Farmaco;
import br.com.vaiDarRuim.core.repository.FarmacoRepo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.HashMap;
import java.util.Map;

public class FarmacoController {


    public static void main(String[] args) {
        insertMVCfarmacos();
    }

    public static void insertMVCfarmacos() {

        try {

            EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
            EntityManager entityManager = factory.createEntityManager();

            entityManager.getTransaction().begin();

            FarmacoRepo farmacoRepo = new FarmacoRepo(entityManager, Farmaco.class);


            // ----- *** -------
            // Input 1
            Map<String, Classificacao> cruzamentos1 = new HashMap<>();
            cruzamentos1.put("MACONHA", Classificacao.AZUL);
            cruzamentos1.put("LSD", Classificacao.VERDE);
            cruzamentos1.put("COGUMELO", Classificacao.VERDE);
            cruzamentos1.put("CAFÉINA", Classificacao.VERDE);
            cruzamentos1.put("MDMA", Classificacao.VERDE);
            cruzamentos1.put("KETAMINA", Classificacao.VERDE);
            cruzamentos1.put("ÁLCOOL", Classificacao.VERDE);
            cruzamentos1.put("GHB", Classificacao.VERDE);
            cruzamentos1.put("COCAÍNA", Classificacao.VERDE);
            cruzamentos1.put("POPPERS", Classificacao.VERDE);
            cruzamentos1.put("VIAGRA", Classificacao.VERDE);

            Farmaco farmaco1 = new Farmaco("Maconha", cruzamentos1);
            farmacoRepo.create(farmaco1);

            // Input 2
            Map<String, Classificacao> cruzamentos2 = new HashMap<>();
            cruzamentos2.put("LSD", Classificacao.AZUL);
            cruzamentos2.put("MACONHA", Classificacao.VERDE);
            cruzamentos2.put("COGUMELO", Classificacao.VERDE);
            cruzamentos2.put("CAFÉINA", Classificacao.VERDE);
            cruzamentos2.put("MDMA", Classificacao.VERDE);
            cruzamentos2.put("KETAMINA", Classificacao.VERDE);
            cruzamentos2.put("ÁLCOOL", Classificacao.VERDE);
            cruzamentos2.put("GHB", Classificacao.VERDE);
            cruzamentos2.put("COCAÍNA", Classificacao.AMARELO);
            cruzamentos2.put("POPPERS", Classificacao.AMARELO);
            cruzamentos2.put("VIAGRA", Classificacao.AMARELO);

            Farmaco farmaco2 = new Farmaco("LSD", cruzamentos2);
            farmacoRepo.create(farmaco2);


            // Input 3
            Map<String, Classificacao> cruzamentos3 = new HashMap<>();
            cruzamentos3.put("COGUMELO", Classificacao.VERDE);
            cruzamentos3.put("MACONHA", Classificacao.VERDE);
            cruzamentos3.put("CAFEINA", Classificacao.AMARELO);
            cruzamentos3.put("MDMA", Classificacao.VERDE);
            cruzamentos3.put("KETAMINA", Classificacao.VERDE);
            cruzamentos3.put("ÁLCOOL", Classificacao.VERDE);
            cruzamentos3.put("GHB", Classificacao.VERDE);
            cruzamentos3.put("COCAÍNA", Classificacao.AMARELO);
            cruzamentos3.put("POPPERS", Classificacao.VERMELHO);
            cruzamentos3.put("VIAGRA", Classificacao.VERMELHO);

            Farmaco farmaco3 = new Farmaco("COGUMELO", cruzamentos3);
            farmacoRepo.create(farmaco3);

// Input 4
            Map<String, Classificacao> cruzamentos4 = new HashMap<>();
            cruzamentos4.put("CAFÉINA", Classificacao.AZUL);
            cruzamentos4.put("MACONHA", Classificacao.VERDE);
            cruzamentos4.put("LSD", Classificacao.VERDE);
            cruzamentos4.put("COGUMELO", Classificacao.AMARELO);
            cruzamentos4.put("MDMA", Classificacao.AMARELO);
            cruzamentos4.put("KETAMINA", Classificacao.AMARELO);
            cruzamentos4.put("ÁLCOOL", Classificacao.AMARELO);
            cruzamentos4.put("COCAÍNA", Classificacao.AMARELO);
            cruzamentos4.put("POPPERS", Classificacao.AMARELO);
            cruzamentos4.put("VIAGRA", Classificacao.AMARELO);

            Farmaco farmaco4 = new Farmaco("CAFÉINA", cruzamentos4);
            farmacoRepo.create(farmaco4);

// Input 5
            Map<String, Classificacao> cruzamentos5 = new HashMap<>();
            cruzamentos5.put("MACONHA", Classificacao.VERDE);
            cruzamentos5.put("LSD", Classificacao.VERDE);
            cruzamentos5.put("COGUMELO", Classificacao.VERDE);
            cruzamentos5.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos5.put("MDMA", Classificacao.AZUL);
            cruzamentos5.put("KETAMINA", Classificacao.AMARELO);
            cruzamentos5.put("ÁLCOOL", Classificacao.VERMELHO);
            cruzamentos5.put("GHB", Classificacao.AMARELO);
            cruzamentos5.put("COCAÍNA", Classificacao.VERMELHO);
            cruzamentos5.put("POPPERS", Classificacao.VERMELHO);
            cruzamentos5.put("VIAGRA", Classificacao.AMARELO);

            Farmaco farmaco5 = new Farmaco("MDMA", cruzamentos5);
            farmacoRepo.create(farmaco5);

// Input 6
            Map<String, Classificacao> cruzamentos6 = new HashMap<>();
            cruzamentos6.put("MACONHA", Classificacao.VERDE);
            cruzamentos6.put("LSD", Classificacao.VERDE);
            cruzamentos6.put("COGUMELO", Classificacao.VERDE);
            cruzamentos6.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos6.put("MDMA", Classificacao.AMARELO);
            cruzamentos6.put("KETAMINA", Classificacao.AZUL);
            cruzamentos6.put("ÁLCOOL", Classificacao.PRETO);
            cruzamentos6.put("GHB", Classificacao.PRETO);
            cruzamentos6.put("COCAÍNA", Classificacao.VERMELHO);
            cruzamentos6.put("POPPERS", Classificacao.VERDE);
            cruzamentos6.put("VIAGRA", Classificacao.VERDE);

            Farmaco farmaco6 = new Farmaco("KETAMINA", cruzamentos6);
            farmacoRepo.create(farmaco6);

// Input 7
            Map<String, Classificacao> cruzamentos7 = new HashMap<>();
            cruzamentos7.put("MACONHA", Classificacao.VERDE);
            cruzamentos7.put("LSD", Classificacao.VERDE);
            cruzamentos7.put("COGUMELO", Classificacao.VERDE);
            cruzamentos7.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos7.put("MDMA", Classificacao.AMARELO);
            cruzamentos7.put("KETAMINA", Classificacao.PRETO);
            cruzamentos7.put("ÁLCOOL", Classificacao.AZUL);
            cruzamentos7.put("GHB", Classificacao.PRETO);
            cruzamentos7.put("COCAÍNA", Classificacao.VERMELHO);
            cruzamentos7.put("POPPERS", Classificacao.VERMELHO);
            cruzamentos7.put("VIAGRA", Classificacao.VERMELHO);

            Farmaco farmaco7 = new Farmaco("ÁLCOOL", cruzamentos7);
            farmacoRepo.create(farmaco7);

            // Input 8
            Map<String, Classificacao> cruzamentos8 = new HashMap<>();
            cruzamentos8.put("MACONHA", Classificacao.VERDE);
            cruzamentos8.put("LSD", Classificacao.VERDE);
            cruzamentos8.put("COGUMELO", Classificacao.VERDE);
            cruzamentos8.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos8.put("MDMA", Classificacao.VERMELHO);
            cruzamentos8.put("KETAMINA", Classificacao.PRETO);
            cruzamentos8.put("ÁLCOOL", Classificacao.PRETO);
            cruzamentos8.put("GHB", Classificacao.AZUL);
            cruzamentos8.put("COCAÍNA", Classificacao.VERMELHO);
            cruzamentos8.put("POPPERS", Classificacao.VERMELHO);
            cruzamentos8.put("VIAGRA", Classificacao.VERMELHO);

            Farmaco farmaco8 = new Farmaco("GHB", cruzamentos8);
            farmacoRepo.create(farmaco8);

            // Input 9
            Map<String, Classificacao> cruzamentos9 = new HashMap<>();
            cruzamentos9.put("MACONHA", Classificacao.VERDE);
            cruzamentos9.put("LSD", Classificacao.AMARELO);
            cruzamentos9.put("COGUMELO", Classificacao.AMARELO);
            cruzamentos9.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos9.put("MDMA", Classificacao.VERMELHO);
            cruzamentos9.put("KETAMINA", Classificacao.VERMELHO);
            cruzamentos9.put("ÁLCOOL", Classificacao.VERMELHO);
            cruzamentos9.put("GHB", Classificacao.VERMELHO);
            cruzamentos9.put("COCAÍNA", Classificacao.AZUL);
            cruzamentos9.put("POPPERS", Classificacao.PRETO);
            cruzamentos9.put("VIAGRA", Classificacao.PRETO);

            Farmaco farmaco9 = new Farmaco("COCAÍNA", cruzamentos9);
            farmacoRepo.create(farmaco9);

            // Input 10
            Map<String, Classificacao> cruzamentos10 = new HashMap<>();
            cruzamentos10.put("MACONHA", Classificacao.VERDE);
            cruzamentos10.put("LSD", Classificacao.AMARELO);
            cruzamentos10.put("COGUMELO", Classificacao.VERMELHO);
            cruzamentos10.put("CAFÉINA", Classificacao.AMARELO);
            cruzamentos10.put("MDMA", Classificacao.VERMELHO);
            cruzamentos10.put("KETAMINA", Classificacao.VERDE);
            cruzamentos10.put("ÁLCOOL", Classificacao.VERMELHO);
            cruzamentos10.put("GHB", Classificacao.VERMELHO);
            cruzamentos10.put("COCAÍNA", Classificacao.PRETO);
            cruzamentos10.put("POPPERS", Classificacao.AZUL);
            cruzamentos10.put("VIAGRA", Classificacao.PRETO);

            Farmaco farmaco10 = new Farmaco("POPPERS", cruzamentos10);
            farmacoRepo.create(farmaco10);


            // ----- *** -------
            entityManager.getTransaction().commit();
            entityManager.close();
            factory.close();

        } catch (Exception e) {
            System.err.println(e);
        }

    }
}

//
//package br.com.vaiDarRuim.apiController;
//
//
//        import br.com.vaiDarRuim.core.entity.Classificacao;
//        import br.com.vaiDarRuim.core.entity.Farmaco;
//        import br.com.vaiDarRuim.core.repository.FarmacoRepo;
//        import jakarta.persistence.EntityManager;
//        import jakarta.persistence.EntityManagerFactory;
//        import jakarta.persistence.Persistence;
//
//        import java.util.HashMap;
//        import java.util.Map;
//
//public class FarmacoController {
//
//
//    public static void main(String[] args) {
//        insertMVPfarmacos();
//    }
//
//    public static void insertMVPfarmacos() {
//
//        try {
//
//            EntityManagerFactory factory = Persistence.createEntityManagerFactory("oracle");
//            EntityManager entityManager = factory.createEntityManager();
//
//            entityManager.getTransaction().begin();
//
//            FarmacoRepo farmacoRepo = new FarmacoRepo(entityManager, Farmaco.class);
//
//
//            // ----- *** -------
//            // Input 1
//            Map<String, Classificacao> cruzamentos1 = new HashMap<>();
//            cruzamentos1.put("MACONHA", Classificacao.AZUL);
//            cruzamentos1.put("LSD", Classificacao.VERDE);
//            cruzamentos1.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos1.put("CAFÉINA", Classificacao.VERDE);
//            cruzamentos1.put("MDMA", Classificacao.VERDE);
//            cruzamentos1.put("KETAMINA", Classificacao.VERDE);
//            cruzamentos1.put("ÁLCOOL", Classificacao.VERDE);
//            cruzamentos1.put("GHB", Classificacao.VERDE);
//            cruzamentos1.put("COCAÍNA", Classificacao.VERDE);
//            cruzamentos1.put("POPPERS", Classificacao.VERDE);
//            cruzamentos1.put("VIAGRA", Classificacao.VERDE);
//
//            Farmaco farmaco1 = new Farmaco("THC", "MACONHA", cruzamentos1);
//            farmacoRepo.create(farmaco1);
//
//            // Input 2
//            Map<String, Classificacao> cruzamentos2 = new HashMap<>();
//            cruzamentos2.put("LSD", Classificacao.AZUL);
//            cruzamentos2.put("MACONHA", Classificacao.VERDE);
//            cruzamentos2.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos2.put("CAFÉINA", Classificacao.VERDE);
//            cruzamentos2.put("MDMA", Classificacao.VERDE);
//            cruzamentos2.put("KETAMINA", Classificacao.VERDE);
//            cruzamentos2.put("ÁLCOOL", Classificacao.VERDE);
//            cruzamentos2.put("GHB", Classificacao.VERDE);
//            cruzamentos2.put("COCAÍNA", Classificacao.AMARELO);
//            cruzamentos2.put("POPPERS", Classificacao.AMARELO);
//            cruzamentos2.put("VIAGRA", Classificacao.AMARELO);
//
//            Farmaco farmaco2 = new Farmaco("Dietilamida do Ácido Lisérgico", "LSD", cruzamentos2);
//            farmacoRepo.create(farmaco2);
//
//
//            // Input 3
//            Map<String, Classificacao> cruzamentos3 = new HashMap<>();
//            cruzamentos3.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos3.put("MACONHA", Classificacao.VERDE);
//            cruzamentos3.put("CAFEINA", Classificacao.AMARELO);
//            cruzamentos3.put("MDMA", Classificacao.VERDE);
//            cruzamentos3.put("KETAMINA", Classificacao.VERDE);
//            cruzamentos3.put("ÁLCOOL", Classificacao.VERDE);
//            cruzamentos3.put("GHB", Classificacao.VERDE);
//            cruzamentos3.put("COCAÍNA", Classificacao.AMARELO);
//            cruzamentos3.put("POPPERS", Classificacao.VERMELHO);
//            cruzamentos3.put("VIAGRA", Classificacao.VERMELHO);
//
//            Farmaco farmaco3 = new Farmaco("psilocibinos", "COGUMELO", cruzamentos3);
//            farmacoRepo.create(farmaco3);
//
//// Input 4
//            Map<String, Classificacao> cruzamentos4 = new HashMap<>();
//            cruzamentos4.put("CAFÉINA", Classificacao.AZUL);
//            cruzamentos4.put("MACONHA", Classificacao.VERDE);
//            cruzamentos4.put("LSD", Classificacao.VERDE);
//            cruzamentos4.put("COGUMELO", Classificacao.AMARELO);
//            cruzamentos4.put("MDMA", Classificacao.AMARELO);
//            cruzamentos4.put("KETAMINA", Classificacao.AMARELO);
//            cruzamentos4.put("ÁLCOOL", Classificacao.AMARELO);
//            cruzamentos4.put("COCAÍNA", Classificacao.AMARELO);
//            cruzamentos4.put("POPPERS", Classificacao.AMARELO);
//            cruzamentos4.put("VIAGRA", Classificacao.AMARELO);
//
//            Farmaco farmaco4 = new Farmaco("xantinas", "CAFEÍNA", cruzamentos4);
//            farmacoRepo.create(farmaco4);
//
//// Input 5
//            Map<String, Classificacao> cruzamentos5 = new HashMap<>();
//            cruzamentos5.put("MACONHA", Classificacao.VERDE);
//            cruzamentos5.put("LSD", Classificacao.VERDE);
//            cruzamentos5.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos5.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos5.put("MDMA", Classificacao.AZUL);
//            cruzamentos5.put("KETAMINA", Classificacao.AMARELO);
//            cruzamentos5.put("ÁLCOOL", Classificacao.VERMELHO);
//            cruzamentos5.put("GHB", Classificacao.AMARELO);
//            cruzamentos5.put("COCAÍNA", Classificacao.VERMELHO);
//            cruzamentos5.put("POPPERS", Classificacao.VERMELHO);
//            cruzamentos5.put("VIAGRA", Classificacao.AMARELO);
//
//            Farmaco farmaco5 = new Farmaco("metilenodioximetanfetamina", "MDMA", cruzamentos5);
//            farmacoRepo.create(farmaco5);
//
//// Input 6
//            Map<String, Classificacao> cruzamentos6 = new HashMap<>();
//            cruzamentos6.put("MACONHA", Classificacao.VERDE);
//            cruzamentos6.put("LSD", Classificacao.VERDE);
//            cruzamentos6.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos6.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos6.put("MDMA", Classificacao.AMARELO);
//            cruzamentos6.put("KETAMINA", Classificacao.AZUL);
//            cruzamentos6.put("ÁLCOOL", Classificacao.PRETO);
//            cruzamentos6.put("GHB", Classificacao.PRETO);
//            cruzamentos6.put("COCAÍNA", Classificacao.VERMELHO);
//            cruzamentos6.put("POPPERS", Classificacao.VERDE);
//            cruzamentos6.put("VIAGRA", Classificacao.VERDE);
//
//            Farmaco farmaco6 = new Farmaco("KETAMINA", "KETAMINA", cruzamentos6);
//            farmacoRepo.create(farmaco6);
//
//// Input 7
//            Map<String, Classificacao> cruzamentos7 = new HashMap<>();
//            cruzamentos7.put("MACONHA", Classificacao.VERDE);
//            cruzamentos7.put("LSD", Classificacao.VERDE);
//            cruzamentos7.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos7.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos7.put("MDMA", Classificacao.AMARELO);
//            cruzamentos7.put("KETAMINA", Classificacao.PRETO);
//            cruzamentos7.put("ÁLCOOL", Classificacao.AZUL);
//            cruzamentos7.put("GHB", Classificacao.PRETO);
//            cruzamentos7.put("COCAÍNA", Classificacao.VERMELHO);
//            cruzamentos7.put("POPPERS", Classificacao.VERMELHO);
//            cruzamentos7.put("VIAGRA", Classificacao.VERMELHO);
//
//            Farmaco farmaco7 = new Farmaco("etanol", "ÁLCOOL", cruzamentos7);
//            farmacoRepo.create(farmaco7);
//
//            // Input 8
//            Map<String, Classificacao> cruzamentos8 = new HashMap<>();
//            cruzamentos8.put("MACONHA", Classificacao.VERDE);
//            cruzamentos8.put("LSD", Classificacao.VERDE);
//            cruzamentos8.put("COGUMELO", Classificacao.VERDE);
//            cruzamentos8.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos8.put("MDMA", Classificacao.VERMELHO);
//            cruzamentos8.put("KETAMINA", Classificacao.PRETO);
//            cruzamentos8.put("ÁLCOOL", Classificacao.PRETO);
//            cruzamentos8.put("GHB", Classificacao.AZUL);
//            cruzamentos8.put("COCAÍNA", Classificacao.VERMELHO);
//            cruzamentos8.put("POPPERS", Classificacao.VERMELHO);
//            cruzamentos8.put("VIAGRA", Classificacao.VERMELHO);
//
//            Farmaco farmaco8 = new Farmaco("gama-hidroxibutirato","GHB", cruzamentos8);
//            farmacoRepo.create(farmaco8);
//
//            // Input 9
//            Map<String, Classificacao> cruzamentos9 = new HashMap<>();
//            cruzamentos9.put("MACONHA", Classificacao.VERDE);
//            cruzamentos9.put("LSD", Classificacao.AMARELO);
//            cruzamentos9.put("COGUMELO", Classificacao.AMARELO);
//            cruzamentos9.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos9.put("MDMA", Classificacao.VERMELHO);
//            cruzamentos9.put("KETAMINA", Classificacao.VERMELHO);
//            cruzamentos9.put("ÁLCOOL", Classificacao.VERMELHO);
//            cruzamentos9.put("GHB", Classificacao.VERMELHO);
//            cruzamentos9.put("COCAÍNA", Classificacao.AZUL);
//            cruzamentos9.put("POPPERS", Classificacao.PRETO);
//            cruzamentos9.put("VIAGRA", Classificacao.PRETO);
//
//            Farmaco farmaco9 = new Farmaco("COCAÍNA","COCAÍNA", cruzamentos9);
//            farmacoRepo.create(farmaco9);
//
//            // Input 10
//            Map<String, Classificacao> cruzamentos10 = new HashMap<>();
//            cruzamentos10.put("MACONHA", Classificacao.VERDE);
//            cruzamentos10.put("LSD", Classificacao.AMARELO);
//            cruzamentos10.put("COGUMELO", Classificacao.VERMELHO);
//            cruzamentos10.put("CAFÉINA", Classificacao.AMARELO);
//            cruzamentos10.put("MDMA", Classificacao.VERMELHO);
//            cruzamentos10.put("KETAMINA", Classificacao.VERDE);
//            cruzamentos10.put("ÁLCOOL", Classificacao.VERMELHO);
//            cruzamentos10.put("GHB", Classificacao.VERMELHO);
//            cruzamentos10.put("COCAÍNA", Classificacao.PRETO);
//            cruzamentos10.put("POPPERS", Classificacao.AZUL);
//            cruzamentos10.put("VIAGRA", Classificacao.PRETO);
//
//            Farmaco farmaco10 = new Farmaco("nitrito de amila", "POPPERS", cruzamentos10);
//            farmacoRepo.create(farmaco10);
//
//
//            // ----- *** -------
//            entityManager.getTransaction().commit();
//            entityManager.close();
//            factory.close();
//
//        } catch (Exception e) {
//            System.err.println(e);
//        }
//
//    }
//}

