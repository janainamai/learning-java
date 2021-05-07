package br.com.janaina.devdojo.Eheranca.domain;

public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa.");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1.");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2.");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor da pessoa.");
        this.nome = nome;
    }

    public void Imprimir() {
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua() + " " + this.endereco.getCep());
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
}