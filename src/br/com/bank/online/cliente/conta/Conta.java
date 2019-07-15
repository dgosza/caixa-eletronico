package br.com.bank.online.cliente.conta;

import java.util.Random;
import java.util.Scanner;

public abstract class Conta {

    private int numeroConta = (int) new Random().nextInt(500) + 1;
    private static final double LIMITE_DE_SAQUES = 5;
    private int numSaquesEfetuados = 0;

    public int getNumeroConta() {
        return numeroConta;
    }


}
