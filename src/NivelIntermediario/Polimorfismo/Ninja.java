//SUPERCLASSE


package NivelIntermediario.Polimorfismo;

//TODO: Incluir 2 novos atributos: numero de numeroDeMissoesConcluidas, Rank
//TODO: Rank: Gennin, Chunnin, Jounin, hokage


public abstract class Ninja implements estrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    RankNinja rank;




    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga do construtor chamando os novos ATRIBUTOS


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    //metodo Geral!! Todos os Ninjas Vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "Esse é meu ataque especial" );
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
    }


    //metodo abstrato - obrigatório em todas as classes

    public void estrategiaDeBatalhaNinja() {
        System.out.println("essa é minha estrategia de Combate!!");
    }

    //Sobrecarga de metodos -  INTELIGENCIA DE COMBATE



    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + ", Essa é minha INTELIGENCIA DE COMBATE!!!");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi +  "e você é um gênio ");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi +  "e você é ninja promissor ");
        } else {
            System.out.println("Seu QI é: " + qi +  "e você treinar mais suas habilidades ");
        }
    }

    //metodo sem @overrride
    void metodoProvisorio(){
        System.out.println("teste na classe ninja!!");
    }
}


