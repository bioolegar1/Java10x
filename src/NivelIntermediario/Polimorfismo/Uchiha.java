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
        System.out.println("Meu nome é " + nome + " Esse é meu ataque Uchiha, um ataque de fogo, eu ja completei: " + numeroDeMissoesConcluidas );
    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome +"!! e essa é minha tecnica de combate!");    }

    @Override
    public void sharinganAtivado() {
        System.out.println(" O sharingan ativou !!!!");
    }

    @Override
    public void Chidori() {
        System.out.println(nome + " Usou o golpe de Raios Chidori");
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + ", Essa é minha INTELIGENCIA DE COMBATE!!!");
    }


    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi +  " e você é um gênio ");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi +  " e você é ninja promissor ");
        } else {
            System.out.println("Seu QI é: " + qi +  " e você treinar mais suas habilidades ");
        }
    }

    @Override
    void metodoProvisorio() {
        System.out.println("Teste na classe uchiha!");
    }
}
