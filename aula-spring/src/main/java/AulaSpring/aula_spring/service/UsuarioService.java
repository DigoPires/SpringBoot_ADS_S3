package AulaSpring.aula_spring.service;

import java.util.*;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;
import AulaSpring.aula_spring.model.Usuario;

@Service
public class UsuarioService {
    // Criamos uma lista que irá receber os usuários
    private final List<Usuario> usuarios = new ArrayList<>();
    // Contador para o campo Id
    private final AtomicLong contador = new AtomicLong(1);

    public Usuario cadastrar(Usuario usuario){
        usuarios.add(usuario);
        return usuario;
    }

    public List<Usuario> listarTodos(){
        return new ArrayList<>(usuarios);
    }

    public boolean validarLogin(String email, String senha){
        for(Usuario usuario : usuarios){
            if(usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)){
                return true;
            }
        }

        return false;
    }

}
