package NivelIntermediario.Construtores;

public abstract class Hokage {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;


    public abstract void sabedoriaHokage();



    //contrutor sem argumentos
    public Hokage() {

    }

    public Hokage(String nome) {
        this.nome = nome;
    }

    public Hokage(int idade){
        this.idade = idade;
    }

    public Hokage(String nome, int idade, boolean VivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = VivoOuNao;
    }


    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
