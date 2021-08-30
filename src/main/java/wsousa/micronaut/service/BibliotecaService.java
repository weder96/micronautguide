package wsousa.micronaut.service;

import wsousa.micronaut.domain.Livro;
import wsousa.micronaut.domain.Topico;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface BibliotecaService {

    Livro pesquisaLivroPorTitulo(String titulo);

    List<Livro> pesquisaLivrosDeComputacaoAgrupadosPorTitulo();

    Optional<Topico> topicoMaisPopular();

    List<String> pesquisaTitulosDosLivros();

    Map<Topico, List<Livro>> livrosAgrupadosPorTopico();

    Map<Topico, Long> contagemDosLivrosPorTopico();

    int contagemDosLivros();

    void adiciona(Livro livro);

    Integer compute(Integer num);
}
