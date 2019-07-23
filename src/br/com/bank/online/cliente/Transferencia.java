package br.com.bank.online.cliente;

import br.com.bank.online.Main;
import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;

import java.util.Scanner;

public class Transferencia {

    public static void mostraContasParaTransferencia() {
        for (Cliente cliente : Main.getClientes()) {
            if (cliente != null) {
                System.out.println("Cliente: " + cliente.getNome() + " CPF: " + cliente.getCpf());
                System.out.println("Conta Corrente: " + cliente.getContaCorrente().getNumeroConta());
                System.out.println("Conta Poupança: " + cliente.getContaPoupanca().getNumeroConta());
                System.out.println();
            }
        }
    }

    public static void transfereSaldo(double valor, int conta, int numeroConta) {
        for (Cliente cliente : Main.getClientes()) {
            if (cliente != null) {
                if (conta == 1) {
                    if (cliente.getContaCorrente().getNumeroConta() == numeroConta) {
                        cliente.getContaCorrente().setSaldoConta(valor);
                    }
                } else {
                    if (cliente.getContaPoupanca().getNumeroConta() == numeroConta) {
                        cliente.getContaPoupanca().setSaldoConta(valor);
                    }
                }
            }
        }
    }

    public void transferencia(Corrente corrente, Poupanca poupanca) {
        Scanner leia = new Scanner(System.in);
        Utilitarios.limpaTela();
        System.out.println("Saldo em Conta Corrente: R$" + corrente.getSaldoConta());
        System.out.println("Saldo em Conta Poupança: R$" + poupanca.getSaldoConta());
        System.out.println("Digite em qual tipo de conta irá ser debitado o valor");
        System.out.println(" 1 - CONTA CORRENTE");
        System.out.println(" 2 - CONTA POUPANÇA");
        int opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                Transferencia.mostraContasParaTransferencia();

                System.out.println("Digite qual o tipo de conta do beneficiario que irá RECEBER a transferencia e o numero da conta");
                System.out.println(" 1 - CONTA CORRENTE");
                System.out.println(" 2 - CONTA POUPANÇA");
                System.out.print("TIPO DE CONTA: ");
                int conta = leia.nextInt();

                System.out.print("NUMERO DA CONTA: ");
                int numeroConta = leia.nextInt();

                System.out.println("Digite a quantidade a ser transferida");
                double valor = leia.nextDouble();

                if (valor <= 0 || valor > corrente.getSaldoConta()) {
                    System.out.println("SALDO INVALIDO PARA TRANSFERENCIA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                } else {

                    double valorAnterior = corrente.getSaldoConta();
                    corrente.saque(valor);
                    Transferencia.transfereSaldo(valor, conta, numeroConta);
                    corrente.setTransferenciasRealizadas(1);
                    corrente.setTotalTransferenciasRealizadas(valor);

                    System.out.println("Saldo Anterior: R$" + valorAnterior);
                    System.out.println("Saldo Solicitado: R$" + valor);
                    System.out.println("Saldo Restante: R$" + corrente.getSaldoConta());
                }

                break;
            case 2:
                Transferencia.mostraContasParaTransferencia();

                System.out.println("Digite qual o tipo de conta do beneficiario que irá RECEBER a transferencia e o numero da conta");
                System.out.println(" 1 - CONTA CORRENTE");
                System.out.println(" 2 - CONTA POUPANÇA");
                System.out.print("TIPO DE CONTA: ");
                conta = leia.nextInt();

                System.out.print("NUMERO DA CONTA: ");
                numeroConta = leia.nextInt();

                System.out.println("Digite a quantidade a ser transferida");
                valor = leia.nextDouble();

                if (valor <= 0 || valor > poupanca.getSaldoConta()) {
                    System.out.println("SALDO INVALIDO PARA TRANSFERENCIA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                } else {

                    double valorAnterior = poupanca.getSaldoConta();
                    poupanca.saque(valor);

                    Transferencia.transfereSaldo(valor, conta, numeroConta);
                    poupanca.setTransferenciasRealizadas(1);
                    poupanca.setTotalTransferenciasRealizadas(valor);

                    System.out.println("Saldo Anterior: R$" + valorAnterior);
                    System.out.println("Saldo Solicitado: R$" + valor);
                    System.out.println("Saldo Restante: R$" + corrente.getSaldoConta());
                }
                break;
        }
    }

}
