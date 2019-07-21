package br.com.bank.online;

import java.util.Locale;
import java.util.Scanner;

public class Notas {

    private static int notaCem, notaCinq, notaVinte, notaDez, notaCinco, notaDois;
    private static int moedaUm, moedaCinq, moedaVinteCinco, moedaDez, moedaCinco;

    static {
        //INICIANDO O SALDO DE NOTAS E MODAS DO CAIXA ELETRONICO

        //NOTAS
        setNotaCem(200);
        setNotaCinq(100);
        setNotaVinte(100);
        setNotaDez(70);
        setNotaCinco(70);
        setNotaDois(70);

        //MOEDAS
        setMoedaUm(100);
        setMoedaCinq(100);
        setMoedaVinteCinco(100);
        setMoedaDez(100);
        setMoedaCinco(100);

    }

    public static void notasDisponiveis() {
        System.out.println("NOTAS DISPONIVEIS NO CAIXA");
        System.out.println("Quantidade notas de R$100: " + getNotaCem());
        System.out.println("Quantidade notas de R$50: " + getNotaCinq());
        System.out.println("Quantidade notas de R$20: " + getNotaVinte());
        System.out.println("Quantidade notas de R$10: " + getNotaDez());
        System.out.println("Quantidade notas de R$5: " + getNotaCinco());
        System.out.println("Quantidade notas de R$2: " + getNotaDois());
        System.out.println();
    }

    public static void moedasDisponiveis() {
        System.out.println("MOEDAS DISPONIVEIS NO CAIXA");
        System.out.println("Quantidade moedas de R$1.00: " + getMoedaUm());
        System.out.println("Quantidade moedas de R$0.50: " + getMoedaCinq());
        System.out.println("Quantidade moedas de R$0.25: " + getMoedaVinteCinco());
        System.out.println("Quantidade moedas de R$0.10: " + getMoedaDez());
        System.out.println("Quantidade moedas de R$0.05: " + getMoedaCinco());
        System.out.println();
    }

    public static void abastecerNotas() {

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

        System.out.println("valor ALTERADO!");
        System.out.println("NOVOS valorES");
        Notas.notasDisponiveis();

    }

    public static void abastecerMoedas() {

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

        System.out.println("valor ALTERADO!");
        System.out.println("NOVOS valorES");
        Notas.moedasDisponiveis();

    }

    public static void verificaNotasMoedasParaSaque(double valor) {

        int notaCem = 0, notaCinq = 0, notaVinte = 0, notaDez = 0, notaCinco = 0, notaDois = 0;
        int moedaUm, moedaCinq, moedaVinteCinco, moedaDez, moedaCinco;

        //CONTAGEM DE NOTAS
        notaCem = (int) valor / 100;
        valor = valor % 100.00;

        notaCinq = (int) valor / 50;
        valor = valor % 50.00;

        notaVinte = (int) valor / 20;
        valor = valor % 20.00;

        notaDez = (int) valor / 10;
        valor = valor % 10.00;

        notaCinco = (int) valor / 5;
        valor = valor % 5.00;

        notaDois = (int) valor / 2;
        valor = valor % 2.00;

        //CONTAGEM DE MOEDAS
        moedaUm = (int) valor / 1;
        valor = valor % 1.00;

        moedaCinq = (int) valor / 50;
        valor = valor % 0.50;

        moedaVinteCinco = (int) valor / 25;
        valor = valor % 0.25;

        moedaDez = (int) valor / 10;
        valor = valor % 0.10;

        moedaCinco = (int) valor / 5;
        valor = valor % 0.5;

        //DESCONTA NOTAS E MOEDAS RETIRADAS DO SAQUE DO CAIXA ELETRONICO
        Notas.notaCem = Notas.notaCem - notaCem;
        Notas.notaCinq = Notas.notaCinq - notaCinq;
        Notas.notaVinte = Notas.notaVinte - notaVinte;
        Notas.notaDez = Notas.notaDez - notaDez;
        Notas.notaCinco = Notas.notaCinco - notaCinco;
        Notas.notaDois = Notas.notaDois - notaDois;

        Notas.moedaUm = Notas.moedaUm - moedaUm;
        Notas.moedaCinq = Notas.moedaCinq - moedaCinq;
        Notas.moedaVinteCinco = Notas.moedaVinteCinco - moedaVinteCinco;
        Notas.moedaDez = Notas.moedaDez - moedaDez;
        Notas.moedaCinco = Notas.moedaCinco - moedaCinco;

        //RETORNA A QUANTIDADE DE NOTAS E MOEDAS DO SAQUE
        System.out.println("NOTAS SACADAS");
        System.out.println("Nota de R$100,00: " + notaCem);
        System.out.println("Nota de R$50,00: " + notaCinq);
        System.out.println("Nota de R$20,00: " + notaVinte);
        System.out.println("Nota de R$10,00: " + notaDez);
        System.out.println("Nota de R$5,00: " + notaCinco);
        System.out.println("Nota de R$2,00: " + notaDois);
        System.out.println();
        System.out.println("MOEDAS SACADAS");
        System.out.println("Moeda de R$1.00: " + moedaUm);
        System.out.println("Moeda de R$0.50: " + moedaCinq);
        System.out.println("Moeda de R$0.25: " + moedaVinteCinco);
        System.out.println("Moeda de R$0.10: " + moedaDez);
        System.out.println("Moeda de R$0.05: " + moedaCinco);
    }

