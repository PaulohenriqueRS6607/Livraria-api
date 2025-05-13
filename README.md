# 📚 Livraria

<div style="background-color: #f0f8ff; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">📋 Sobre o Projeto</h2>
  <p style="color: #34495e;">Api simples de um projeto mobile com o tema livraria.</p>
</div>

<div style="background-color: #fff0f5; padding: 20px; border-radius: 10px; margin: 20px 0;">
  <h2 style="color: #2c3e50;">⚙️ Tecnologias Utilizadas</h2>
  <ul style="color: #34495e;">
    <li>Java 21</li>
    <li>Spring Boot 3.1.0</li>
    <li>Spring Data JPA</li>
    <li>MySQL 8.0</li>
    <li>Swagger</li>
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
    <h3 style="color: #2c3e50;">Criar desejo</h3>
    <pre style="color: #34495e;">
{
  "titulo": "O Senhor dos Anéis",
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
