package br.com.bank.online.cliente;


import java.util.Scanner;

public class Saque extends Cliente  {

    public Saque(String nome, String login, String senha) {
        super(nome, login, senha);
    }

    public void saqueConta(){
        Scanner leia = new Scanner(System.in);
        System.out.println("Escolha qual conta ira ser debitado o SAQUE");
        System.out.println(" 1 - CONTA CORRENTE");
        System.out.println(" 2 - CONTA POUPANÇA");
        int opcao = leia.nextInt();

        switch (opcao){
            case 1:

                break;
            case 2:
                break;
        }

    }
}
