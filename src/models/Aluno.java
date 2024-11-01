package models;

public class Aluno {
    public int idade;
    public String nome;
    public String curso;

    // public Aluno(int idade, String nome, String curso) {
    // this.idade = idade;
    // this.nome = nome;
    // this.curso = curso;
    // System.out.println("Construtor");
    // }

    // Esse bloco de inicialização é executado antes do construtor
    {
        System.out.println("Bloco de inicialização");
    }

}
