package NivelIntermediario.Polimorfismo;


public class Uzumaki extends Ninja  implements estrategiaDeBatalha {
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " Esse é meu ataque Especial, Rasengan !!!" );
    }

}
