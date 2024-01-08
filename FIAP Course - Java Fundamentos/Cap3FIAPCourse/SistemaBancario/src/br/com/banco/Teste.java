package br.com.banco;

public class Teste {
    public static void main(String[] args) {

        Conta cc = new Conta();
        cc.saldo = 50.00;
        cc.agencia = 123;
        cc.numero = 321;

        cc.depositar(1000);
        cc.retirar(200);
        System.out.println(cc.verificarSaldo());

        Conta cp = new Conta(111, 222,1000);
        cp.retirar(150);
        System.out.println(cp.verificarSaldo());
    }
}
