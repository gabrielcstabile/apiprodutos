package br.com.apiprodutos.service;

import br.com.apiprodutos.entity.Produto;

import java.util.List;

public interface ProdutoService {

    List <Produto> buscarTodos();
    Produto salvar(Produto produto);
    void delete (Long id);

}
