package br.edu.utfpr.supermercado_oo24s;

import br.edu.utfpr.supermercado_oo24s.service.ValidadorCPF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SupermercadoOo24SApplication {

    @Autowired


    private ValidadorCPF validadorCPF;

    public static void main(String[] args) {SpringApplication.run(SupermercadoOo24SApplication.class, args);}

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {

    }
}