    public static void menu() {
        Scanner leia = new Scanner(System.in);
        boolean rep = true;
        System.out.println("LOGADO COM SUCESSO!!");
        System.out.println("Bem vindo novamente " + Admin.getNomeAdministrador());
        System.out.println("=========================");
        System.out.println(" SALDO DE MOEDAS E NOTAS DO CAIXA");
        System.out.println("=========================");

        moedasDisponiveis();
        notasDisponiveis();

        do {
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
        } while (rep == true);

    }

    public static int getNotaCem() {
        return notaCem;
    }

    public static void setNotaCem(int notaCem) {
        Notas.notaCem = +notaCem;
    }

    public static int getNotaCinq() {
        return notaCinq;
    }

    public static void setNotaCinq(int notaCinq) {
        Notas.notaCinq = +notaCinq;
    }

    public static int getNotaVinte() {
        return notaVinte;
    }

    public static void setNotaVinte(int notaVinte) {
        Notas.notaVinte = +notaVinte;
    }

    public static int getNotaDez() {
        return notaDez;
    }

    public static void setNotaDez(int notaDez) {
        Notas.notaDez = +notaDez;
    }

    public static int getNotaCinco() {
        return notaCinco;
    }

    public static void setNotaCinco(int notaCinco) {
        Notas.notaCinco = +notaCinco;
    }

    public static int getNotaDois() {
        return notaDois;
    }

    public static void setNotaDois(int notaDois) {
        Notas.notaDois = +notaDois;
    }

    public static int getMoedaUm() {
        return moedaUm;
    }

    public static void setMoedaUm(int moedaUm) {
        Notas.moedaUm = +moedaUm;
    }

    public static int getMoedaCinq() {
        return moedaCinq;
    }

    public static void setMoedaCinq(int moedaCinq) {
        Notas.moedaCinq = +moedaCinq;
    }

    public static int getMoedaVinteCinco() {
        return moedaVinteCinco;
    }

    public static void setMoedaVinteCinco(int moedaVinteCinco) {
        Notas.moedaVinteCinco = +moedaVinteCinco;
    }

    public static int getMoedaDez() {
        return moedaDez;
    }

    public static void setMoedaDez(int moedaDez) {
        Notas.moedaDez = +moedaDez;
    }

    public static int getMoedaCinco() {
        return moedaCinco;
    }

    public static void setMoedaCinco(int moedaCinco) {
        Notas.moedaCinco = +moedaCinco;
    }
}
