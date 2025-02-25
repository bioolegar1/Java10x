package NivelIntermediario.Polimorfismo;


public class Uchiha extends Ninja {

    // subscrever o metodo ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "Esse é meu ataque Uchiha, um ataque de fogo" );
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é Sasuke!! e essa é minha tecnica de combate!");    }
}
