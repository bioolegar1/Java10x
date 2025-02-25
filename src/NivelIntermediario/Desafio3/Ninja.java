package NivelIntermediario.Desafio3;

public class Ninja {
        protected String nome;
        protected int idade;
        protected String missao;
        protected String nivelDificuldade;
        protected String statusMissao;

        public Ninja(String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
            this.nome = nome;
            this.idade = idade;
            this.missao = missao;
            this.nivelDificuldade = nivelDificuldade;
            this.statusMissao = statusMissao;
    }

    public Ninja() {

    }

    public void mostrarInformacoes() {
    }
}