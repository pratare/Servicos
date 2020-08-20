package com.br.mastertech.producer.service;

import com.br.mastertech.producer.producer.DadosEmpresa;
import com.br.mastertech.producer.producer.Empresa;
import com.br.mastertech.producer.producer.DadosEmpresaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {

    @Autowired
    DadosEmpresaProducer dadosEmpresaProducer;

    public void cadastrar(Empresa empresa) {
        DadosEmpresa dadosEmpresa = new DadosEmpresa();
        dadosEmpresa.setCNPJEmpresa(empresa.getCNPJ());
        dadosEmpresa.setNomeEmpresa(empresa.getName());
        System.out.println(empresa.getCNPJ() + " " + empresa.getName());
        dadosEmpresaProducer.enviarAoKafka(dadosEmpresa);

    }

}
