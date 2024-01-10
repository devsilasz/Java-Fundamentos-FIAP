package br.com;

public class Teste {
    public static void main(String[] args) {

        Conta contaCorrente = new Conta();

        contaCorrente.agencia = 4002;
        contaCorrente.numero = 40028922;
        contaCorrente.saldo = 800000.50;

        contaCorrente.depositarSaldo(200000);
        contaCorrente.retirarSaldo(1000000);
        System.out.println(contaCorrente.verificarSaldo());

        Conta contaPoupanca = new Conta(800, 700, 51);
        contaPoupanca.retirarSaldo(2000);
        System.out.println(contaPoupanca.verificarSaldo());




    }
}
