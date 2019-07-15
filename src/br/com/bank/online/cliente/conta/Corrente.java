package br.com.bank.online.cliente.conta;

import java.util.Scanner;

public class Corrente extends Conta{

    private double saldoConta = 2560;

    public double saque(double valorSaque){
        return this.saldoConta=-valorSaque;
    }

    public void saqueConta() {
        Scanner leia = new Scanner(System.in);
        System.out.println("DIGITE O SALDO PARA O SAQUE");
        double valor = leia.nextDouble();

        double valorAnterior = getSaldoConta();
        saque(valor);

        System.out.println("Saldo Anterior: R$" + valorAnterior);
        System.out.println("Saldo Restante: R$" + getSaldoConta());


    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

}
