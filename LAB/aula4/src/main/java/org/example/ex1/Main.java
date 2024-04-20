package org.example.ex1;

public class Main {
    public static void main(String[] args) {

        Carro c1 = new Carro("Fusca","Vermelho",2000, 80);

        System.out.println("Nome do carro: " +c1.nome);
        System.out.println("Cor do carro: " +c1.cor);
        System.out.println("Ano do carro: " +c1.ano);
        System.out.println("Cilindradas do carro: " +c1.motor.cv);
    }
}