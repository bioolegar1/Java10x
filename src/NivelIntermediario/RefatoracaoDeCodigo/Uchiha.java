package NivelIntermediario.RefatoracaoDeCodigo;

public class Uchiha extends Ninja implements SharinganInterface {

    public Uchiha(){
        super();
    }

    @Override
    public String getBiju() {
        return "Nenhuma";
    }

    public Uchiha(String nome, String aldeia, int idade){
    super(nome,aldeia,idade);
    }


    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, double altura) {
        super(nome, aldeia, idade, numeroDeMissoes, altura);
    }


    /*
    Metodo:
    implementa da interface Sharingan
    */
    @Override
    public void sharinganAtivado() {
        System.out.println("Uchiha: "+getNome()+" Sharingan Ativado");
    }
}
