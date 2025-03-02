package NivelIntermediario.ENUMS;

public class Missoes {

    private String nome;
    private RankDeMissoes rank;


    public void exibirDetalhes(){
        System.out.println("Missão: " + nome + "\nRank: " + rank +  "\nDescrição: " + rank.getDescricao() + "\nDificculdade "+ rank.getDificuldade());
    }

    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }


    public String getNome() {
        return nome;
    }

    public RankDeMissoes getRank() {
        return rank;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }
}
