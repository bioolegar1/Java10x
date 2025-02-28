package NivelIntermediario.Desafio5;

public class ContaCorrente extends ContaBancaria{


    public ContaCorrente(double saldInicial) {
        super(saldInicial);
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }


}
