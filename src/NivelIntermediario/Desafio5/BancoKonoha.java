package NivelIntermediario.Desafio5;

public class BancoKonoha {
    public static void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.consultarSaldo() >= valor) {
            origem.depositar(-valor);
            destino.depositar(valor);
            System.out.println("Transferência de R$ "+ valor+" realizada com sucesso!");
        }else {
            System.out.println("Saldo insuficiente para transferÊncia!");
        }
    }

    public static void main (String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        ContaPoupanca cp = new ContaPoupanca(1000);

        transferir(cc, cp, 200);

        System.out.println("Saldo Conta Corrente: " + cc.consultarSaldo());
        System.out.println("Saldo Conta Poupanca: " + cp.consultarSaldo());
    }
}
