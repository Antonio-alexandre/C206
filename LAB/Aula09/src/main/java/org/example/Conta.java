package org.example;

public class Conta implements Comparable<Conta>{
    private int saldo;
    private String dono;

    Conta(int saldo, String dono){
        this.saldo = saldo;
        this.dono = dono;
    }

    public String getNome() {
        return dono;
    }

    public int getSaldo() {
        return saldo;
    }


    @Override
    public int compareTo(Conta o) {
        return 0;
    }
}
