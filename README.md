# Simulador de Caixa Eletrônico em JAVA POO

Fiz este sistema com o intuito de demonstrar e testar meus conhecimentos obtidos em java poo até o momento. 

Usando conceitos como Heranca, Classes Abstratas, sobreescrita de metodos, if else, for e foreach, arrays bidimensionais.


## Funções do Caixa Eletrônico

Neste projeto, temos um simulador de caixa eletrônico com algumas funcoes, tais como:

### No Menu Principal

* Login do cliente
* Cadastro do cliente
* Lista de clientes cadastrados no sistema
* Reabastecimento de notas do caixa eletrônico

### No Menu do Cliente

* Extrato Bancário
* Saldo
* Saque
* Transferência

## Código e Documentação

Caso for mudar alguns parametros do código, aqui vai a documentação:

### Mudar o login e senha de administrador

Mude os seguintes parametros abaixo, na classe **Admin** para fazer tal mudança

```private static final int ACESSO_ADMIN = **333**;```
```private static final int SENHA_ADMIN = **333**;```

### Mudar a quantidade de cadastros permitidos pelo sistema

Na classe Main, logo no inicio se encontra um array bidimensional onde pode ser mudado o numero de cadastros

```Cliente[] clientes = new Cliente[** Mudar o valor**];```





