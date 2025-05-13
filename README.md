# 📚 Livraria

<div style="background-color: #f0f8ff; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">📋 Sobre o Projeto</h2>
  <p style="color: #34495e;">Api simples de um projeto mobile com o tema livraria.</p>
</div>

<div style="background-color: #fff0f5; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">⚙️⚙ Tecnologias Utilizadas</h2>
  <ul style="color: #34495e;">
    <li>Java 21</li>
    <li>Spring Boot 3.1.0</li>
    <li>Spring Data JPA</li>
    <li>MySQL 8.0</li>
    <li>Maven</li>
  </ul>
</div>

<div style="background-color: #f0fff0; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">🛠️ Funcionalidades</h2>
  <ul style="color: #34495e;">
    <li>📖 Gerenciamento de livros</li>
    <li>📦 Controle de desejos</li>
  </ul>
</div>

<div style="background-color: #fffaf0; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">📝 Endpoints</h2>
  
  <div style="background-color: #f5f5f5; padding: 15px; border-radius: 8px; margin: 10px 0;">
    <h3 style="color: #2c3e50;">Usuários</h3>
    <pre style="color: #34495e;">
POST /livros - Criar um desejo
GET /livros - Listar usuários
GET /livros/{id} - Buscar livros por ID
PUT /livros/{id} - Atualizar livros
DELETE /livros/{id} - Deletar livro</pre>
  </div>


<div style="background-color: #f0ffff; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">🎨 Exemplos de Requisições</h2>
  
  <div style="background-color: #f5f5f5; padding: 15px; border-radius: 8px; margin: 10px 0;">
    <h3 style="color: #2c3e50;">Criar Usuário</h3>
    <pre style="color: #34495e;">
{
  "titulo": "O Senhor dos ",
  "autor": "J.R.R. Tolkien",
  "genero": "Fantasia",
  "capa": "https://link-da-capa.com/imagem.jpg",
  "dataPublicacao": "1954-07-29T00:00:00",
  "descricao": "Um épico de fantasia sobre a Terra Média.",
  "preco": 99.90,
  "codBarrasNum": 123456789
}
</pre>
  </div>

<div style="background-color: #ffe4e1; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">🚀 Como Executar</h2>
  <ol style="color: #34495e;">
    <li>Clone o repositório</li>
    <li>Configure o banco de dados no `application.properties`</li>
    <li>Execute o projeto:
      <pre>mvn spring-boot:run</pre>
    </li>
  </ol>
</div>

<div style="background-color: #e6e6fa; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">📊 Status do Projeto</h2>
  <div style="display: flex; gap: 10px;">
    <img src="https://img.shields.io/badge/Status-Em%20Desenvolvimento-yellow" alt="Status">
    <img src="https://img.shields.io/badge/Java-21-blue" alt="Java">
    <img src="https://img.shields.io/badge/Spring%20Boot-3.1.0-green" alt="Spring Boot">
  </div>
</div>
