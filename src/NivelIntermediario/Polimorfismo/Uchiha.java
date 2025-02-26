package NivelIntermediario.Polimorfismo;


public class Uchiha extends Ninja  implements SharinganInterface{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    // subscrever o metodo ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " Esse é meu ataque Uchiha, um ataque de fogo" );
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é Sasuke!! e essa é minha tecnica de combate!");    }

    @Override
    public void sharinganAtivado() {
        System.out.println(" O sharingan ativou !!!!");
    }

    @Override
    public void Chidori() {
        System.out.println(nome + " Usou o golpe de Raios Chidori");
    }
}
