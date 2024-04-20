package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();

        func1.nome = "Eduardo";
        func1.idade = 20;
        func1.salario = 1100;

        Funcionario func2 = new Funcionario();

        func2.nome = "Gabriel";
        func2.idade = 21;
        func2.salario = 800;

        System.out.println("Saindo com as infos dos funcionários: ");
        System.out.println(func1.nome);
        System.out.println(func1.idade);
        System.out.println(func1.salario);
        System.out.println();
        System.out.println(func2.nome);
        System.out.println(func2.idade);
        System.out.println(func2.salario);

        System.out.println("O salario anual do " + func1.nome + " é " + func1.calculoSalarioAnual());
        System.out.println("O salario anual do " + func2.nome + " é " + func2.calculoSalarioAnual());
    }
}