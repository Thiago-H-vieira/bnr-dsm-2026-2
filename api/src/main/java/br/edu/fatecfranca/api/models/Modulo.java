package br.edu.fatecfranca.api.models;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Modulo {
    
    @NotBlank(message = "O título é obrigatório.")
    private String titulo;

    @NotBlank(message = "O conteúdo é obrigatório.")
    private String conteudo;

    @NotNull(message = "A carga horária é obrigatória.")
    private String cargaHoraria;

    public Modulo() {

    }

    public Modulo(String titulo, String conteudo, String cargaHoraria) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.cargaHoraria = cargaHoraria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(String cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //*

}
