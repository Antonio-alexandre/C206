public class Main {
    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();

        zumbi.vida = 100;
        zumbi.nome = "Chris";

        Zumbi zumbi1 = new Zumbi();

        zumbi1.vida = 10;
        zumbi1.nome = "Anna";

        double dano = 30;

        zumbi1.mostraVida(zumbi1);
        zumbi.transfereVida(zumbi1, dano);

        zumbi1.mostraVida(zumbi1);
    }
}