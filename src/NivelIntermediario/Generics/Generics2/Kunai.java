package NivelIntermediario.Generics.Generics2;

public class Kunai {
    private String tipo;

    public Kunai(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "Kunai{" +
                "tipo='" + tipo + '\'' +
                '}';
    }
}
