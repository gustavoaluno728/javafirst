package br.com.projeto.api.controler;

@RestController
public class Controle {

    @GetMapping("")
    public String mensagem(){
return "Ola Mundo do DaniBoy";
    }

    @GetMapping("/bemVindo")
    public String boasVindas(){
        return "Seja bem-vindo Daniel";
    }
}
