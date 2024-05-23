package br.edu.up.modelos;

public class Funcionario extends Pessoa {
    //Adicionar tipo do funcionario
    private double codigo;

    public Funcionario(double codigo) {
        this.codigo = codigo;
    }
    public Funcionario(String nome, String cpf, double codigo) {
        super(nome, cpf);
        this.codigo = codigo;
    }

    public double getCodigo() {
        return codigo;
    }
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }    
}
