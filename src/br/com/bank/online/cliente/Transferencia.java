package br.com.bank.online.cliente;

import br.com.bank.online.Main;

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

    public static void transfereSaldo(double valor, int conta, int numeroConta){
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
}
