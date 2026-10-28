package br.edu.fatecfranca.api.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Nota {
    
    @NotBlank(message = "A avaliação é obrigatória.")
    private String avaliacao;

    @NotNull(message = "O valor é obrigatório.")
    private Double valor;

    public Nota() {

    }

    public Nota(String avaliacao, Double valor) {
        this.avaliacao = avaliacao;
        this.valor = valor;
    }


    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    //*

}
