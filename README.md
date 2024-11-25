# Staff Tracker API
## 📋 Descrição
O Staff Tracker é uma API REST desenvolvida com Spring Boot, destinada ao gerenciamento de funcionários. Ela permite operações básicas como cadastro, listagem, busca, e exclusão de funcionários, além de possuir documentação interativa gerada automaticamente com Swagger/OpenAPI.

🛠️ Tecnologias Utilizadas
Linguagem: Java 17+
Framework: Spring Boot 3.x
Banco de Dados: PostgreSQL
ORM: Spring Data JPA (Hibernate)

Bibliotecas:
Lombok (para reduzir boilerplate de código)

🚀 Funcionalidades
Listar todos os funcionários.
Buscar funcionário por ID.
Cadastrar um novo funcionário.
Excluir funcionário por ID.

⚙️ Configuração do Ambiente
Pré-requisitos
Java 17 ou superior instalado.
Maven instalado.
Docker instalado (para PostgreSQL).
1. Configurar o Banco de Dados
Execute o seguinte comando para criar o container do PostgreSQL:

bash
Copiar código
docker run --name stafftracker-postgres -e POSTGRES_USER=seu_usuario -e POSTGRES_PASSWORD=sua_senha -e POSTGRES_DB=stafftracker -p 5432:5432 -d postgres
2. Configurar o Projeto
Atualize o arquivo application.properties com as credenciais do banco:
```
properties
Copiar código
spring.datasource.url=jdbc:postgresql://localhost:5432/stafftracker
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```
3. Executar a Aplicação
Compile e execute o projeto:
```
bash
Copiar código
mvn spring-boot:run

```
A aplicação estará disponível em:

API: http://localhost:8080/employees

📖 Rotas da API
Método HTTP	Endpoint	Descrição
GET	/employees	Lista todos os funcionários.
GET	/employees/{id}	Busca um funcionário pelo ID.
POST	/employees	Cadastra um novo funcionário.
DELETE	/employees/{id}	Exclui um funcionário pelo ID.


📂 Estrutura do Projeto
plaintext
Copiar código
StaffTracker/
├── src/main/java/com/example/stafftracker/
│   ├── controllers/       # Controladores REST
│   ├── models/            # Entidades JPA
│   ├── repositories/      # Interfaces do Spring Data JPA
│   ├── services/          # Lógica de negócios
│   └── StaffTrackerApplication.java  # Classe principal
├── src/main/resources/
│   ├── application.properties  # Configurações da aplicação
├── pom.xml                # Gerenciador de dependências Maven
└── README.md              # Documentação do projeto

🖋️ Autores
@Larissa-P-B
Agora você tem um README funcional para o projeto Staff Tracker API! 🚀
