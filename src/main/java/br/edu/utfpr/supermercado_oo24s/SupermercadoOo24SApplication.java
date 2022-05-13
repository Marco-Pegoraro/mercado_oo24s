package br.edu.utfpr.supermercado_oo24s;

import br.edu.utfpr.supermercado_oo24s.service.ValidadorCPF;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SupermercadoOo24SApplication {

    private ValidadorCPF validadorCPF;

    public static void main(String[] args) {SpringApplication.run(SupermercadoOo24SApplication.class, args);}

    /*
    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        System.out.println(validadorCPF.isCPF("60014194007"));
        System.out.println(validadorCPF.imprimeCPF("60014194007"));
    }
    */
}
