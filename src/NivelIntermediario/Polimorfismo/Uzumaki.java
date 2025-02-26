package NivelIntermediario.Polimorfismo;


public class Uzumaki extends Ninja  implements estrategiaDeBatalha {
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " Esse é meu ataque Especial, Rasengan !!!" );
    }


}
