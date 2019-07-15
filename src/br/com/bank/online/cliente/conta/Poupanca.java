package br.com.bank.online.cliente.conta;

public class Poupança {

    private double saldo = 500;

    public double verificaDebitacao(double valor){
        return saldo - valor;
    }

}
