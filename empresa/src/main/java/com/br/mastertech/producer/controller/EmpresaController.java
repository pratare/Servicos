package com.br.mastertech.producer.controller;

import com.br.mastertech.producer.dto.EmpresaMapper;
import com.br.mastertech.producer.dto.request.EmpresaRequest;
import com.br.mastertech.producer.dto.response.EmpresaResponse;
import com.br.mastertech.producer.producer.Empresa;
import com.br.mastertech.producer.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaService empresaService;

    @Autowired
    private EmpresaMapper empresaMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EmpresaResponse cadastarEmpresa(@RequestBody EmpresaRequest empresaRequest) {
        Empresa empresa = empresaMapper.toEmpresa(empresaRequest);
        empresaService.cadastrar(empresa);
        return empresaMapper.toEmpresaResponse(empresa);
    }

}
