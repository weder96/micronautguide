package wsousa.micronaut.domain;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Livro {

    private String titulo;
    private int nrDePaginas;
    private Topico topico;
    private Year dataPublicacao;
    private List<String> autores = new ArrayList<>();

    public Livro(String titulo, int nrDePaginas, Topico topico, Year dataPublicacao, String... autores) {
        this.titulo = titulo;
        this.nrDePaginas = nrDePaginas;
        this.topico = topico;
        this.dataPublicacao = dataPublicacao;
        this.autores = Arrays.asList(autores);
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNrDePaginas(int nrDePaginas) {
        this.nrDePaginas = nrDePaginas;
    }

    public void setTopico(Topico topico) {
        this.topico = topico;
    }

    public void setDataPublicacao(Year dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }


    public String titulo() {
        return titulo;
    }

    public int nrDePaginas() {
        return nrDePaginas;
    }

    public Topico topico() {
        return topico;
    }

    public Year dataPublicacao() {
        return dataPublicacao;
    }

    public List<String> autores() {
        return autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNrDePaginas() {
        return nrDePaginas;
    }

    public Topico getTopico() {
        return topico;
    }

    public Year getDataPublicacao() {
        return dataPublicacao;
    }

    public List<String> getAutores() {
        return autores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nrDePaginas == livro.nrDePaginas &&
                titulo.equals(livro.titulo) &&
                topico == livro.topico &&
                dataPublicacao.equals(livro.dataPublicacao) &&
                autores.equals(livro.autores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, nrDePaginas, topico, dataPublicacao, autores);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titulo='" + titulo + '\'' +
                ", nrDePaginas=" + nrDePaginas +
                ", topico=" + topico +
                ", dataPublicacao=" + dataPublicacao +
                ", autores=" + autores +
                '}';
    }

}
