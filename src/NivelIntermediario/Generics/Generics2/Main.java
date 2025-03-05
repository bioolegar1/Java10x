package NivelIntermediario.Generics.Generics2;

public class Main {
    public static void main(String[] args) {

    BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
    bolsaNinja.adicionarItem(new Kunai("Explosiva!"));
    bolsaNinja.adicionarItem(new Kunai("Ferro!"));
    bolsaNinja.adicionarItem(new Kunai("Plástico!"));
    bolsaNinja.adicionarItem(new Pergaminho("Selamento!"));
    bolsaNinja.adicionarItem(new Pergaminho("Invocação!"));
    bolsaNinja.adicionarItem(new Pergaminho("Explosivo!"));
    bolsaNinja.adicionarItem(new Shuriken(12));
    bolsaNinja.adicionarItem(new Shuriken(5));
    bolsaNinja.adicionarItem(new Shuriken(3));
        System.out.println("Itens da  Bolsa Ninja:");
    bolsaNinja.mostrarItens();
    }
}
