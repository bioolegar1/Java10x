package NivelIntermediario.Desafio5;

public abstract class ContaBancaria  implements Conta{
    protected double saldo;//Guardamos o dinheiro da conta
    protected TipoConta tipo;


    public ContaBancaria(double saldoInicial){
        this.saldo = saldoInicial; //Começamos a conta com um saldo inicial.
        this.tipo = TipoConta.CORRENTE;
    }

    @Override
    public double consultarSaldo() {
        return saldo; //retorna o saldo da conta
    }

    public abstract void depositar(double valor);//cada conta implementa isso do seu jeito.

    public TipoConta getTipo() {
        return tipo;
    }
}