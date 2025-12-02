![Java](https://img.shields.io/badge/Java-21-007396?style=for-the-badge&logo=java)
![Spring](https://img.shields.io/badge/Spring_Boot-3.2.1-6DB33F?style=for-the-badge&logo=springboot)
![License](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)



# API para sistema de coletas de residuos 
O projeto acadêmico está alinhado com o tema ESG (Environmental , Social and Governance), o termo se refere a um conjunto de critérios usados para avaliar o desempenho de uma empresa em relação a práticas sustentáveis, responsabilidade social e transparência na sua gestão.
Para isso foi criado um serviço RESTful para atender à essas necessidades do desafio, que consiste em implementações de endpoints rest (GET, POST, DELETE, PUT) que necessecitam de um cadastro de úsuario para oferecer funcionalidades relevantes para o seu funcionamento. 


## 🚀 Tecnologias Utilizadas
- Java 21
- Spring Boot (Web, Security)
- Hibernate
- JWT
- Banco de dados (Oracle SQL developer)
- Maven
- Insomnia (para testes RESTful)

## 📦 Funcionalidades
- CRUD de X 
- Login com geração de JWT
- Validação de dados
- Autenticação e autorização


## 🔧 Como executar o projeto

### 1. Clone o repositório
```bash
git clone https://github.com/Jonastheprogram/API-sistema-de-coletasESG
```

### 2. configure seu banco do arquivo.properties
<img width="497" height="133" alt="image" src="https://github.com/user-attachments/assets/1d8ae64e-5d46-4816-88e6-b7fe9f4a9cda" />

### 3. Execute o projeto

### 4. Com o projeto rodando abra o insomnia e acesse o arquivo Insomnia_coleta_residuo_esg.yaml

### 5. Siga as instruções de cada controller para os métodos (GET, POST, DELETE, PUT) com base no model.
<img width="558" height="244" alt="image" src="https://github.com/user-attachments/assets/14ab0e35-6113-41b9-8579-54ce966e6250" />

Exemplos:

Cadastro de usuário

<img width="438" height="216" alt="image" src="https://github.com/user-attachments/assets/88a2df4e-8737-4dd2-8f64-04ee671401c6" />

Cadastro de coletas

<img width="437" height="234" alt="image" src="https://github.com/user-attachments/assets/28a9140f-1146-4212-8c23-3246ac82fc2f" />

E para busca de dados basta utilizar o número do ID desejado como exemplo http://localhost:8080/coletas/1 e a reposta no insomnia para todas as requisições que derem certo deve ser o código 201: 

<img width="936" height="183" alt="image" src="https://github.com/user-attachments/assets/366876b6-8f0f-40e9-ba49-a1e5c0e12dd4" />

Este projeto me proporcionou experiência prática tanto na implementação de operações CRUD quanto na construção de APIs RESTful, consolidando meu entendimento técnico sobre esses conceitos.














