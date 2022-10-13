import java.util.Scanner;


public class Aluno {
    public static void main (String [] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome:");

        String nome = entrada.nextLine();



        for (int i = 1; i <= 3; i++){
            System.out.println("Digite a nota " + i);
            double[] notas = new double[i];
            System.out.println(notas[i]);
        }


    }
}



