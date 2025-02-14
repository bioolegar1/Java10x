package NivelIntermediario.Polimorfismo;

public class NinjaPoli {

    String nome;
    String aldeia;
    int idade;


    //metodo Geral!! Todos os Ninjas Vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + "Esse é meu ataque especial" );
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
    }

}


