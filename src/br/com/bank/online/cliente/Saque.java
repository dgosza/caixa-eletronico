package br.com.bank.online.cliente;

import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.conta.Conta;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;

import java.util.Scanner;

public class Saque{

    public void saque(Corrente corrente, Poupanca poupanca) {
        Scanner leia = new Scanner(System.in);
        Utilitarios.limpaTela();
        System.out.println("ATENÇÂO: LIMITE DE 5 SAQUES REALIZADOS POR DIA PARA CADA TIPO DE CONTA!");
        System.out.println("Escolha qual conta ira ser debitado o SAQUE");
        System.out.println(" 1 - CONTA CORRENTE");
        System.out.println(" 2 - CONTA POUPANÇA");
        System.out.println(" 3 - SAIR");
        int opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                if (corrente.getNumSaquesEfetuados() >= Conta.getLimiteDeSaques()) {
                    System.out.println("LIMITE DE " + Conta.getLimiteDeSaques() + " SAQUES DIARIOS REALIZADOS");
                    System.out.println("VOLTE UM OUTRO DIA");
                } else {
                    corrente.saqueConta();
                }
                break;
            case 2:
                if (poupanca.getNumSaquesEfetuados() >= Conta.getLimiteDeSaques()) {
                    System.out.println("LIMITE DE " + Conta.getLimiteDeSaques() + " SAQUES DIARIOS REALIZADOS");
                    System.out.println("VOLTE UM OUTRO DIA");
                } else {
                    poupanca.saqueConta();
                }
                break;
            case 3:
                break;
        }

    }
}
