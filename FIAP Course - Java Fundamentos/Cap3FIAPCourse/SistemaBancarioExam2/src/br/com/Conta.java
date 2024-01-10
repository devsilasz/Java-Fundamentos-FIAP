package br.com;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Silas Alves dos Santos
 * @version 1.0
 */



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

    /**
     * Acrescenta valor do saldo da Conta
     * @param valorDepositado valor que será depositado
     */

    public void depositarSaldo(double valorDepositado) {
        saldo = saldo + valorDepositado;
    }

    /**
     * Retira um valor do saldo da Conta
     * @param valorRetirado valor que será retirado
     */

    public void retirarSaldo(double valorRetirado) {
        saldo = saldo - valorRetirado;
    }


    /**
     *
     * @return Valor do Saldo da Conta
     */
    public double verificarSaldo() {
        return this.saldo;
    }




}
