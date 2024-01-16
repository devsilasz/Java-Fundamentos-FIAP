package br.com;
import java.io.Serializable;
/**
 * Classe que abstrai uma Conta Bancária
 * @author Silas Alves dos Santos 
 */



public class Conta implements Serializable {

    private static final long serialVersionUID = 1L;
    private int agencia;
    private double saldo;
    private int numero;

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

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
