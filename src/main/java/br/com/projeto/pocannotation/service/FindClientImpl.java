package br.com.projeto.pocannotation.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FindClientImpl implements FindClient {

    @Override
    public List<?> findCLient(Long id) {
        return List.of("diego", "danniel", "maria");
    }

}
