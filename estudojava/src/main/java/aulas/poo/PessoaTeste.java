package aulas.poo;

// intuito: testar o uso da classe Pessoa
public class PessoaTeste {

    public static void main(String[] args) {
        // new => constrói uma NOVO objeto de Pessoa
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Caio"; //obj.atributo
        pessoa1.sobrenome = "Barros";
        pessoa1.idade = 25;
        pessoa1.peso = 65.0;
        pessoa1.altura = 1.73;

        pessoa1.dizOla();


        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        System.out.println(pessoa2.nome);

        Pessoa pessoa4 = new Pessoa("Pedro", "Gomes", 35, 1.75, 30.5);

        Pessoa recemNascido = new Pessoa("Enzo", "Pereira");

        System.out.println(recemNascido.altura);
        recemNascido.idade++; // envelhecer
        recemNascido.dizOla();

        // chamda de métodos
        pessoa4.dizOla();
        pessoa4.mostrarImc();
        double imcPessoa4 = pessoa4.calculaImc();
        System.out.println(imcPessoa4);
    }
}
