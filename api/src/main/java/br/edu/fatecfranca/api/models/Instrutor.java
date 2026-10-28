package br.edu.fatecfranca.api.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CPF;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;


@Document(collection = "instrutores")

public class Instrutor {
    
    @Id
    private String id;

    @NotBlank(message = "O nome é obrigatório.")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório.")
    @CPF(message = "O CPF informado é inválido.")
    private String cpf;

    @NotBlank(message = "O e-mail é obrigatório.")
    @Email(message = "O e-mail informado é inválido.")
    private String email;

    @NotNull(message = "O valor da hora aula é obrigatório.")
    @Positive(message = "O valor da hora aula deve ser maior que zero.")
    private Double valorHoraAula;

    private List<String> especialidades;

    private List<Endereco> enderecos;

    public Instrutor() {

    }

    public Instrutor(String id, String nome, String cpf, String email, Double valorHoraAula, List<String> especialidades,
            List<Endereco> enderecos) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.valorHoraAula = valorHoraAula;
        this.especialidades = especialidades;
        this.enderecos = enderecos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValorHoraAula() {
        return valorHoraAula;
    }

    public void setValorHoraAula(Double valorHoraAula) {
        this.valorHoraAula = valorHoraAula;
    }

    public List<String> getEspecialidade() {
        return especialidades;
    }

    public void setEspecialidade(List<String> especialidades) {
        this.especialidades = especialidades;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    //*

}
