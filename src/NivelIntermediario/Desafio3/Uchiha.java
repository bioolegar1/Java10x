package NivelIntermediario.Desafio3;

public class Uchiha extends Ninja{
        private String habilidadeEspecial;

        public Uchiha (String nome, int idade, String missao, String nivelDificuldade, String statusMissao) {
            super(nome, idade, missao, nivelDificuldade, statusMissao);
            this.habilidadeEspecial = habilidadeEspecial;
        }

    public Uchiha() {
        super();
    }

    @Override
    public void mostrarInformacoes() {
            super.mostrarInformacoes();
        System.out.println("Habilidade de Especial: " + habilidadeEspecial);
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println(nome + " possui a habilidade especial: " + habilidadeEspecial);
    }
}
