package AulaSpring.aula_spring.model;

import java.time.LocalDateTime;

public class Usuario {
    // Atributos - Características
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private String senha;
    private LocalDateTime dataCadastro;

    public Usuario(){
        this.dataCadastro = LocalDateTime.now();
    }

    public Usuario(
        String nome,
        String email,
        String telefone,
        String senha
    ){
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.senha = senha;
        this.dataCadastro = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
}
