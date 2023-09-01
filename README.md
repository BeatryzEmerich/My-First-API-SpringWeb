# Spring Web API
<p align="center">
  <img src="https://springframework.guru/wp-content/uploads/2015/02/spring-framework-project-logo.png">
</p>

## Descrição

Esta API Web foi desenvolvida com o Spring Framework e fornece uma plataforma robusta para gerenciar operações relacionadas a usuários. Ela inclui recursos para criar, atualizar, listar e excluir usuários do sistema. Além disso, é possível procurar usuários com base no ID ou nome de usuário.

## Funcionalidades Principais

- **Cadastro de Usuários**: A API permite que você crie novos registros de usuários no sistema.

- **Atualização de Dados**: É possível atualizar as informações de um usuário existente.

- **Listagem de Usuários**: Você pode listar todos os usuários cadastrados no sistema.

- **Exclusão de Usuários**: A API permite a exclusão de usuários com base em seus IDs.

- **Pesquisa de Usuários**: É possível procurar usuários pelo ID ou nome de usuário.

## Endpoints

- `POST /api/usuarios`: Crie um novo usuário.
- `PUT /api/usuarios`: Atualize as informações de um usuário.
- `DELETE /api/usuarios/{id}`: Exclua um usuário pelo ID.
- `GET /api/usuarios`: Liste todos os usuários cadastrados.
- `GET /api/usuarios/{id}`: Obtenha detalhes de um usuário pelo ID.
- `GET /api/usuarios/username/{username}`: Procure um usuário pelo nome de usuário.

## Configuração

Para executar esta API em sua máquina local, siga estas etapas:

1. Clone o repositório para o seu ambiente local.
2. Certifique-se de ter o Java e o Spring Boot instalados.
3. Configure as credenciais do banco de dados no arquivo `application.properties`.
4. Execute a aplicação Spring Boot usando a IDE de sua escolha ou o comando `./mvnw spring-boot:run`.
5. Acesse a API em `http://localhost:8080`.
6. Para testes eu usei o P
