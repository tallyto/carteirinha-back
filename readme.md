README - Aplicação Back-End Java Spring Boot

## Descrição

Este repositório contém o código-fonte de uma aplicação back-end desenvolvida em Java Spring Boot. A aplicação fornece um serviço RESTful para gerenciamento de usuários, permitindo criar, listar, atualizar e excluir usuários.

## Tecnologias utilizadas

- Java 11
- Spring Boot 2.5.1
- Spring Data JPA
- PostgreSQL 12
- Maven 3.8.1
- IDE Eclipse 2021-03

## Funcionalidades

A aplicação oferece as seguintes funcionalidades:

- Criação de um novo usuário, com nome, data de nascimento, gênero, escolaridade, CPF, celular, instituição e curso.
- Listagem de todos os usuários cadastrados.
- Consulta de um usuário específico pelo ID.
- Atualização dos dados de um usuário existente.
- Exclusão de um usuário pelo ID.

## Configuração do ambiente

Para executar a aplicação, é necessário ter o Java 11 e o PostgreSQL 12 instalados. É recomendado utilizar uma IDE Java, como o Eclipse, para facilitar o desenvolvimento e execução da aplicação.

Antes de executar a aplicação, é necessário configurar o banco de dados no arquivo application.properties, que se encontra no diretório src/main/resources. É preciso informar a URL do banco de dados, nome do banco, nome de usuário e senha.

```
spring.datasource.url=jdbc:postgresql://localhost:5432/meu_banco
spring.datasource.username=usuario
spring.datasource.password=senha
```

Também é necessário criar o banco de dados no PostgreSQL antes de executar a aplicação.

## Executando a aplicação

Para executar a aplicação, basta importar o projeto em uma IDE Java e executar a classe Application, que se encontra no diretório src/main/java/com/minhaempresa/usuarios. A aplicação será iniciada na porta 8080.

Também é possível executar a aplicação através do Maven, utilizando o seguinte comando no diretório raiz do projeto:

```
mvn spring-boot:run
```

## Utilizando a API

A API está disponível através de endpoints RESTful. A seguir, são apresentados os endpoints disponíveis:

### Cadastrar um usuário

```
POST /usuarios

{
    "nome": "Fulano de Tal",
    "dataNascimento": "1990-01-01",
    "genero": "Masculino",
    "escolaridade": "Ensino Superior",
    "cpf": "111.111.111-11",
    "celular": "(11) 9 9999-9999",
    "instituicao": "Universidade X",
    "curso": "Ciência da Computação"
}
```

### Listar todos os usuários

```
GET /usuarios
```

### Consultar um usuário pelo ID

```
GET /usuarios/{id}
```

## Atualizar os dados de um usuário

Para atualizar os dados de um usuário, deve-se enviar uma requisição HTTP PUT para a rota `/api/usuarios/{id}` informando o ID do usuário que se deseja atualizar. No corpo da requisição deve ser enviado um JSON com os novos dados do usuário. Exemplo:

```http
PUT /api/usuarios/1 HTTP/1.1
Content-Type: application/json

{
  "nome": "João da Silva",
  "email": "joao.silva@gmail.com",
  "dataNascimento": "1990-01-01",
  "genero": "M",
  "escolaridade": "Superior Completo",
  "cpf": "111.111.111-11",
  "celular": "(11) 99999-9999",
  "instituicao": "Universidade Federal de São Paulo",
  "curso": "Engenharia de Software"
}
```

A resposta da API será um JSON com os dados atualizados do usuário:

```json
{
  "id": 1,
  "nome": "João da Silva",
  "email": "joao.silva@gmail.com",
  "dataNascimento": "1990-01-01",
  "genero": "M",
  "escolaridade": "Superior Completo",
  "cpf": "111.111.111-11",
  "celular": "(11) 99999-9999",
  "instituicao": "Universidade Federal de São Paulo",
  "curso": "Engenharia de Software"
}
```

## Deletar um usuário

Para deletar um usuário, deve-se enviar uma requisição HTTP DELETE para a rota `/api/usuarios/{id}` informando o ID do usuário que se deseja deletar. Exemplo:

```http
DELETE /api/usuarios/1 HTTP/1.1
```

A resposta da API será um JSON com a mensagem `Usuário deletado com sucesso`.

```json
{
  "mensagem": "Usuário deletado com sucesso"
}
```

## Considerações finais

Esta API é uma implementação simples e pode ser aprimorada com diversas funcionalidades, como autenticação de usuários, permissões de acesso, validação de dados, entre outras. É importante ressaltar que o objetivo deste documento é apenas apresentar uma visão geral da API e suas principais funcionalidades. Para mais detalhes, consulte a documentação completa da API e o código fonte disponível no repositório.
