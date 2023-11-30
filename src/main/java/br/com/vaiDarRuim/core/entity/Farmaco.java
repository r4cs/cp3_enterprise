package br.com.vaiDarRuim.core.entity;

import jakarta.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity()
@Table(name="farmaco_enterprise", uniqueConstraints = @UniqueConstraint(
        name = "NOME_DA_SUBSTANCIA_UK", columnNames = "nomeDaSubstancia"
))
public class Farmaco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long farmaco_id;

    @Column(nullable = false)
    private String nomeDaSubstancia;

    @Column(nullable = true)
    @ElementCollection
    @CollectionTable(name = "farmaco_cruzamentos_enterprise", joinColumns = @JoinColumn(name="farmaco_id"))
    @Enumerated(EnumType.STRING)
    private Map<String, Classificacao> cruzamentos = new HashMap<>();

    public Farmaco() {}

    public Farmaco(String nomeDaSubstancia, Map<String, Classificacao> cruzamentos) {
        this.nomeDaSubstancia = nomeDaSubstancia.toUpperCase();
        this.cruzamentos = cruzamentos;
    }

    public Long getFarmacoId() {
        return farmaco_id;
    }

    public String getNomeDaSubstancia() {
        return nomeDaSubstancia;
    }

    public void setNomeDaSubstancia(String name) {
        this.nomeDaSubstancia = name.toUpperCase();
    }

    public Map<String, Classificacao> getCruzamentos() {
        return cruzamentos;
    }

    public void setCruzamentos(Map<String, Classificacao> cruzamentos) {
        this.cruzamentos = cruzamentos;
    }

    @Override
    public String toString() {
        return "Farmaco{" +
                "\nid=" + farmaco_id +
                "\nnome da substância='" + nomeDaSubstancia + '\'' +
                "\ncruzamentos=" + cruzamentos +
                "\n}";
    }
}
