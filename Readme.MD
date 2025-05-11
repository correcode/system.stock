# 📦 Projeto: Cadastro de Produtos

Um sistema básico de cadastro de produtos desenvolvido em Java. O projeto tem como objetivo principal a prática e o entendimento de conceitos fundamentais como listas, tratamento de exceções, estruturas de controle, e boas práticas de codificação.

---

## ✅ Funcionalidades Implementadas

O sistema permite:

- **Cadastrar Produto**: Adiciona um novo produto à lista.
- **Buscar Produto por ID**: Encontra um produto específico através do seu ID.
- **Excluir Produto**: Remove um produto da lista com base no ID informado.
- **Exibir Lista de Produtos**: Exibe todos os produtos cadastrados até o momento.

---

## 🧠 Aprendizados

Durante o desenvolvimento, foram aplicadas e reforçadas várias boas práticas e conceitos importantes:

### 📌 Tratamento de Exceções
- Ao implementar os métodos, foi priorizado o uso de **exceptions** para tratar erros antes do retorno de dados, garantindo mais segurança e clareza no fluxo da aplicação.

### 📌 Exclusão de Produtos
- Uso do `boolean` para validar se a exclusão foi bem-sucedida.
- Aplicação do método `get(int)` para localizar itens por índice.
- Utilização do `equals(String)` para comparar dados textuais com segurança.
- Remoção de produtos da lista usando o método `remove(Object)`.

### 📌 Busca por ID
- Ao invés de retornar apenas o `ID`, o método retorna o **objeto completo (Produto)** encontrado, o que facilita o acesso às demais informações do item.
- Implementação com `foreach` para percorrer a lista de forma clara e legível.

---

## 🚀 Tecnologias Utilizadas

- **Java 17** (ou versão equivalente)
- **IDE de sua preferência** (IntelliJ, Eclipse, VS Code etc.)

---

## 📂 Estrutura do Projeto

