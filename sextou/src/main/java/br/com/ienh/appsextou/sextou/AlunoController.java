package br.com.ienh.appsextou.sextou;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/aluno")
public class AlunoController {

    @GetMapping("/olaMundo")
    public String olaMundo() {
        return "ola";
    }

    @GetMapping("/sextou")
    public String sextou() {
        return "sextou";
    }

    @GetMapping("/olaMundo2")
    public String olaMundo2() {
        return "ola/ola2";
    }

}
