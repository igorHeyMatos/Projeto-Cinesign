package br.edu.up.modelos;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private String senha;


    public Pessoa(){
    }
    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
