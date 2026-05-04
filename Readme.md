# Mercado API

API RESTful desenvolvida com Spring Boot para gerenciamento de produtos e setores de um mercado.

## Tecnologias
- Java 21
- Spring Boot 4
- Spring Data JPA
- MySQL 8
- Docker
- Springdoc OpenAPI (Swagger)

## Pré-requisitos
- Java 21 instalado
- Docker Desktop instalado e rodando

## Como rodar do zero

### 1. Clone o repositório
```bash
git clone https://github.com/SEU_USUARIO/mercado-api.git
cd mercado-api
```

### 2. Suba o banco de dados com Docker
Na raiz do projeto, execute:
```bash
docker-compose up -d
```
Isso irá criar e iniciar um container MySQL 8 com:
- Banco: `mercadodb`
- Usuário: `root`
- Senha: `root`
- Porta: `3306`

### 3. Rode a aplicação
```bash
./mvnw spring-boot:run
```

### 4. Acesse o Swagger
Abra o navegador em: http://localhost:8080


## Endpoints

### Produtos
| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /produtos | Lista todos os produtos |
| GET | /produtos/{id} | Busca produto por ID |
| POST | /produtos | Cria novo produto |
| PUT | /produtos/{id} | Atualiza produto |
| DELETE | /produtos/{id} | Remove produto |

### Setores
| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /setores | Lista todos os setores |
| GET | /setores/{id} | Busca setor por ID |
| POST | /setores | Cria novo setor |
| PUT | /setores/{id} | Atualiza setor |
| DELETE | /setores/{id} | Remove setor |

## Exemplo de payload

### Produto
```json
{
  "nome": "Arroz",
  "preco": 8.99,
  "quantidade": 100,
  "descricao": "Arroz tipo 1 5kg",
  "categoria": "Grãos"
}
```

### Setor
```json
{
  "nome": "Padaria",
  "responsavel": "João Silva",
  "capacidade": 50,
  "descricao": "Setor de pães e bolos",
  "localizacao": "Ala A - Corredor 1"
}
```