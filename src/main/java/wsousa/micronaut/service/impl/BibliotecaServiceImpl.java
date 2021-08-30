package wsousa.micronaut.service.impl;


import wsousa.micronaut.domain.Livro;
import wsousa.micronaut.domain.Topico;
import wsousa.micronaut.repository.LivroDAO;
import wsousa.micronaut.service.BibliotecaService;

import javax.inject.Singleton;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Singleton
public class BibliotecaServiceImpl implements BibliotecaService {

    private final LivroDAO dao;

    public BibliotecaServiceImpl() {
        this.dao = new LivroDAO();
        this.dao.carregaBiblioteca(LivroDAO.DEFAULT_PATH);
    }

    @Override
    public Livro pesquisaLivroPorTitulo(String title) {
        return dao.obtemLivroComTitulo(title);
    }

    @Override
    public List<Livro> pesquisaLivrosDeComputacaoAgrupadosPorTitulo() {
        return dao.obtemListaDeLivrosComputacaoOrganizadaPorTitulo();
    }

    @Override
    public Optional<Topico> topicoMaisPopular() {
        return dao.topicoMaisPopular();
    }

    @Override
    public List<String> pesquisaTitulosDosLivros() {
        return dao.obtemTitulosDosLivros();
    }

    @Override
    public Map<Topico, List<Livro>> livrosAgrupadosPorTopico() {
        return dao.livrosAgrupadosPorTopico();
    }

    @Override
    public Map<Topico, Long> contagemDosLivrosPorTopico() {
        return dao.contagemDeLivrosPorTopico();
    }

    @Override
    public int contagemDosLivros() {
        return dao.contagemDosLivros();
    }

    @Override
    public void adiciona(Livro livro) {
        this.dao.adiciona(livro);
    }

    @Override
    public Integer compute(Integer num) { return num * 4;  }
}