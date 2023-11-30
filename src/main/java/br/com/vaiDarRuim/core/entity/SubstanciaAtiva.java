package br.com.vaiDarRuim.core.entity;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "substancia_ativa", discriminatorType = DiscriminatorType.STRING)
//@Table(name="farmaco_enterprise")
public class SubstanciaAtiva {

    @Id
    private String nomeDaSubstancia;

    public SubstanciaAtiva() {
    }

    public SubstanciaAtiva(String nomeDaSubstancia) {
        this.nomeDaSubstancia = nomeDaSubstancia;
    }

    public String getSubstanciaAtiva() {
        return nomeDaSubstancia;
    }

    public void setSubstanciaAtiva(String nomeDaSubstancia) {
        this.nomeDaSubstancia = nomeDaSubstancia;
    }

    @Override
    public String toString() {
        return "SubstanciaAtiva{" +
                "substanciaAtiva='" + nomeDaSubstancia + '\'' +
                '}';
    }
}
