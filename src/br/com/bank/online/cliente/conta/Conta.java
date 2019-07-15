package br.com.bank.online.cliente.conta;

import java.util.Random;
import java.util.Scanner;

public abstract class Conta {

    private static final double LIMITE_DE_SAQUES = 5;
    private double saldoConta;

    public double saque(double valorSaque) {
        return saldoConta = -valorSaque;
    }

    public void saqueConta() {
        Scanner leia = new Scanner(System.in);
        System.out.println("DIGITE O VALOR PARA O SAQUE");
        double valor = leia.nextDouble();

        double valorAnterior = getSaldoConta();
        saque(valor);

        System.out.println("Saldo Anterior: R$" + valorAnterior);
        System.out.println("Saldo Restante: R$" + getSaldoConta());

    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public static double getLimiteDeSaques() {
        return LIMITE_DE_SAQUES;
    }
}
