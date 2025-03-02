package NivelIntermediario.ENUMS;

public enum RankDeMissoes {
    D("Baixo", 2),
    C("Moderado", 3),
    B("Confortavel", 4),
    A("Difícil", 5),
    S("Altissima", 12);

    private String descricao;
    private int dificuldade;

    RankDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }
}
