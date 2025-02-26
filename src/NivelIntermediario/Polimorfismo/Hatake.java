package NivelIntermediario.Polimorfismo;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {

    public void boasVindas(){
        System.out.println( nome + " Eu sou um a hatake!!!");
    };

    @Override
    public void sharinganAtivado() {
        System.out.println( "O sharingan ativou!");
    }
    @Override
    public void ninjaDeElite() {
        System.out.println( nome + " Eu sou caçador Anbu! um ninja de elite!!!");
    }

    @Override
    public void hokageSaudacao() {
        System.out.println(nome + " Agora é o 6º Hokage!");
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void Chidori() {
        System.out.println(nome + " é capaz de Utilizar o chidori!");
    }
}
