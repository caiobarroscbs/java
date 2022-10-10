import javax.sound.midi.Soundbank;
import java.util.Scanner;


public class CalculadoraIMC {
    public static void main(String [] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual seu nome ?");
        String nome = entrada.nextLine();

        System.out.println("Qual sua idade ?");
        int idade = entrada.nextInt();

        System.out.println("Qual sua altura (m)?");
        double altura = entrada.nextDouble();

        System.out.println("Qual seu peso? (kg)");
        double peso = entrada.nextDouble();

        // calcule o imc = peso / altura
        double imc = peso / (altura * altura); //p peso / Math.pow(altura,2)

        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos!");
        System.out.println("Este é o seu IMC = " + imc);
        System.out.printf("Este é o seu IMC = %.2f\n", imc);
        System.out.printf("Olá, meu nome é %s e tenho %d anos!\n", nome, idade);




    }
}
