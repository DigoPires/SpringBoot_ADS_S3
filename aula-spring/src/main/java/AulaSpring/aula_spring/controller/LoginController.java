package AulaSpring.aula_spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import AulaSpring.aula_spring.service.UsuarioService;

@Controller
public class LoginController {
    @Autowired
    // Injeta o código do service na Classe
    private UsuarioService usuarioService;

    // Fornece a página login.html
    @GetMapping("/login")
    public String telaLogin(){
        return "login"; // Retorna a página HTML
    }
    
    @PostMapping("/login")
        public String fazerLogin(@RequestParam String email, @RequestParam String senha, RedirectAttributes redirectAttributes){
            boolean loginValido = usuarioService.validarLogin(email, senha);
            if(loginValido){
                return "redirect:/home";
            }
            redirectAttributes.addFlashAttribute("mensagem", "Falha");
            redirectAttributes.addFlashAttribute("alertClass", "alert-error");
            return "redirect:/login";
        }

}

