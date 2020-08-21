package com.br.mastertech.cep.service;

import com.br.mastertech.cep.client.Cep;
import com.br.mastertech.cep.client.CepClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.sleuth.annotation.NewSpan;
import org.springframework.cloud.sleuth.annotation.SpanTag;
import org.springframework.stereotype.Service;

@Service
public class CepService {

    @Autowired
    private CepClient cepClient;

    @NewSpan(name = "viacep-service")
    public Cep getByCep(@SpanTag("cep") String cep) {
        return cepClient.getCep(cep);
    }

}

