package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.*;



public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);

    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();


   



    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return this.dataInicial;
    }


    public LocalDate getDataFinal() {
        return this.dataFinal;
    }


    public Set<Dev> getDevInscritos() {
        return this.devInscritos;
    }

    public void setDevInscritos(Set<Dev> devInscritos) {
        this.devInscritos = devInscritos;
    }

    public Set<Conteudo> getConteudos() {
        return this.conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, descricao, dataInicial, dataFinal, devInscritos, conteudos);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) &&
            Objects.equals(descricao, bootcamp.descricao) &&
            Objects.equals(dataInicial, bootcamp.dataInicial) &&
            Objects.equals(dataFinal, bootcamp.dataFinal) &&
            Objects.equals(devInscritos, bootcamp.devInscritos) &&
            Objects.equals(conteudos, bootcamp.conteudos);
    }





}
