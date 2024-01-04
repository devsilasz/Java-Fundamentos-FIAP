package com.java;

public class TesteConta {
    public static void main(String[] args) {
            //Objetos
        Conta contaCorrente = new Conta();
        Conta contaPoupanca = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 3000.23;
        contaCorrente.cliente.nome = "Silas";
        contaCorrente.cliente.idade = 18;


        contaPoupanca.numero = 29;
        contaPoupanca.saldo = 0.00;
        contaPoupanca.cliente.nome = "Leandro";
        contaPoupanca.cliente.idade = 20;


        contaInvestimento.numero = 50;
        contaInvestimento.saldo = 503421.00;
        contaInvestimento.cliente.nome = "Roberto";
        contaInvestimento.cliente.idade = 30;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}
