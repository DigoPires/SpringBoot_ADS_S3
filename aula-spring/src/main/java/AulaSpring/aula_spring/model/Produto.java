package AulaSpring.aula_spring.model;

import java.util.*;
 
import java.math.BigDecimal;
 
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Data
@NoArgsConstructor // Cria o get e setters
 
public class Produto {
    private Long id;
    private String nome;
    private String descricao;
    private BigDecimal preco;
    private String categoria;
    private String imageUrl;
    private Integer estoque;
    private boolean destaque;
    private List<String> tags = new ArrayList<>();
    private Double avalicao;
    private Integer vendastotais;
 
 
   
    public Produto(Long id, String nome, String descricao, BigDecimal preco, String categoria, String imageUrl,
        Integer estoque, boolean destaque, List<String> tags, Double avalicao, Integer vendastotais) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.categoria = categoria;
        this.imageUrl = imageUrl;
        this.estoque = estoque;
        this.destaque = destaque;
        this.tags = tags;
        this.avalicao = 0.0;
        this.vendastotais = 0;
    }
 
    public void addTag(String tag){
        this.tags.add(tag);
    }
    public String getPrecoFormatado(){
        return "R$" + preco.toString().replace(".", "," );
    }
 
}