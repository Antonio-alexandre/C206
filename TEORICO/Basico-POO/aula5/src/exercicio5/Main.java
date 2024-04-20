package exercicio5;

public class Main {
    public static void main(String[] args) {
        Personagem personagem1 = new Personagem();
        personagem1.nome = "Personagem";

        Arma arma1 = new Arma();
        arma1.nome = "Arma1";

        personagem1.arma = arma1; 
    }
}
