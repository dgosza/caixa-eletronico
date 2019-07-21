package br.com.bank.online.cliente;

import br.com.bank.online.Main;
import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.cartao.Credito;
import br.com.bank.online.cliente.cartao.Debito;
import br.com.bank.online.cliente.conta.Conta;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Cliente extends Main {

    private String nome;
    private String cpf;
    private String rg;
    private String login;
    private String senha;

    private Debito cartaoDebito;
    private Credito cartaoCredito;
    private Corrente contaCorrente = new Corrente();
    private Poupanca contaPoupanca = new Poupanca();

    public Cliente(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return
                "Cliente: " + nome +
                        ", CPF: " + cpf +
                        ", RG: " + rg +
                        ", Login: " + login +
                        ", Senha: " + senha
                ;
    }

    public boolean validaCliente(String senha) {
        if (senha.equals(this.senha)) {
            return true;
        } else {
            return false;
        }
    }

    public void menuCliente() {
        Utilitarios.limpaTela();
        System.out.println("MENU DO CLIENTE " + this.nome + " NO BANK ONLINE!");
        Scanner leia = new Scanner(System.in);
        boolean rep = true;

        do {
            System.out.println(" 1 - Extrato Bancário");
            System.out.println(" 2 - Saldo");
            System.out.println(" 3 - Saque");
            System.out.println(" 4 - Transferência");
            System.out.println(" 5 - Editar Dados");
            System.out.println(" 5 - Sair");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("EXTRATO DE SAQUES");
                    System.out.println("CONTA CORRENTE");
                    System.out.println("SAQUES EFETUADOS: " + getContaCorrente().getNumSaquesEfetuados());
                    System.out.println("TOTAL EM R$: " + getContaCorrente().getValorTotalSaques());
                    System.out.println();
                    System.out.println("CONTA POUPANCA");
                    System.out.println("SAQUES EFETUADOS: " + getContaPoupanca().getNumSaquesEfetuados());
                    System.out.println("TOTAL EM R$: " + getContaPoupanca().getValorTotalSaques());

                    //EXTRATO DE TRANSFERENCIA FAZER!!
                    break;
                case 2:
                    System.out.println("SALDO DA CONTA CORRENTE: R$" + getContaCorrente().getSaldoConta());
                    System.out.println("SALDO DA CONTA POUPANCA: R$" + getContaPoupanca().getSaldoConta());
                    break;
                case 3:
                    System.out.println("ATENÇÂO: LIMITE DE 5 SAQUES REALIZADOS POR DIA PARA CADA TIPO DE CONTA!");
                    System.out.println("Escolha qual conta ira ser debitado o SAQUE");
                    System.out.println(" 1 - CONTA CORRENTE");
                    System.out.println(" 2 - CONTA POUPANÇA");
                    System.out.println(" 3 - SAIR");
                    opcao = leia.nextInt();

                    switch (opcao) {
                        case 1:
                            if (getContaCorrente().getNumSaquesEfetuados() >= Conta.getLimiteDeSaques()) {
                                System.out.println("LIMITE DE " + Conta.getLimiteDeSaques() + " SAQUES DIARIOS REALIZADOS");
                                System.out.println("VOLTE UM OUTRO DIA");
                            } else {
                                getContaCorrente().saqueConta();
                            }
                            break;
                        case 2:
                            if (getContaPoupanca().getNumSaquesEfetuados() >= Conta.getLimiteDeSaques()) {
                                System.out.println("LIMITE DE " + Conta.getLimiteDeSaques() + " SAQUES DIARIOS REALIZADOS");
                                System.out.println("VOLTE UM OUTRO DIA");
                            } else {
                                getContaPoupanca().saqueConta();
                            }
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 4:
                    Utilitarios.limpaTela();
                    System.out.println("TRANSFERENCIA ENTRE CONTAS");
                    System.out.println("Escolha a conta abaixo para qual voce quer transferir o dinheiro");

                    for (Cliente cliente : Main.getClientes()) {
                        if (cliente != null) {
                            System.out.println(cliente);
                        }
                    }

                    //FAZER A TRANSAÇÃO DE DINHEIRO ENTRE OBJETOS DE CLIENTE DIFERENTE
                    //HEHE!

                    break;
                case 5:
                    Utilitarios.limpaTela();
                    System.out.println("EDITAR DADOS DO CLIENTE "+getNome());
                    break;
                case 6:
                    rep = false;
                    break;
            }

        } while (rep == true);

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Debito getCartaoDebito() {
        return cartaoDebito;
    }

    public void setCartaoDebito(Debito cartaoDebito) {
        this.cartaoDebito = cartaoDebito;
    }

    public Credito getCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(Credito cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public Corrente getContaCorrente() {
        return contaCorrente;
    }

    public void setContaCorrente(Corrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }

    public Poupanca getContaPoupanca() {
        return contaPoupanca;
    }

    public void setContaPoupanca(Poupanca contaPoupanca) {
        this.contaPoupanca = contaPoupanca;
    }
}
