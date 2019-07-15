package br.com.bank.online;

import java.util.Scanner;

public class Notas {

    private static int notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois;
    private static int moedaUm, moedaCinq, moedaVinteCinco, moedaDez, moedaCinco;

    public static void notasDisponiveis() {
        System.out.println("NOTAS DISPONIVEIS NO CAIXA");
        System.out.println("Quantidade notas de R$100: " + Notas.notaCem);
        System.out.println("Quantidade notas de R$50: " + Notas.notaCinq);
        System.out.println("Quantidade notas de R$20: " + Notas.notaVinte);
        System.out.println("Quantidade notas de R$10: " + Notas.notaDez);
        System.out.println("Quantidade notas de R$5: " + Notas.notaCinco);
        System.out.println("Quantidade notas de R$2: " + Notas.notaDois);
        System.out.println();
    }

    public static void moedasDisponiveis() {
        System.out.println("MOEDAS DISPONIVEIS NO CAIXA");
        System.out.println("Quantidade moedas de R$1.00: " + Notas.moedaUm);
        System.out.println("Quantidade moedas de R$0.50: " + Notas.moedaCinq);
        System.out.println("Quantidade moedas de R$0.25: " + Notas.moedaVinteCinco);
        System.out.println("Quantidade moedas de R$0.10: " + Notas.moedaDez);
        System.out.println("Quantidade moedas de R$0.05: " + Notas.moedaCinco);
        System.out.println();
    }

    public static void abastecerNotas(){

        Scanner leia = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("======  ABASTECIMENTO DE NOTAS   =======");
        System.out.println("========================================");

        System.out.print("Digite quantas notas abastecer para R$100.00 => ");
        Notas.setNotaCem(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$50.00 => ");
        Notas.setNotaCinq(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$20.00 => ");
        Notas.setNotaVinte(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$10.00 => ");
        Notas.setNotaDez(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$5.00 => ");
        Notas.setNotaCinco(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$2.00 => ");
        Notas.setNotaDois(leia.nextInt());

        System.out.println("VALOR ALTERADO!");
        System.out.println("NOVOS VALORES");
        Notas.notasDisponiveis();

    }

    public static void abastecerMoedas(){

        Scanner leia = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("======  ABASTECIMENTO DE MOEDAS  =======");
        System.out.println("========================================");

        System.out.print("Digite quantas notas abastecer para R$1.00 => ");
        Notas.setMoedaUm(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$0.50 => ");
        Notas.setMoedaCinq(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$0.25 => ");
        Notas.setMoedaVinteCinco(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$0.10 => ");
        Notas.setMoedaDez(leia.nextInt());

        System.out.print("Digite quantas notas abastecer para R$0.05 => ");
        Notas.setMoedaCinco(leia.nextInt());

        System.out.println("VALOR ALTERADO!");
        System.out.println("NOVOS VALORES");
        Notas.moedasDisponiveis();

    }

    public static void menu(){
        Scanner leia = new Scanner(System.in);
        boolean rep = true;
        System.out.println("LOGADO COM SUCESSO!!");
        System.out.println("=========================");
        System.out.println(" SALDO DE MOEDAS DO CAIXA");
        System.out.println("=========================");

        moedasDisponiveis();
        notasDisponiveis();

        do{
            System.out.println("O QUE DESEJA FAZER ?");
            System.out.println(" 1 - ABASTECER NOTAS");
            System.out.println(" 2 - ABASTECER MOEDAS");
            System.out.println(" 3 - SAIR");
            int option = leia.nextInt();

            if (option != 1 && option != 2 && option != 3) {
                Utilitarios.limpaTela();
                System.out.println("OPÇAO INVALIDA");
                System.out.println("ESCOLHA NOVAMENTE");

            }

            switch (option) {
                case 1:
                    Notas.abastecerNotas();
                    break;
                case 2:
                    Notas.abastecerMoedas();
                    break;
                case 3:
                    rep = false;
                    break;
            }
        }while (rep == true);

    }

    public static int getNotaCem() {
        return notaCem;
    }

    public static void setNotaCem(int notaCem) {
        Notas.notaCem =+ notaCem;
    }

    public static int getNotaCinq() {
        return notaCinq;
    }

    public static void setNotaCinq(int notaCinq) {
        Notas.notaCinq =+ notaCinq;
    }

    public static int getNotaVinte() {
        return notaVinte;
    }

    public static void setNotaVinte(int notaVinte) {
        Notas.notaVinte =+ notaVinte;
    }

    public static int getNotaDez() {
        return notaDez;
    }

    public static void setNotaDez(int notaDez) {
        Notas.notaDez =+ notaDez;
    }

    public static int getNotaCinco() {
        return notaCinco;
    }

    public static void setNotaCinco(int notaCinco) {
        Notas.notaCinco =+ notaCinco;
    }

    public static int getNotaDois() {
        return notaDois;
    }

    public static void setNotaDois(int notaDois) {
        Notas.notaDois =+ notaDois;
    }

    public static int getMoedaUm() {
        return moedaUm;
    }

    public static void setMoedaUm(int moedaUm) {
        Notas.moedaUm =+ moedaUm;
    }

    public static int getMoedaCinq() {
        return moedaCinq;
    }

    public static void setMoedaCinq(int moedaCinq) {
        Notas.moedaCinq =+ moedaCinq;
    }

    public static int getMoedaVinteCinco() {
        return moedaVinteCinco;
    }

    public static void setMoedaVinteCinco(int moedaVinteCinco) {
        Notas.moedaVinteCinco =+ moedaVinteCinco;
    }

    public static int getMoedaDez() {
        return moedaDez;
    }

    public static void setMoedaDez(int moedaDez) {
        Notas.moedaDez =+ moedaDez;
    }

    public static int getMoedaCinco() {
        return moedaCinco;
    }

    public static void setMoedaCinco(int moedaCinco) {
        Notas.moedaCinco =+ moedaCinco;
    }
}
