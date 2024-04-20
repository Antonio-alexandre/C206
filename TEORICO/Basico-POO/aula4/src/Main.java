public class Main {
    public static void main(String[] args) {

        Zumbi zumbi = new Zumbi();

        zumbi.forca = 100;
        zumbi.vida = 200;
        zumbi.altura = 1.50f;
        zumbi.nome = "Chris";


        System.out.println("O nome do Zumbi é: " +zumbi.nome);
        zumbi.andar();
        zumbi.seAlimentar();
    }
}