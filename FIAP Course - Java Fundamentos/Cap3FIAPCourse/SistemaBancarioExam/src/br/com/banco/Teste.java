package br.com.banco;

public class Teste {
    public static void main(String[] args) {

        Conta cc = new Conta();

        cc.agencia = 321;
        cc.saldo = 500.00;
        cc.numero = 123;

        cc.retirar(200);
        cc.depositar(1000);

        Conta cp = new Conta(456, 1500.00, 789);



        System.out.println("Saldo conta corrente: " + cc.verificarSaldo());
        System.out.println("Saldo conta poupança: " + cp.verificarSaldo());


    }
}
