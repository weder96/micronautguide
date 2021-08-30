package wsousa.micronaut.controller;


import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import wsousa.micronaut.domain.Livro;
import wsousa.micronaut.service.BibliotecaService;

import java.util.List;

@Controller("/livro")
public class BibliotecaController {
    private final BibliotecaService bibliotecaService;

    public BibliotecaController(final BibliotecaService bibliotecaService){
        this.bibliotecaService = bibliotecaService;
    }

    @Get
    public List<Livro> listagemLivrosPorTitulo() {
        List<Livro> livros = bibliotecaService.pesquisaLivrosDeComputacaoAgrupadosPorTitulo();
        return livros;
    }

    @Get("/hello")
    public String index() {
        return "Hello World";
    }
}
