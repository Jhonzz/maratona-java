# MARATONA JAVA
📱 **Sobre o Projeto**<br><br>
Projeto criado para estudos sobre TODOS os tópicos de java.

Este projeto oferece oportunidades de ser utilizada até como documentação, pois abrange todos os tópicos sobre java, desde Tipos primitivos até design patterns, junit, jdbc e por aí vai...

🎥 Demonstração do Projeto<br>
O projeto é simples de se rodar, utiliza apenas docker para container do banco de dados mysql<br>
****Classes básicas****<br>
Classes Dominio: Classes de dominio serão utilizadas pelas classes de testes(dentro da pasta "test"):<br>
<img width="1919" height="1002" alt="maratona java domain" src="https://github.com/user-attachments/assets/13bdf482-944e-4a18-853b-058d259fc329" />

Classes test: Classes de test serão utilizadas para demonstrar o exemplo de uma domain funcionando:<br>
<img width="1919" height="1002" alt="maratona java domain" src="https://github.com/user-attachments/assets/3cead4ae-e3a1-44b2-8ff2-d0b1f591700e" />
<br>
🚀 **Tecnologias Utilizadas**<br>
Java<br>
Mysql<br>
Docker<br>
Maven<br>
JDBC<br>

📦 **Como Instalar**<br>
Clone o repositório: 
git clone https://github.com/Jhonzz/maratona-java<br>
Instale as dependências pelo arquivo maven do projeto: <br>
Acesse o arquivo pom.xml, abra a aba do maven -> lifecycle -> clean -> install<br>

**PARA O JDBC (IMPORTANTE PARA RODAR TUDO CERTO)**<br>
DOCKER: basta ter o docker instalado em sua maquina e rodar o comando "docker-compose up" para realizar o download da imagem e subir o container do mysql para o funcionamento do banco:
<img width="1919" height="1031" alt="docker" src="https://github.com/user-attachments/assets/075e38df-d429-4ca7-ba77-6da888f5b22d" /><br>
O container irá aparecer desse jeito na sua interface do docker:<br>
<img width="1919" height="1033" alt="docker1" src="https://github.com/user-attachments/assets/f5cc1587-2cce-4216-89de-bd089a091432" />
Pronto, seu banco de dados está configurado!! A criação de tabelas, colunas etc esta manual (esse projeto não está usando flyway)
Dados do banco de dados:
<img width="1918" height="1008" alt="database" src="https://github.com/user-attachments/assets/1fe52ced-ab9f-491a-b82b-0bc363f0eb26" />
