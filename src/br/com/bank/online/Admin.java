package br.com.bank.online;

public class Admin {

    private static final int ACESSO_ADMIN = 333;
    private static final int SENHA_ADMIN = 333;
    private static final String NOME_ADMINISTRADOR = "Diego Magalhães de Souza";

    public static final boolean verificaAcessoAdmin(int usuario, int senha){
        if(usuario == ACESSO_ADMIN && senha == SENHA_ADMIN){
            return true;
        }else{
            return false;
        }
    }

    public static String getNomeAdministrador() {
        return NOME_ADMINISTRADOR;
    }
}
