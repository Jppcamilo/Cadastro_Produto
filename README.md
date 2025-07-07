# 📦 Cadastro de Produtos em Java

Este projeto é um sistema simples de cadastro de produtos com autenticação de usuários, desenvolvido como parte dos meus estudos em Java, focado na prática de **Programação Orientada a Objetos (POO)** e estruturas de dados dinâmicas.

## 🧠 Funcionalidades

- 📋 Cadastro de Produtos (CRUD Completo):
  - Cadastrar produtos
  - Listar produtos
  - Editar produtos
  - Deletar produtos
    
- 🔑 Sistema de Usuários:
  - Cadastro de novos usuários
  - Login com validação simples (sem senha criptografada)
    
- ✨ Menu interativo amigável no terminal (com validação de entradas)

## 🛠 Tecnologias e Conceitos Utilizados

- Java 11+
- Programação Orientada a Objetos (POO)
- Classes e Objetos
- `ArrayList` para armazenamento de produtos e usuários
- Laços e estruturas condicionais (`for`, `while`, `switch-case`)
- `Scanner` para entrada de dados
- Tratamento de entradas inválidas (validação)
- Modularização de código com múltiplas classes

## 🚀 Como Executar

1. Certifique-se de ter o **JDK instalado** na sua máquina.
2. Clone ou baixe este repositório.
3. Compile e execute o projeto com seu IDE Java preferida (ex: IntelliJ IDEA, VSCode).
4. Rode a classe `Main.java`.

## 📂 Estrutura do Projeto

├── Main.java           // Classe principal (menu e fluxo do sistema)
├── Produto.java        // Classe que representa os produtos
├── Casos.java          // Classe com as ações do menu de produtos
├── Usuario.java        // Classe que representa os usuários
├── UsuarioService.java // Classe que gerencia o cadastro e login de usuários

## 📚 Aprendizados
Durante esse projeto, coloquei em prática:
- Criação e instância de objetos em Java
- Uso de listas para armazenamento em tempo de execução
- Modularização de código com múltiplas classes
- Validação de entradas e tratamento de erros
- Controle de fluxo com menus
- Criação de um sistema básico de autenticação de usuários
- Leitura de dados do usuário com `Scanner`

## 🔄 Possíveis Melhorias Futuras (Backlog Pessoal)
- Adicionar persistência em arquivo (salvar os dados em `.txt` ou `.json`)
- Implementação de senha com criptografia para os usuários
- Melhorias no sistema de edição de produtos (permitir alterar múltiplos campos de uma vez)
- Adição de um sistema de permissões para os usuários (ex: admin, usuário comum)
- Integração com uma interface gráfica (Swing ou JavaFX)

## ✍️ Autor
Projeto desenvolvido por João Pedro Pereira Camilo durante meus estudos de Java nas férias, com foco em evolução pessoal e prática intensiva de programação.
