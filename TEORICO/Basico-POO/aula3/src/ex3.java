import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a NPA do aluno: ");
        int npa = entrada.nextInt();

        if(npa >= 60){
            System.out.println("Passou direto.");
        }
        else{
            System.out.println("Digite a nota da NP3: ");
            int np3 = entrada.nextInt();
            float nfa = (npa + np3)/2.0f;

            if(nfa>=50){
                System.out.println("Passou com NP3.");
            }
            else
            {
                System.out.println("Reprovou.");
            }
        }
    }
}
