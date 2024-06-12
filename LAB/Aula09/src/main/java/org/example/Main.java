package org.example;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Conta> contas = new ArrayList<>();

        Conta c1 = new Conta(200, "Romulo");
        Conta c2 = new Conta(100, "Gabriel");
        Conta c3 = new Conta(300, "Eduardo");

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);

        for (int i = 0; i < contas.size(); i++) {
            System.out.println(contas.get(i).getSaldo());
            System.out.println(contas.get(i).getNome());
            System.out.println();
        }
    }
}