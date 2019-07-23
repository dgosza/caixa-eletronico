package br.com.bank.online.cliente.conta;

import br.com.bank.online.Utilitarios;

public class Corrente extends Conta {

    {
        super.setSaldoConta(2500);
    }

    @Override
    public double saque(double valorSaque) {
        return super.saque(valorSaque);
    }

    @Override
    public void saqueConta() {
        Utilitarios.limpaTela();
        System.out.println("SAQUE EM CONTA CORRENTE");
        System.out.println();
        super.saqueConta();
    }

    @Override
    public double getSaldoConta() {
        return super.getSaldoConta();
    }

    @Override
    public void setSaldoConta(double saldoConta) {
        super.setSaldoConta(saldoConta);
    }

    @Override
    public double getValorTotalSaques() {
        return super.getValorTotalSaques();
    }

    @Override
    public void setValorTotalSaques(double valorTotalSaques) {
        super.setValorTotalSaques(valorTotalSaques);
    }

    @Override
    public int getNumSaquesEfetuados() {
        return super.getNumSaquesEfetuados();
    }

    @Override
    public void setNumSaquesEfetuados(int numSaquesEfetuados) {
        super.setNumSaquesEfetuados(numSaquesEfetuados);
    }

    @Override
    public int getNumeroConta() {
        return super.getNumeroConta();
    }

    @Override
    public void setNumeroConta() {
        super.setNumeroConta();
    }

    @Override
    public int getTransferenciasRealizadas() {
        return super.getTransferenciasRealizadas();
    }

    @Override
    public void setTransferenciasRealizadas(int transferenciasRealizadas) {
        super.setTransferenciasRealizadas(transferenciasRealizadas);
    }

    @Override
    public double getTotalTransferenciasRealizadas() {
        return super.getTotalTransferenciasRealizadas();
    }

    @Override
    public void setTotalTransferenciasRealizadas(double totalTransferenciasRealizadas) {
        super.setTotalTransferenciasRealizadas(totalTransferenciasRealizadas);
    }


}
