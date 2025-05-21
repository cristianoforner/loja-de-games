# 🕹️ Loja de Games - Backend com Spring Boot

O objetivo é construir uma API REST para gerenciar produtos de uma loja de games, organizados por categorias.

---

## 🚀 Funcionalidades

✔️ CRUD completo de **Produtos**  
✔️ CRUD completo de **Categorias**  
✔️ Relacionamento `OneToMany` entre Categoria e Produto  
✔️ Consultas personalizadas por nome, tipo e faixa de preço  
✔️ Testes realizados via **Insomnia**

---

## 🛠️ Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.5
- Spring Web
- Spring Data JPA
- MySQL
- Hibernate
- Jakarta Validation
- Maven
- Insomnia (testes)

---

## 🔧 Como executar

1. Clone o repositório:

git clone https://github.com/cristianoforner/loja-de-games.git


2. Crie o banco de dados no MySQL:
```sql
CREATE DATABASE lojadegames_db;

3. Configure o arquivo application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/lojadegames_db
spring.datasource.username=root
spring.datasource.password=senha
spring.jpa.hibernate.ddl-auto=update

4. Rode o projeto no Spring Tool Suite ou IntelliJ com suporte Maven.

📫 Testes com Insomnia

📁 Categoria
Método	Rota	Descrição
GET	/categorias	Lista todas as categorias
POST	/categorias	Cria nova categoria
GET	/categorias/tipo/{tipo}	Busca por tipo
PUT	/categorias	Atualiza categoria
DELETE	/categorias/{id}	Deleta categoria por ID

🎮 Produto
Método	Rota	Descrição
GET	/produtos	Lista todos os produtos
POST	/produtos	Cria novo produto
GET	/produtos/nome/{nome}	Busca por nome
GET	/produtos/maiorpreco/{preco}	Produtos com preço maior
GET	/produtos/menorpreco/{preco}	Produtos com preço menor
PUT	/produtos	Atualiza produto
DELETE	/produtos/{id}	Deleta produto por ID

👨‍💻 Autor
Cristiano Forner
Desenvolvedor Java Full Stack 

