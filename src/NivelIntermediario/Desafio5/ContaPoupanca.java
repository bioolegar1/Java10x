package NivelIntermediario.Desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldoInicial){
        super (saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        double taxa = valor * 0.01; //calculamos 1% de taxa.
        saldo +=(valor - taxa); //Adicionamos o valor com a taxa descontada.
    }

}
