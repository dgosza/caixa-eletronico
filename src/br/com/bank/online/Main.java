package br.com.bank.online;

import br.com.bank.online.cliente.Cliente;

import java.util.Scanner;

public class Main {

    //NUMERO DE CLIENTES PERMITIDOS NO SISTEMA
    static Cliente[] clientes = new Cliente[5];

    //PROGRAMA INICIA JA COM DOIS CADASTROS, EVITANDO ASSIM O WORKFLOW REPETITIVO
    static {
        clientes[0] = new Cliente("diego", "diego", "diego");
        clientes[1] = new Cliente("nat", "nat", "nat");
    }

    public static void main(String[] args) {

        boolean repeat = true;

        //INICIO DO PROGRAMA
        System.out.println("========================================");
        System.out.println(" BEM VINDO AO CAIXA ELETRONICO BANKON");
        System.out.println("========================================");
        System.out.println();
        System.out.println("ESCOLHA A OPERAÇAO QUE DESEJA REALIZAR");

        do {
            Scanner leia = new Scanner(System.in);
            System.out.println("1 - LOGIN DO CLIENTE");
            System.out.println("2 - CADASTRAR CLIENTE");
            System.out.println("3 - LISTAR CLIENTES");
            System.out.println("4 - CAIXA ELETRONICO");
            System.out.println("5 - SAIR");

            int numberChoosen = leia.nextInt();

            if (numberChoosen != 1 && numberChoosen != 2 && numberChoosen != 3 && numberChoosen != 4 && numberChoosen != 5) {
                Utilitarios.limpaTela();
                System.out.println("OPÇAO INVALIDA");
                System.out.println("ESCOLHA NOVAMENTE");

            }

            switch (numberChoosen) {
                case 1:
                    Utilitarios.limpaTela();
                    System.out.println("LOGIN DO CLIENTE");
                    int count = 0;
                    for (Cliente cliente : clientes) {
                        if (cliente != null) {
                            System.out.println("Posição: " + count + " - " + cliente);
                            count++;
                        } else {
                            System.out.println("NÃO HA NENHUM CLIENTE CADASTRADO NESTA POSIÇÃO");

                        }
                    }

                    System.out.println("Digite a posição referente ao seu login ou digite '05' para sair");
                    int posicaoLogin = leia.nextInt();
                    if (posicaoLogin == 05) {
                        break;
                    } else if (posicaoLogin != 05 && posicaoLogin != 0 && posicaoLogin != 1 && posicaoLogin != 2 && posicaoLogin != 3
                            && posicaoLogin != 4) {
                        System.out.println("POSIÇÃO INVALIDA");
                        System.out.println("TENTE NOVAMENTE MAIS TARDE");
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Login: " + clientes[posicaoLogin].getLogin());
                        System.out.println("Digite a senha para a conta acima");
                        System.out.print("Senha: ");
                        String senhaLogin = leia.next();

                        boolean verifica = clientes[posicaoLogin].validaCliente(senhaLogin);

                        if (verifica == true) {
                            clientes[posicaoLogin].menuCliente();
                        } else {
                            System.out.println("Login invalido");
                            System.out.println("Tente novamente mais tarde");
                        }
                        break;
                    }
                case 2:
                    Utilitarios.limpaTela();
                    System.out.println("CADASTRO DE CLIENTES DO CAIXA ELETRONICO");
                    int countVagas = 0;
                    for (Cliente cliente : clientes) {
                        if (cliente == null) {
                            countVagas++;
                        }
                    }
                    System.out.println("NUMERO MAXIMO DE CLIENTES CADASTRADOS NO SISTEMA: " + clientes.length);
                    System.out.println("TEMOS " + countVagas + " CADASTROS VAGOS");

                    if (countVagas <= 0) {
                        System.out.println("NÃO SERA POSSIVEL CADASTRAR POIS EXCEDEU O LIMITE DE CADASTROS NO SISTEMA");
                    } else {
                        System.out.println("Digite o nome do cliente a ser cadastrado");
                        String nome = leia.next();

                        System.out.println("Digite o login a ser usado do cliente");
                        String login = leia.next();

                        System.out.println("Digite a senha a ser utilizada");
                        String senha = leia.next();

                        for (int i = 0; i <= clientes.length; i++) {
                            if (clientes[i] == null) {
                                clientes[i] = new Cliente(nome, login, senha);
                                break;
                            }
                        }
                        System.out.println("Cadastro efetuado com sucesso!");
                    }

                    break;
                case 3:
                    Utilitarios.limpaTela();
                    System.out.println("LISTAGEM DE CLIENTES");
                    for (Cliente cliente : clientes) {
                        if (cliente != null) {
                            System.out.println(cliente);
                        } else {
                            System.out.println("VAGO");

                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    Utilitarios.limpaTela();
                    System.out.println("DIGITE AS CREDENCIAIS DE ACESSO AO CAIXA");
                    System.out.print("Código de Acesso: ");
                    int codigoAcesso = leia.nextInt();

                    System.out.print("Senha de Acesso: ");
                    int senhaAcesso = leia.nextInt();

                    boolean verificaLogin = Admin.verificaAcessoAdmin(codigoAcesso, senhaAcesso);

                    if (verificaLogin == true) {
                        Notas.menu();
                    } else {
                        System.out.println("CREDENCIAIS INVALIDAS!");
                        System.out.println("TENTE NOVAMENTE MAIS TARDE");
                        break;
                    }
                    break;
                case 5:
                    repeat = false;
                    break;
            }
        } while (repeat == true);



    }

    public static Cliente[] getClientes() {
        return clientes;
    }
}
