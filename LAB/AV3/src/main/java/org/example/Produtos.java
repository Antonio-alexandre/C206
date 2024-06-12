package org.example;

public class Produtos implements Comparable<Produtos>{
    private String nome;
    private double preco;
    private String tipo;



    public void mostrarInfo(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Tipo: " + this.tipo);
    }

    @Override
    public int compareTo(Produtos p) {
        return Double.compare(this.preco, p.getPreco());
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
