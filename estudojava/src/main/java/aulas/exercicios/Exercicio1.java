package aulas.exercicios;

import java.util.Scanner;

/**
 *  1) Escreva um programa que exiba as seguintes opções e
 *  realize os que se pede em cada uma delas: (switch-case)
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("1 - Adição\n2 - Subtração\n3 - Multiplicação\n4 - Divisão");
        System.out.println("Digite uma opção (1 a 4): ");
        int opção = entrada.nextInt();

        System.out.println("Digite o primeiro valor:");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = entrada.nextDouble();

        switch (opção) {
            case 1 -> {
                double soma = valor1 + valor2;
                System.out.println("O resultado da soma é " + soma);
            }
            case 2 -> {
                double subtracao = valor1 - valor2;
                System.out.println("O resultado da subtração é " + subtracao);
            }
            case 3 -> {
                double multiplicacao = valor1 * valor2;
                System.out.println("O valor da multiplicação é " + multiplicacao);
            }
            case 4 -> {
                double divisao = valor1 / valor2;
                System.out.println("O valor da divisão é " + divisao);
            }
            default -> System.out.println("Você digitou uma operação inválida!");
        }


    }

}
