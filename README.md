# 🎵 Projeto Java: Catálogo de Músicas e Podcasts

Este repositório faz parte da minha **jornada de aprendizado em Java**, com foco no desenvolvimento de habilidades em **Programação Orientada a Objetos (POO)**.

## 📚 Sobre o Projeto

O projeto simula um pequeno catálogo de áudios, permitindo curtir e reproduzir músicas e podcasts. Ele demonstra conceitos-chave de orientação a objetos, como **herança**, **encapsulamento**, **sobrescrita de métodos** e **polimorfismo**.

## 🛠️ O que foi utilizado

- Linguagem: Java
- Paradigma: Programação Orientada a Objetos
- IDE: IntelliJ IDEA
- Organização em pacotes (`com.musicas` e `com.musicas.modelos`)

## 🧱 Estrutura de Classes

### `audio` (classe base)
Define os atributos e comportamentos comuns a músicas e podcasts:
- `titulo`, `likes`, `reproducoes`, `classificacao`
- Métodos: `curte()`, `reproduz()`

### `musica` e `podcast` (classes filhas)
Especializações da classe `audio`, com atributos e regras de classificação próprios.

### `curtidas`
Classe utilitária que verifica a popularidade de um conteúdo de áudio com base na sua **classificação**.

### `Main`
Classe principal que:
- Cria instâncias de músicas e podcasts
- Simula curtidas e reproduções
- Verifica a popularidade dos áudios

## 🔍 O que aprendi até aqui

✔️ Criar e organizar classes em pacotes  
✔️ Usar **herança** para reutilizar código  
✔️ Usar **encapsulamento** com `getters` e `setters`  
✔️ **Sobrescrever métodos** (`getClassificacao()`) para personalizar o comportamento  
✔️ Criar lógica condicional baseada em atributos dos objetos  
✔️ Melhorar a leitura e reutilização do código

## 🚀 Próximos passos

- Aplicar **interfaces** para abstrações ainda mais claras  
- Criar testes automatizados com JUnit  
- Implementar persistência de dados com arquivos ou banco de dados  
- Criar uma interface gráfica ou usar terminal interativo para entrada de dados  

---

🧑‍💻 **Este projeto é uma marca da minha progressão como desenvolvedor Java.** Cada linha de código escrita aqui representa uma conquista no meu caminho rumo à fluência na linguagem e no paradigma orientado a objetos.
