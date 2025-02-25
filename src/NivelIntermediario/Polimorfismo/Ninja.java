//SUPERCLASSE


package NivelIntermediario.Polimorfismo;

public abstract class Ninja implements estrategiaDeBatalha{

    String nome;
    String aldeia;
    int idade;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
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
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("essa é minha estrategia de Combate!!");
    }



}


