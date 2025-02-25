package NivelIntermediario.Desafio4;

public class NinjaBasico  implements Ninja{
    protected String nome;
    protected int idade;
    protected String habilidade;


    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }


    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }


    @Override
    public void executarHabilidade() {
        System.out.println(nome + "Está executando habilidade" + habilidade);
    }
}
