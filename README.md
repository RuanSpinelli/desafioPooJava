# desafioPooJava

desafio do [dio.me](https://web.dio.me/project/abstraindo-um-bootcamp-usando-orientacao-objetos-em-java/learning/8afcd659-978c-477c-93db-846b83c2927e?back=/track/formacao-java-developer) para por em prática princípios e paradigmas de orientação a objeto usando a linguagem de programação java.


# Abstração

A habilidade de abstrair consiste em criar uma arquitetura de software que aproveite o que é necessário para resolver um problema, sem considerar informações que são irelevantes para o caso.

## Exemplo

Quando um sistema de uma livraria vai ser projetado, e precisa guardar informações sobre os autores dos livros, existem informações que são importantes a respeito de que fez as obras (Nome, data de nascimento, data de falecimento, quantas obras escreveu, quais obras escreveu). Não faria sentido guardar informações que não são relevantes, como a cor do olho, tamanho do bigode e etc.


# Encapsulamento

A possíbilidade guardar informações dentro de um escopo específico, como por exemplo, os atributos e métodos de um objeto, aonde apenas dentro do escopo da própria classe é possível manipular tais informações.

## Exemplo

Uma classe que representa pessoas, contem os atributos Nome, Idade e CPF, São informações importantes e relevantes, e não podem ser modificadas por acidente. É por isso que é importante criar métodos de GET e SET, para que seja feita a operação de modificação e obtenção dos dados de forma responsável e segura
