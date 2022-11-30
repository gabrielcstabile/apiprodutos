package br.com.apiprodutos.service.impl;

import br.com.apiprodutos.entity.Produto;
import br.com.apiprodutos.repository.ProdutoRepository;
import br.com.apiprodutos.service.ProdutoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;

    public ProdutoServiceImpl(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public List<Produto> buscarTodos() {
        return produtoRepository.findAll();
    }

    @Override
    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public void delete(Long id) {
        try{
            produtoRepository.deleteById(id);
        } catch (Exception e){
            throw new RuntimeException("Erro ao excluir produto.");
        }

    }
}