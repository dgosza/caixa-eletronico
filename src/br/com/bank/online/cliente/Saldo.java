package br.com.bank.online.cliente;

import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;

public class Saldo{

    public void saldo(Corrente corrente, Poupanca poupanca){
        Utilitarios.limpaTela();
        System.out.println("SALDO DA CONTA CORRENTE: R$" + corrente.getSaldoConta()
                + " Número da conta: " + corrente.getNumeroConta());
        System.out.println("SALDO DA CONTA POUPANCA: R$" + poupanca.getSaldoConta()
                + " Número da conta: " + poupanca.getNumeroConta());
    }


}
