package com.br.mastertech.cep.controller;

import com.br.mastertech.cep.client.Cep;
import com.br.mastertech.cep.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cep")
public class CepControler {

    @Autowired
    private CepService cerService;

    @GetMapping("/{cep}")
    public Cep create(@PathVariable String cep) {
        return cerService.getByCep(cep);
    }
}
