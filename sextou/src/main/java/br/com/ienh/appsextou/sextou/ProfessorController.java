package br.com.ienh.appsextou.sextou;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/professor")
public class ProfessorController {
    
    @GetMapping("/teste")
    public String teste(@RequestParam int id, @RequestParam String nome) {
        System.out.println(id);
        System.out.println(nome);
        return "professor/teste";
    }

    @GetMapping("/teste2")
    public String teste2(@RequestParam String nome, Model model) {
        model.addAttribute("nome", nome);
        return "teste2";
    }

}
