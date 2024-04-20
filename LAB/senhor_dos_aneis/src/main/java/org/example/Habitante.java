package org.example;

public abstract class Habitante {
    static int contador;
    private int id;
    private String nome;
    private int idade;
    private float energia;

    Arma arma;
    Habitante(){ //Construtor pra incrementar o contador e alterar o id
        contador++;
        this.id = contador;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getEnergia() {
        return this.energia;
    }

    public void setEnergia(float energia) {
        this.energia = energia;
    }

    void atacar(){
        if(this.arma == null){
            System.out.println("Não há ataque sem arma!");
        }
        else{
            if(this.arma.getMagica() == false){
                System.out.println("Atacou com a arma comum:  " + this.arma.getNomeArma());
                this.energia -= 10;
                System.out.println("Energia do habitante: " + this.energia);
            }
            else{
                System.out.println("Atacou com a arma mágica: " + this.arma.getNomeArma());
                this.energia -= 20;
                System.out.println("Energia do habitante: " + this.energia);
            }
        }

    }

    void mostraInfo(){
        System.out.println();
        System.out.println("ID: " +this.id);
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("Energia: " +this.energia);
    }
}
