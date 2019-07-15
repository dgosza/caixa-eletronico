package br.com.bank.online.cliente;

import br.com.bank.online.cliente.cartao.Cartao;
import br.com.bank.online.cliente.cartao.Credito;
import br.com.bank.online.cliente.cartao.Debito;

import java.util.Scanner;

public class Cliente {

    private String nome;
    private String cpf;
    private String rg;
    private String login;
    private String senha;
    private Debito cartaoDebito;
    private Credito cartaoCredito;


    public Cliente(String nome, String login, String senha) {
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "cliente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", login='" + login + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }

    public boolean validaCliente(String senha){
        if(senha.equals(this.senha)){
            return true;
        }else{
            return false;
        }
    }

    public void menuCliente(){
        System.out.println("MENU DO CLIENTE "+this.nome+" NO BANK ONLINE!");
        Scanner leia = new Scanner(System.in);
        boolean rep = true;

        do{
            System.out.println(" 1 - Extrato Bancário");
            System.out.println(" 2 - Saldo");
            System.out.println(" 3 - Transferência");
            System.out.println(" 4 - Saque");

        }while(rep == true);

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
}
