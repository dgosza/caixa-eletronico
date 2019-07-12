package br.com.bank.online;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //DECLARATION OF VARIABLES AND STUFFS
        Scanner leia = new Scanner(System.in);
        String escolhaOperacao = "ESCOLHA A OPERACÃO QUE DESEJA REALIZAR";
        boolean repeat = true;

        //INICIO DO PROGRAMA
        System.out.println("========================================");
        System.out.println("= BEM VINDO AO CAIXA ELETRONICO BankOn =");
        System.out.println("========================================");
        System.out.println();
        System.out.println(escolhaOperacao);
        while(repeat = true) {
            System.out.println("1 - LOGIN DO CLIENTE");
            System.out.println("2 - CADASTRAR CLIENTE");
            System.out.println("3 - LISTAR CLIENTES");
            System.out.println("4 - REABASTECER CAIXA ELETRONICO");
            int numberChoosen = leia.nextInt();

            //DANDO ERRO NA LINHA ACIMA
            //VER O NUMERO QUE RETORNA NO SOUT PARA RESOLUCAO

            if (numberChoosen != 1 && numberChoosen != 2 && numberChoosen != 3 && numberChoosen != 4) {
                Utilitarios.limpaTela();
                System.out.println("OPÇAO INVALIDA");
                System.out.println("ESCOLHA NOVAMENTE");

            }
            switch (numberChoosen) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    Utilitarios.limpaTela();
                    System.out.println("DIGITE AS CREDENCIAIS DE ACESSO AO CAIXA");
                    System.out.print("Código de Acesso: ");
                    int codigoAcesso = leia.nextInt();

                    System.out.print("Senha de Acesso: ");
                    int senhaAcesso = leia.nextInt();

                    boolean verifica = Admin.verificaAcessoAdmin(codigoAcesso, senhaAcesso);

                    if (verifica == true) {
                        System.out.println("LOGADO COM SUCESSO!!");
                        System.out.println("========================================");
                        System.out.println("====    SALDO DE MOEDAS DO CAIXA    ====");
                        System.out.println("========================================");

                        Notas.moedasDisponiveis();
                        Notas.notasDisponiveis();

                        System.out.println("O QUE DESEJA ABASTECER ?");
                        System.out.println(" 1 - NOTAS");
                        System.out.println(" 2 - MOEDAS");
                        int option= leia.nextInt();

                        switch (option) {
                            case 1:
                                Notas.abastecerNotas();
                                break;
                            case 2:
                                Notas.abastecerMoedas();
                                break;
                        }

                    } else {
                        System.out.println("CREDENCIAIS INVALIDAS!");
                        System.out.println("TENTE NOVAMENTE MAIS TARDE");
                        break;
                    }
                    break;

            }
        }

        leia.close();

    }
}
