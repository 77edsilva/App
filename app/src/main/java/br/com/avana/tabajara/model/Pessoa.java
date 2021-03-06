package br.com.avana.tabajara.model;

import android.support.annotation.NonNull;

import java.io.Serializable;
import java.util.Collection;

public class Pessoa implements Serializable, Comparable<Pessoa> {

    private String numero;
    private String nome;
    private String cpf;
    private Endereco endereco;
    private String telefone;
    private String email;

    public String getNumero() {
        return this.numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return ( this.getNumero() + " - " + this.getNome());
    }

    @Override
    public int compareTo(@NonNull Pessoa o) {
        return this.getNome().compareTo(o.getNome());
    }
}
