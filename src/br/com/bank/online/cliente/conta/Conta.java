package br.com.bank.online.cliente.conta;

import br.com.bank.online.Notas;

import java.util.Random;
import java.util.Scanner;

public abstract class Conta {

    private static final double LIMITE_DE_SAQUES = 5;
    private double valorTotalSaques;
    private int numSaquesEfetuados;
    private double saldoConta;
    private int numeroConta;
    private int transferenciasRealizadas;
    private double totalTransferenciasRealizadas;

    {
        setNumeroConta();
    }


    public double saque(double valorSaque) {
        return this.saldoConta = this.saldoConta - valorSaque;
    }

    public void saqueConta() {
        Scanner leia = new Scanner(System.in);
        System.out.println("Saldo: R$" + getSaldoConta());
        System.out.println("Saques já realizados " + getNumSaquesEfetuados());
        System.out.println("Total em saques ja realizado: R$" + getValorTotalSaques());
        System.out.println("DIGITE O VALOR PARA O SAQUE");
        double valor = leia.nextDouble();

        if (valor > saldoConta) {
            System.out.println("Voce nao tem o suficiente para sacar");
            System.out.println("TENTE NOVAMENTE MAIS TARDE");

        } else {
            double valorAnterior = getSaldoConta();
            saque(valor);
            Notas.verificaNotasMoedasParaSaque(valor);
            setValorTotalSaques(valor);
            setNumSaquesEfetuados(1);

            System.out.println("Saldo Anterior: R$" + valorAnterior);
            System.out.println("Saldo Solicitado: R$" + valor);
            System.out.println("Saldo Restante: R$" + getSaldoConta());
        }
    }

    public static double getLimiteDeSaques() {
        return LIMITE_DE_SAQUES;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta += saldoConta;
    }

    public double getValorTotalSaques() {
        return valorTotalSaques;
    }

    public void setValorTotalSaques(double valorTotalSaques) {
        this.valorTotalSaques += valorTotalSaques;
    }

    public int getNumSaquesEfetuados() {
        return numSaquesEfetuados;
    }

    public void setNumSaquesEfetuados(int numSaquesEfetuados) {
        this.numSaquesEfetuados = this.numSaquesEfetuados = numSaquesEfetuados;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta() {
        this.numeroConta = new Random().nextInt(700) + 1;
    }

    public int getTransferenciasRealizadas() {
        return transferenciasRealizadas;
    }

    public void setTransferenciasRealizadas(int transferenciasRealizadas) {
        this.transferenciasRealizadas += transferenciasRealizadas;
    }

    public double getTotalTransferenciasRealizadas() {
        return totalTransferenciasRealizadas;
    }

    public void setTotalTransferenciasRealizadas(double totalTransferenciasRealizadas) {
        this.totalTransferenciasRealizadas += totalTransferenciasRealizadas;
    }

}
