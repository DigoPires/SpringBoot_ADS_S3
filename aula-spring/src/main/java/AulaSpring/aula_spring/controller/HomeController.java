package AulaSpring.aula_spring.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import AulaSpring.aula_spring.service.ProdutoService;

@Controller
public class HomeController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/home")
    public String home(Model model){
        model.addAttribute("destaques", produtoService.listarDestaques());
        model.addAttribute("produtos", produtoService.listarTodos());

        // Adicionar as categorias
        List<String> categorias = Arrays.asList("SmartPhone", "Notebooks", "Fones");
        model.addAttribute("categorias", categorias);
        return "home";
    }
}
