package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    //Criar um metodo publico personalizado

    //O metodo void n retorna valor algum
    public void SharinganAtivado() {
        System.out.println("O sharingan Ativou!!!");
    }

    //metodo string - retorna uma string
    public String euSouUmNinja () {
        return "Oi eu sou um ninja";
    }


    //metodo int retorna um int
    public  int anosParaSeTornarHokage (int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage-idade;
    }


}
