package br.com;

public class Teste {
    public static void main(String[] args) {

        Conta contaCorrente = new Conta();

        contaCorrente.depositarSaldo(50.0);
        contaCorrente.setAgencia(40028922);
        contaCorrente.setNumero(8922);


        System.out.println(contaCorrente.getSaldo());

        Conta contaPoupanca = new Conta(800, 700, 51);
        contaPoupanca.retirarSaldo(2000);
        System.out.println(contaPoupanca.getSaldo());




    }
}
