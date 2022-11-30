package br.com.apiprodutos.controller;

import br.com.apiprodutos.entity.Produto;
import br.com.apiprodutos.service.ProdutoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping ("/api/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @GetMapping
    public ResponseEntity <List<Produto>> buscarTodos(){
        return ResponseEntity.ok(produtoService.buscarTodos());
    }

    public ResponseEntity <Produto> salvar(@RequestBody Produto produto){
        var novoProduto = produtoService.salvar(produto);
        return new ResponseEntity(produto, HttpStatus.CREATED);
    }


}