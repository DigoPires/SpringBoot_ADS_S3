package AulaSpring.aula_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import AulaSpring.aula_spring.service.UsuarioService;
import org.springframework.ui.Model;
import AulaSpring.aula_spring.model.Usuario;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class UsuarioController {
    @Autowired // injeção de dependência
    private UsuarioService usuarioService;


    @PostMapping("/cadastro")
    public String cadastro(@RequestParam Usuario usuario, RedirectAttributes redirectAttributes) {
        usuarioService.cadastrar(usuario);
        redirectAttributes.addFlashAttribute("Mensagem", "Usuário cadastrado");
        redirectAttributes.addFlashAttribute("alertClass", "alert-success");
        return "redirect:/cadastro";
    }
    
    @GetMapping("/usuarios")
    public String listarUsuarios(Model model) {
        model.addAttribute("usuarios", usuarioService.listarTodos());
        return"listar-usuarios";
    }
    
}
