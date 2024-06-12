package org.example;

public class Main {
    public static void main(String[] args) {
        Funcionario[] funcs = new Funcionario[10];

        Funcionario func1 = new Funcionario("Gabriel", "Software", 20);
        Funcionario func2 = new Funcionario("Eduardo", "Software", 32);
        Funcionario func3 = new Funcionario("Gael", "Software", 90);

        funcs[0] = func1;
        funcs[1] = func2;
        funcs[2] = func3;

        try{
            for (int i = 0; i < funcs.length; i++) {
                System.out.println(funcs[i].getNome());
            }
        }
        catch (NullPointerException e){
            System.out.println(e);
            System.out.println("Erro de nullpointer");
        }
    }
}