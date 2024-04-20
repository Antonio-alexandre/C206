package org.example;

public class Funcionario {
    String nome;
    int idade;
    double salario;

    double calculoSalarioAnual(){
        return salario *= 12;
    }
}
