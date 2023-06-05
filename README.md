<h1 align="center">Desafio Global Solution 2023</h1>

<h2> Vídeo Pitch: https://youtu.be/H4WXcr8yHhM </h2>
<h2> Vídeo da API RESTful: https://youtu.be/7XESC54t3QM </h2>
<h2> Vídeo da API com o Mapeamento do Objeto Relacional JPA e Hibernate: </h2>
<h3 align="center">Link API Key Chat GPT: https://platform.openai.com/account/api-keys</h3>
<h3 align="center">Link API Clima: https://home.openweathermap.org/api_keys</h3>

<h2 align="center">🛠 Arquitetura do Projeto 🛠</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1115327732805537823/Mapa_Mental_com_brainstorm_escrito_a_mao_colorido_4.png"/>
</div>

<h2 align="center">📊 TOGAF 📊</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1115363179690741910/image.png"/>
</div>

<h2 align="center">🧾 Diagrama de Classes 🧾</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1115245677325320294/image.png"/>
</div>

<h2 align="center">🧾 Diagrama Relacional, Banco de Dados 🧾</h2>
<div align="center">
    <img height src="https://cdn.discordapp.com/attachments/963972218981847040/1115400097900023870/image.png"/>
</div>

<h2 align="center">Endpoints 📋</h2>

### Cadastro com Autenticação e Token ╹Usuário╷ **`/registrar`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"nome": "Luan Sá",
	"email": "lvssfiap@gmail.com",
	"senha": "|(:oUuC<UZ",
	"cpf":"535.710.748-96",
	"telefone":"(11) 95954-0882"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `201` | Usuário cadastrado com sucesso.
❌ | `403` | Não foi possível cadastrar o usuário.


### Login com validação de Token ╹Usuário╷ **`/login`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"email": "lvssfiap@gmail.com",
	"senha": "|(:oUuC<UZ"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `201` | Login validado com sucesso.
| ❌ | `403` | Não foi possivel validar o login.

### Mandar prompt para o ChatGPT ╹ChatGPT╷ **`/chatbot/api`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"pergunta": "Gere dicas sobre a rotação de cultura em uma fazenda de médio porte no interior de São Paulo com 4 hectares de terreno disponível para plantação e com média de temperatura anual de 25 graus.",
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
✔️ | `200` | Prompt inserido com sucesso.
❌ | `403` | Não foi possível inserir o prompt.

### Deletar Prompt ╹ChatGPT╷ **`/chatbot/{id}`**:

#### DELETE ⬇️

**Exemplo 👇**
```js
http://localhost:8080/chatbot/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Prompt deletado com sucesso.
| ❌ | `403` | Prompt com o id {id} não foi encontrado.

### Pesquisa Por ID ╹ChatGPT╷ **`/chatbot/busca/{id}`**:

#### GET ⬅️

**Exemplo 👇**
```js
http://localhost:8080/chatbot/busca/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Prompt com o id {id} encontrada.
| ❌ | `403` | Prompt com o id {id} não foi encontrada.


### Clima  ╹Open Weather╷ **`/clima/{city}`**:

#### POST ➡️

**Exemplo 👇**
```js
http://localhost:8080/clima/São Paulo
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Cidade encontrada com sucesso.
| ❌ | `403` | Cidade não encontrada.

### Cadastro  ╹Pessoa╷ **`/pessoa`**:

#### POST ➡️

**Exemplo 👇**
```js
{
	"id": 1,
	"nome": "Luiz Fernando",
	"nascimento": "1996-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
}
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Pessoa cadastrada com sucesso.
| ❌ | `403` | Não foi possivel realizar o cadastro.

### Pesquisa Por ID ╹Pessoa╷ **`/pessoa/busca/{id}`**:

#### GET ⬅️

**Exemplo 👇**
```js
http://localhost:8080/pessoa/busca/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `200` | Pessoa com o id {id} encontrada.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.

### Atualizar Pessoa ╹Pessoa╷ **`/pessoa/{id}`**:

#### PUT 🔄

**Exemplo de cadastro 👇**
```js
	"id": 1,
	"nome": "Luiz Fernando",
	"nascimento": "1996-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
```
** Exemplo de Alteração 👇**

```js
	"id": 1,
	"nome": "Luiz Fernando de Sá",
	"nascimento": "1969-06-05",
	"sexo": "MASCULINO",
	"filhos": [],
	"cpf": "236.862.556-93"
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Alteração feita com sucesso.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.

### Deletar Pessoa ╹Pessoa╷ **`/pessoa/{id}`**:

#### DELETE ⬇️

**Exemplo 👇**
```js
http://localhost:8080/pessoa/1
```

**Saída 👇**

|  | <font color="#aa31f5">código</font> | <font color="#e0af0d">descrição</font> |
|:------:|:------:|-----------|
| ✔️ | `204` | Pessoa deletada com sucesso.
| ❌ | `403` | Pessoa com o id {id} não foi encontrada.
