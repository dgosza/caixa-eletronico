package br.com.bank.online.cliente;

import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;

public class Extrato {

    public void menu(Corrente corrente, Poupanca poupanca) {
        Utilitarios.limpaTela();
        System.out.println("EXTRATO DE SAQUES");
        System.out.println("CONTA CORRENTE");
        System.out.println("SAQUES EFETUADOS: " + corrente.getNumSaquesEfetuados());
        System.out.println("TOTAL EM R$: " + corrente.getValorTotalSaques());
        System.out.println();
        System.out.println("CONTA POUPANCA");
        System.out.println("SAQUES EFETUADOS: " + poupanca.getNumSaquesEfetuados());
        System.out.println("TOTAL EM R$: " + poupanca.getValorTotalSaques());
        System.out.println();
        System.out.println();
        System.out.println("EXTRATO DE TRANSFERENCIAS");
        System.out.println("CONTA CORRENTE");
        System.out.println("TOTAL DE TRANSFERENCIAS REALIZADAS: "+corrente.getTransferenciasRealizadas());
        System.out.println("TOTAL EM R$ EM TRANSFERENCIAS: R$"+corrente.getTotalTransferenciasRealizadas());
        System.out.println();
        System.out.println("CONTA POUPANÇA");
        System.out.println("TOTAL DE TRANSFERENCIAS REALIZADAS: "+poupanca.getTransferenciasRealizadas());
        System.out.println("TOTAL EM R$ EM TRANSFERENCIAS: R$"+poupanca.getTotalTransferenciasRealizadas());
        System.out.println();
        System.out.println();
    }
}
