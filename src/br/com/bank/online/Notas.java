package br.com.bank.online;

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

    public static int getNotaCem() {
        return notaCem;
    }

    public static void setNotaCem(int notaCem) {
        Notas.notaCem = notaCem;
    }

    public static int getNotaCinq() {
        return notaCinq;
    }

    public static void setNotaCinq(int notaCinq) {
        Notas.notaCinq = notaCinq;
    }

    public static int getNotaVinte() {
        return notaVinte;
    }

    public static void setNotaVinte(int notaVinte) {
        Notas.notaVinte = notaVinte;
    }

    public static int getNotaDez() {
        return notaDez;
    }

    public static void setNotaDez(int notaDez) {
        Notas.notaDez = notaDez;
    }

    public static int getNotaCinco() {
        return notaCinco;
    }

    public static void setNotaCinco(int notaCinco) {
        Notas.notaCinco = notaCinco;
    }

    public static int getNotaDois() {
        return notaDois;
    }

    public static void setNotaDois(int notaDois) {
        Notas.notaDois = notaDois;
    }

    public static int getMoedaUm() {
        return moedaUm;
    }

    public static void setMoedaUm(int moedaUm) {
        Notas.moedaUm = moedaUm;
    }

    public static int getMoedaCinq() {
        return moedaCinq;
    }

    public static void setMoedaCinq(int moedaCinq) {
        Notas.moedaCinq = moedaCinq;
    }

    public static int getMoedaVinteCinco() {
        return moedaVinteCinco;
    }

    public static void setMoedaVinteCinco(int moedaVinteCinco) {
        Notas.moedaVinteCinco = moedaVinteCinco;
    }

    public static int getMoedaDez() {
        return moedaDez;
    }

    public static void setMoedaDez(int moedaDez) {
        Notas.moedaDez = moedaDez;
    }

    public static int getMoedaCinco() {
        return moedaCinco;
    }

    public static void setMoedaCinco(int moedaCinco) {
        Notas.moedaCinco = moedaCinco;
    }
}
