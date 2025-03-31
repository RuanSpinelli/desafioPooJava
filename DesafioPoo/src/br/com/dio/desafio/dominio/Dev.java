package br.com.dio.desafio.dominio;

import java.util.*;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosInscrito = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

    // Construtores


    public Dev(String nome, Set<Conteudo> conteudosInscrito, Set<Conteudo> conteudosConcluidos) {
        this.nome = nome;
        this.conteudosInscrito = conteudosInscrito;
        this.conteudosConcluidos = conteudosConcluidos;
    }


    public Dev() {
    }


    // Métodos da classe, o que os Devs vão poder fazer

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscrito.addAll(bootcamp.getConteudos());
        bootcamp.getDevInscritos().add(this);
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscrito.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscrito.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum conteúdo!");
        }
    } 

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().
        mapToDouble(Conteudo :: calcularXp).
        sum();
    }

    // GETTER'S e SETTER'S 

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscrito() {
        return this.conteudosInscrito;
    }

    public void setConteudosInscrito(Set<Conteudo> conteudosInscrito) {
        this.conteudosInscrito = conteudosInscrito;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return this.conteudosConcluidos;
    }

    public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }


    // hashCode e equals

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudosInscrito, conteudosConcluidos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome); // Apenas nome
    }

   

  
}
