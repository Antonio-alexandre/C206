public class Zumbi {
    double vida;
    String nome;

    double mostraVida(Zumbi zumbi){
        System.out.println("A vida do zumbi é: " +zumbi.vida);
        return zumbi.vida;
    }

    void transfereVida(Zumbi zumbiAlvo, double quantia){
        zumbiAlvo.vida += quantia;
    }
}
