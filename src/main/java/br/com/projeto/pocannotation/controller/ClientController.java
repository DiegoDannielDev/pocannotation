package br.com.projeto.pocannotation.controller;

import br.com.projeto.pocannotation.annotations.VerifierId;
import br.com.projeto.pocannotation.service.FindClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/client")
@RequiredArgsConstructor
public class ClientController {

    private final FindClient findClient;

    @GetMapping("/{id}")
    @VerifierId
    public List<?> findClientControll(@PathVariable(value = "id") Long id) {
        return findClient.findCLient(id);
        //TESTE
    }
}
