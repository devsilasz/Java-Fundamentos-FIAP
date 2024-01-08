package br.com.banco;

public class Conta {

    int agencia;
    int numero;
    double saldo;

    //Construtores
    public Conta() {

    }

    public Conta(int agencia, int numero, double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }

    //Métodos
    public void depositar(double valor) {
        this.saldo = saldo + valor; // this.saldo += valor;

    }

    public void retirar(double valor) {
        this.saldo = saldo - valor;
    }

    //crie metodo retirar

    public double verificarSaldo() {
        return this.saldo;
    }


}
