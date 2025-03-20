package dev.java10x.cadastrodeninjas.ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class NinjaController {

    @GetMapping("/boas-vindas")
    public String boasVindas(){
        return "Bem vindo ao Cadastro de Ninjas!";
    }

}
