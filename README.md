# Transaction Service

Transaction Service é um serviço que gerencia transações, garantindo a criptografia de campos sensíveis para a segurança dos dados. Este projeto foi desenvolvido como parte de um [desafio técnico](https://github.com/backend-br/desafios/blob/master/cryptography/PROBLEM.md), que consistia em demonstrar o uso de criptografia em uma aplicação de CRUD.

## Índice

- [Funcionalidades](#funcionalidades)
- [Tecnologias Utilizadas](#tecnologias-utilizadas)
- [Exemplo de Uso](#exemplo-de-uso)
- [Estrutura do Projeto](#estrutura-do-projeto)

## Funcionalidades

O serviço oferece os seguintes endpoints para gerenciar transações financeiras:
- **Criar**: Cria uma nova transação.
- **Atualizar**: Atualiza uma transação existente.
- **Listar**: Lista todas as transações de forma paginada.
- **Buscar por ID**: Retorna uma transação específica pelo ID.
- **Deletar por ID**: Deleta uma transação específica pelo ID.

## Tecnologias Utilizadas

- **Java 21**
- **Spring Boot**
- **MySQL** 
- **Docker** 
- **Jasypt** 
- **Criptografia**

## Exemplo de Uso

### Criar Transação

Envie uma requisição POST para `http://localhost:8080/transactions` com o seguinte JSON no corpo da requisição:
~~~JSON
{
    "userDocument": "12345678901",
    "creditCardToken": "abc123xyz",
    "value": 1000
}
~~~

- Dado Criptografado

| id  | userDocument       | creditCardToken | value |
|-----|--------------------|-----------------|-------|
| 1   | MzYxNDA3ODE4MzM=   | YWJjMTIz        | 1000  |

### Atualizar Transação

Envie uma requisição PUT para `http://localhost:8080/transactions/{id}`

### Listar Transações

Envie uma requisição GET para `http://localhost:8080/transactions?page=0&pageSize=10` para listar as transações de forma paginada.


### Buscar Transação por ID

Envie uma requisição GET para `http://localhost:8080/transactions/{id}` para buscar uma transação específica pelo ID.

### Deletar Transação por ID

Envie uma requisição DELETE para `http://localhost:8080/transactions/{id}` para deletar uma transação específica pelo ID.

## Estrutura do Projeto

- **Controller**: Responsável por receber as requisições e retornar as respostas.
    - TransactionController.java

- **Service**: Contém a lógica de negócios e manipulação das transações.
    - TransactionService.java

- **Repository**: Interage com o banco de dados para operações CRUD.
    - TransactionRepository.java

- **Entity**: Define a estrutura da entidade de transação e seus campos criptografados.
    - TransactionEntity.java

- **DTO**: Define a estrutura dos objetos de transferência de dados.
    - CreateTransactionRequest.java
    - TransactionResponse.java
    - UpdateTransactionRequest.java

- **Criptografia**: Implementa a criptografia dos campos sensíveis.
    - CryptoService.java