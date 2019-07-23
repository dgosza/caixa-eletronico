# Simulador de Caixa Eletrônico em JAVA POO

Fiz este sistema com o intuito de demonstrar e testar meus conhecimentos obtidos em java poo até o momento. 

Usando conceitos como Heranca, Classes Abstratas, sobreescrita de metodos, if else, for e foreach, arrays bidimensionais, encapsulamento, atributos finais e static.


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
* Editar Dados

## Código e Documentação

Caso for mudar alguns parametros do código, aqui vai a documentação:

### Mudar o login e senha de administrador

Mude os seguintes parametros abaixo, na classe **Admin** para fazer tal mudança

```private static final int ACESSO_ADMIN = **333**;```

```private static final int SENHA_ADMIN = **333**;```

### Mudar a quantidade de cadastros permitidos pelo sistema

Na classe Main, logo no inicio se encontra um array bidimensional onde pode ser mudado o numero de cadastros

```Cliente[] clientes = new Cliente[**5**];```

### Quantidade de Notas e Moedas no Caixa Eletrônico

Usando o conceito de bloco de inicialização do java, iniciaremos nosso programa com alguns valores setados para moedas e notas.

* Nota de **R$100** : 200 Notas

* Nota de **R$50**  : 100 Notas

* Nota de **R$20**  : 100 Notas

* Nota de **R$10**  : 70 Notas

* Nota de **R$5**   : 70 Notas

* Nota de **R$2**   : 70 Notas


* Moeda de **R$1.00** : 100 Moedas

* Moeda de **R$0.50** : 100 Moedas

* Moeda de **R$0.25** : 100 Moedas

* Moeda de **R$0.10** : 100 Moedas

* Moeda de **R$0.05** : 100 Moedas

### Limite de saques 

O limite de saques para cada conta é de 5. Caso queira mudar o valor, vá na classe Conta e altere o valor.

```private static final double LIMITE_DE_SAQUES = 5;```

### Herança nas classes

As classes de Corrente e Poupança são heranças da classe de Conta. Qualquer alteração que quiser realizar nas mesmas, acesse a classe Conta.

Toda conta corrente será iniciada com um valor de saldo de R$2500 e de conta poupança um valor de R$7.800


### Transferencia entre objetos cadastrados no sistema

Para a operação de Transferencia de dinheiro, é disponibilizado as contas cadastradas dentro do sistema.

Para fazer tal transferencia, basta digitar o tipo de conta que será debitado o saldo e o tipo de conta do beneficiario e o numero da conta. Assim que a operação for concluida, o saldo sera debitado da sua conta e transferido ao outro cliente dentro do sistema.





