import java.util.Scanner;

public class EstudoArrays {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println(numeros.length); // tamanho do array
        numeros[3] = 1000;
        System.out.println(numeros[3]);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("A posição " + i + "com valor de " + numeros[i]);
        }

        int[] numeros2 = new int[50]; //0..49
        numeros2[0] = 500;
        numeros2[1] = -200;
        // ...
        numeros2[49] = 1;

        double[] notas = new double[5];
        String[] nomes = {"José Almir", "Renato Pereira", "Victor Icoma"};
        String[] sobrenomes = new String[10];

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int quantidade = entrada.nextInt();
        boolean[] valores = new boolean[quantidade];


        // Exemplo
        System.out.println("Digite o total de notas: ");
        int totalNotas = entrada.nextInt(); // 5
        entrada.nextLine();

        double[] notasProva = new double[totalNotas]; // 0..4

        for (int i = 0; i < totalNotas; i++){
            System.out.println("Digite o valor da nota: ");
            notasProva[i] = entrada.nextDouble();
        }

        double soma = 0.0;
        for(double nota : notasProva) {
            soma += nota;
        }

        double media = soma / notasProva.length;

        //condição ternária
        String mensagem = (soma < 7) ? "Você está reprovado" : "Você está aprovado";
        System.out.println(mensagem);

        //default values
        int numero; //padrao = 0
        double nota2; //padrao = 0.0
        long populacao; //padrao = 0
        boolean teste; //padrap = false

        // Classe String
        String nome; //null => ausencia de objeto na variavel

        // wrapper classes
        Integer numero2 = 1;
        Double nota3 = 1.0;
        Long pop2 = 1L;
        Boolean teste2 = false;
    }
}
