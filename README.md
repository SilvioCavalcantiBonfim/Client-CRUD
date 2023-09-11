# CRUD de Clientes

![spring](https://img.shields.io/badge/-Spring_Boot-white?style=for-the-badge&logo=Spring-Boot&color=6DB33F&logoColor=white)
![swagger](https://img.shields.io/badge/-Swagger-white?style=for-the-badge&logo=swagger&color=85EA2D&logoColor=white)

Este é um projeto Spring Boot desenvolvido como parte do curso **Explorando Padrões de Projetos na Prática com Java** durante o **bootcamp Explorando Padrões de Projetos na Prática com Java**. O projeto é um exemplo de um aplicativo de gerenciamento de clientes que realiza operações CRUD (Create, Read, Update, Delete) usando Spring Boot, JPA para persistência de dados em um banco de dados H2, Lombok para melhorar a produtividade no desenvolvimento, Springdoc OpenAPI para documentação da API e Spring Cloud OpenFeign para consumo da API Via Cep.

## Recursos

- **Spring Boot**: Um framework Java para construção de aplicativos web e serviços RESTful.
- **JPA (Java Persistence API)**: Uma API de persistência de dados que facilita o armazenamento e recuperação de objetos em um banco de dados relacional.
- **H2 Database**: Um banco de dados relacional em memória para simplificar o desenvolvimento e os testes.
- **Lombok**: Uma biblioteca que simplifica a criação de classes Java, reduzindo a necessidade de escrever código boilerplate.
- **Springdoc OpenAPI Starter WebMvc UI**: Uma ferramenta para gerar automaticamente documentação interativa da API usando a especificação OpenAPI.
- **Spring Cloud OpenFeign**: Uma biblioteca para simplificar a criação de clientes REST para consumir APIs externas, como a API `Via Cep`.

## Como executar o projeto

1. Clone este repositório para o seu ambiente de desenvolvimento:

```bash
git clone https://github.com/SilvioCavalcantiBonfim/CRUD-de-Clientes.git
```
2. Navegue até o diretório do projeto:

```bash
cd CRUD-de-Clientes
```
3. Execute o aplicativo Spring Boot usando o Maven:

```bash
mvn spring-boot:run
```
O aplicativo estará disponível em http://localhost:8080. Você pode acessar a documentação da API em http://localhost:8080/swagger-ui.html.

## Endpoints da API

A API oferece os seguintes endpoints para gerenciamento de clientes:

- `GET /api/clients`: Retorna todos os clientes.

- `GET /api/clients/{id}`: Retorna um cliente pelo ID.
- `POST /api/clients`: Cria um novo cliente.
- `PUT /api/clients/{id}`: Atualiza um cliente existente pelo ID.
- `DELETE /api/clients/{id}`: Exclui um cliente pelo ID.

## Documentação da API

A documentação da API é gerada automaticamente usando o Springdoc OpenAPI. Você pode acessá-la em http://localhost:8080/swagger-ui.html após iniciar o aplicativo.

## Consumindo a API Via Cep

Este projeto utiliza o Spring Cloud OpenFeign para consumir a API Via Cep. A integração está configurada para buscar informações de endereço com base no CEP informado.

## Contribuições

Contribuições são bem-vindas! Se você quiser contribuir para este projeto, sinta-se à vontade para abrir um pull request.

## Autor

Este projeto foi desenvolvido por Silvio Cavalcanti Bonfim como parte do curso Explorando Padrões de Projetos na Prática com Java durante o bootcamp Explorando Padrões de Projetos na Prática com Java.