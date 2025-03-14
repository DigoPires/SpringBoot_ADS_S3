package AulaSpring.aula_spring.service;

import java.util.*;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import AulaSpring.aula_spring.model.Produto;

@Service
public class ProdutoService {
    // Lista Produtos do site
    private final List<Produto> produtos = new ArrayList();

    // Método de listar todos os produtos
    public List<Produto> listarTodos(){
        return new ArrayList<>(produtos);
    }

    // Método que vai listar os produtos destaques
    public List<Produto> listarDestaques(){
        return produtos.stream().filter(Produto::isDestaque).collect(Collectors.toList());
    }

    public ProdutoService(){
        // Chama o método assim que a classe é inicializada
        this.inicializarProduto();
    }

    // Método para inicializar a classe
    private void inicializarProduto(){
        Produto p1 = new Produto();

        
    }
}