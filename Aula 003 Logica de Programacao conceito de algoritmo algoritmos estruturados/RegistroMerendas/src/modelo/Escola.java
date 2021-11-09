/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author João Marcos
 */
public class Escola {
    
    private int idEscola;
    private String nome;
    private String rua;
    private int numero;
    private String CEP;
    private String bairro;
    private String telefone;
    private String diretor;

    public Escola() {
    }
    
    public Escola(String nome, String rua, int numero, String CEP, String bairro, String telefone, String diretor) {
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.bairro = bairro;
        this.telefone = telefone;
        this.diretor = diretor;
    }
    
    public Escola(int idEscola, String nome, String rua, int numero, String CEP, String bairro, String telefone, String diretor) {
        this.idEscola = idEscola;
        this.nome = nome;
        this.rua = rua;
        this.numero = numero;
        this.CEP = CEP;
        this.bairro = bairro;
        this.telefone = telefone;
        this.diretor = diretor;
    }
    
    public int getIdEscola() {
        return idEscola;
    }

    public void setIdEscola(int idEscola) {
        this.idEscola = idEscola;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    
}
