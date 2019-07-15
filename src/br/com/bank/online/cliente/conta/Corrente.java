package br.com.bank.online.cliente.conta;

public class Corrente extends Conta {

    private double saldoConta = 6260;
    private int numSaquesEfetuados;

    @Override
    public double saque(double valorSaque) {
        return this.saldoConta = this.saldoConta - valorSaque;
    }

    @Override
    public void saqueConta() {
        super.saqueConta();
        numSaquesEfetuados++;
        System.out.println("Saques Realizados até o moment: "+this.numSaquesEfetuados);
    }

    @Override
    public double getSaldoConta() {
        return this.saldoConta;
    }

    public int getNumSaquesEfetuados() {
        return numSaquesEfetuados;
    }


}
