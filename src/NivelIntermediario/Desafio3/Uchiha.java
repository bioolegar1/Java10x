package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{

    String habiliadeEspecial;

    public void setHabiliadeEspecial(){
        System.out.println("Habilidade de Especial Uchiha");
    }


    public void mostraInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status: " + statusMissao);
        System.out.println("Sharingan !!! " + habiliadeEspecial);
    }


}
