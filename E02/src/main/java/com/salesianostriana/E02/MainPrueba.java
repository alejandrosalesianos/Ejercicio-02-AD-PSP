package com.salesianostriana.E02;

import com.salesianostriana.E02.model.Pais;
import com.salesianostriana.E02.repos.PaisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final PaisRepository repository;

    @PostConstruct
    public void prueba(){
        Pais pais = new Pais();
        System.out.printf("%s\n",pais.getId().toString());
    }
}
