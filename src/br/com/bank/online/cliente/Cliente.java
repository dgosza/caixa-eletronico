package br.com.bank.online.cliente;

import br.com.bank.online.Main;
import br.com.bank.online.Utilitarios;
import br.com.bank.online.cliente.conta.Corrente;
import br.com.bank.online.cliente.conta.Poupanca;

import java.util.Scanner;

public class Cliente extends Main {

    private String nome;
    private String cpf;
    private String rg;
    private String login;
    private String senha;

    private Corrente contaCorrente = new Corrente();
    private Poupanca contaPoupanca = new Poupanca();

    private Extrato extrato = new Extrato();
    private Saldo saldo = new Saldo();
    private Saque saque = new Saque();
    private Transferencia transferencia = new Transferencia();
    private EditarDados editarDados = new EditarDados();

    public Cliente(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Cliente() {

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
            System.out.println(" 6 - Sair");
            int opcao = leia.nextInt();

            switch (opcao) {
                case 1:
                    getExtrato().menu(contaCorrente, contaPoupanca);
                    break;
                case 2:
                    getSaldo().saldo(contaCorrente, contaPoupanca);
                    break;
                case 3:
                    getSaque().saque(contaCorrente, contaPoupanca);
                    break;
                case 4:
                    getTransferencia().transferencia(contaCorrente, contaPoupanca);
                    break;
                case 5:
                    getEditarDados().menu(nome, senha);
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

    public Extrato getExtrato() {
        return extrato;
    }

    public void setExtrato(Extrato extrato) {
        this.extrato = extrato;
    }

    public Saldo getSaldo() {
        return saldo;
    }

    public void setSaldo(Saldo saldo) {
        this.saldo = saldo;
    }

    public Saque getSaque() {
        return saque;
    }

    public void setSaque(Saque saque) {
        this.saque = saque;
    }

    public Transferencia getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(Transferencia transferencia) {
        this.transferencia = transferencia;
    }

    public EditarDados getEditarDados() {
        return editarDados;
    }

    public void setEditarDados(EditarDados editarDados) {
        this.editarDados = editarDados;
    }
}
