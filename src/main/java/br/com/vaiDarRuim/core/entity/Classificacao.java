package br.com.vaiDarRuim.core.entity;

import jakarta.persistence.Entity;

public enum Classificacao {
    AZUL("azul", "mesma substância"),
    VERDE("verde", "seguro de se usar"),
    AMARELO("amarelo", "risco de saúde: médio"),
    VERMELHO("vermelho", "risco de saúde: alto"),
    PRETO("preto", "risco de overdose");

    private final String classificacao;
    private final String value;

    Classificacao(String classificacao, String value) {
        this.classificacao = classificacao;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getClassificacao() {
        return classificacao;
    }
}
