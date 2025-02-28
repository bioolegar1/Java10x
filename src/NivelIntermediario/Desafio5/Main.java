package NivelIntermediario.Desafio5;

public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1000);
        ContaCorrente cp = new ContaCorrente(1000);

        cc.depositar(500);//Depositamos R$ 500 na conta Corrente
        cp.depositar(503);//Depositamos R$ 500 na conta Corrente


        System.out.println("Saldo Conta Corrente: " + cc.consultarSaldo());
        System.out.println("Saldo Conta Poupança: " + cp.consultarSaldo());
    }
}
