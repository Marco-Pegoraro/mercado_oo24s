package br.edu.utfpr.supermercado_oo24s;

import br.edu.utfpr.supermercado_oo24s.model.Produto;
import br.edu.utfpr.supermercado_oo24s.service.CRUD.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SupermercadoOo24SApplication {

    @Autowired
    private ProdutoService produtoService;

    public static void main(String[] args) {
        SpringApplication.run(SupermercadoOo24SApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void doSomethingAfterStartup() {
        produtoService.insereNovoProduto(
                Produto.builder()
                        .nome("Bolacha Qualquer")
                        .valor(15.50)
                        .build()
                , 20
        );
    }
}
