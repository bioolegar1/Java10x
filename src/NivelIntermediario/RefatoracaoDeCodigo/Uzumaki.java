package NivelIntermediario.RefatoracaoDeCodigo;

public class Uzumaki extends Ninja {

    private BijuENUM bijuENUM;


    public Uzumaki() {
    }

    @Override
    public String getBiju() {
        return (bijuENUM != null) ? bijuENUM.nomeBiju : "Nenhuma";
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, double altura) {
        super(nome, aldeia, idade, numeroDeMissoes, altura);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, double altura, BijuENUM bijuENUM) {
        super(nome, aldeia, idade, numeroDeMissoes, altura);
        this.bijuENUM = bijuENUM;
    }
}
