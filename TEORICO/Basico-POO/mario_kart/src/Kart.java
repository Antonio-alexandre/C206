public class Kart {
    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        this.motor = new Motor();
    }

    void pular(){
        System.out.println("Pulando...");
    }

    void soltarTurbo(){

    }
}
