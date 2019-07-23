package br.com.bank.online.cliente;

import br.com.bank.online.Main;
import br.com.bank.online.Utilitarios;


import java.util.Scanner;

public class EditarDados {

    public Cliente procuraCliente(String nomeCliente, String senhaCliente) {
        Cliente clienteProcurado = null;
        for (Cliente cliente : Main.getClientes()) {
            if (cliente != null) {
                if (cliente.getNome().equals(nomeCliente) && cliente.getSenha().equals(senhaCliente)) {
                    clienteProcurado = cliente;
                }
            }
        }
        return clienteProcurado;
    }

    public void menu(String nome, String senha) {

        //CHAMA O METODO PARA BUSCAR O CLIENTE QUE ENTROU NA CLASSE DE EDITAR OS DADOS
        //COM OS ARGUMENTOS DE NOME E SENHA, CHAMA O METODO PARA VERIFICAR QUAL OBJETO DE CLIENTE
        //SERA USADO PARA MUDAR AS INFORMACOES

        //APOS FAZER A BUSCA, RETORNA UMA VARIAVEL DO TIPO CLIENTE COM TODOS OS ATRIBUTOS DO CLIENTE.
        Cliente cliente = procuraCliente(nome, senha);

        Scanner leia = new Scanner(System.in);
        Utilitarios.limpaTela();
        System.out.println("EDITAR DADOS DO CLIENTE " + cliente.getNome());
        System.out.println("O QUE DESEJA EDITAR?");
        System.out.println(" 1 - NOME");
        System.out.println(" 2 - CPF");
        System.out.println(" 3 - RG");
        System.out.println(" 4 - SENHA");
        System.out.println(" 5 - SAIR");
        int opcao = leia.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("EDITAR O NOME");
                System.out.println("NOME ATUAL: " + cliente.getNome());
                System.out.println("DIGITE O NOVO NOME QUE DESEJA");
                System.out.print("NOME: ");
                String novoNome = leia.next();
                System.out.println("CONFIRME SUA SENHA PARA MUDAR O NOME");
                String confereSenha = leia.next();

                if (confereSenha.equals(cliente.getSenha())) {
                    System.out.println("SENHA CONFIRMADA!");
                    cliente.setNome(novoNome);
                    System.out.println("SEU NOVO NOME É: " + cliente.getNome());
                } else {
                    System.out.println("SENHA INVALIDA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                }
                break;
            case 2:
                System.out.println("EDITAR O CPF");
                System.out.println("CPF ATUAL: " + cliente.getCpf());
                System.out.println("DIGITE O CPF NOVO");
                System.out.print("CPF: ");
                String cpf = leia.next();
                System.out.println("CONFIRME SUA SENHA PARA EDITAR O CPF");
                confereSenha = leia.next();

                if (confereSenha.equals(cliente.getSenha())) {
                    System.out.println("SENHA CONFIRMADA!");
                    cliente.setCpf(cpf);
                    System.out.println("SEU NOVO CPF É: " + cliente.getCpf());
                } else {
                    System.out.println("SENHA INVALIDA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                }
                break;
            case 3:
                System.out.println("EDITAR O RG");
                System.out.println("RG ATUAL: " + cliente.getRg());
                System.out.println("DIGITE O RG NOVO");
                System.out.print("RG: ");
                String rg = leia.next();
                System.out.println("CONFIRME SUA SENHA PARA EDITAR O RG");
                confereSenha = leia.next();

                if (confereSenha.equals(cliente.getSenha())) {
                    System.out.println("SENHA CONFIRMADA!");
                    cliente.setCpf(rg);
                    System.out.println("SEU NOVO RG É: " + cliente.getRg());
                } else {
                    System.out.println("SENHA INVALIDA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                }
                break;
            case 4:
                System.out.println("MUDAR A SENHA");
                System.out.println("SENHA ATUAL: " + cliente.getSenha());
                System.out.println("DIGITE A SENHA NOVA");
                System.out.print("SENHA NOVA: ");
                senha = leia.next();
                System.out.println("CONFIRME SUA SENHA USADA ATUALMENTE");
                confereSenha = leia.next();

                if (confereSenha.equals(cliente.getSenha())) {
                    System.out.println("SENHA CONFIRMADA!");
                    cliente.setCpf(senha);
                    System.out.println("SUA NOVA SENHA É: " + cliente.getSenha());
                } else {
                    System.out.println("SENHA INVALIDA");
                    System.out.println("TENTE NOVAMENTE MAIS TARDE");
                }
                break;
            case 5:
                break;
        }
    }

}
