import java.util.Random;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);

        Random rand = new Random();

        int numGerado, numAdivinhado;

        numGerado = rand.nextInt(10) + 1;

        do{
            System.out.println("Qual número estou pensando: ");
            numAdivinhado = entrada.nextInt();

            if(numAdivinhado > numGerado)
            {
                System.out.println("Errou, o número digitado é maior!");
            }
            else if(numAdivinhado < numGerado){
                System.out.println("Errou, o número digitado é menor! ");
            }

        } while(numGerado != numAdivinhado);

        System.out.println("Parabéns você acertou meu número!");

        entrada.close();
    }
}
