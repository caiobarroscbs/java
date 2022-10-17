package aulas.poo;

public class Pessoa {
    // Propriedades/atributos de uma pessoa
    String nome;
    String sobrenome;
    int idade;
    double altura;
    double peso;

    Pessoa() {
        // this => representa o objeto
        this.nome = "Caio";
        this.sobrenome = "Barros";
        this.idade = 25;
        this.peso = 65.0;
        this.altura = 1.73;

    }

    Pessoa(String nome, String sobrenome, int idade, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = 0;
        this.peso = 0.5;
        this.altura = 2.0;
    }


        // Ações de uma Pessoa (métodos)
    void dizOla() {
        System.out.println("Olá, tudo bem? Meu nome é " + this.nome );
    }

    void mostrarImc() { // DEVE retornar um valor
        double imc = this.calculaImc();
        System.out.println("O seu imc é " + imc);
    }

    double calculaImc() { // DEVE retornar um valor
        double imc = this.peso / (this.altura * this.altura);
        return imc;
    }

    void comer(String comida) {
        System.out.println("Estou comendo " + comida);
    }

}
