package NivelIntermediario.Generics;

public class Main {
    public static void main(String[] args) {

    EquipamentosNinja kunai = new EquipamentosNinja("Kunai de ferro");
    EquipamentosNinja shiriken = new EquipamentosNinja("Shuriken");
    EquipamentosNinja pergaminho = new EquipamentosNinja("Pergaminho");

    BolsaGenerica<EquipamentosNinja> bolsaGenerica = new BolsaGenerica<>();
    bolsaGenerica.adicionarEquipamentos(kunai);
    bolsaGenerica.adicionarEquipamentos(shiriken);
    bolsaGenerica.adicionarEquipamentos(pergaminho);

        System.out.println(bolsaGenerica);

    }
}

