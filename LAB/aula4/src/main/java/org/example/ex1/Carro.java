package org.example.ex1;

public class Carro {
    String nome;
    String cor;
    int ano;
    Motor motor;

    public Carro(String nome, String cor, int ano, int cv){
        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.motor = new Motor(cv);
    }
}
