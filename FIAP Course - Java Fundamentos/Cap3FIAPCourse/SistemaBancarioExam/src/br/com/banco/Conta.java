package br.com.banco;

public class Conta {
    int agencia;
    double saldo;
    int numero;

    public Conta() {

    }

    public Conta(int agencia, double saldo, int numero) {
        this.agencia = agencia;
        this.saldo = saldo;
        this.numero = numero;

    }


    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    public void retirar(double valor) {
        this.saldo = saldo - valor;
    }

    public double verificarSaldo() {
        return this.saldo;
    }

}
