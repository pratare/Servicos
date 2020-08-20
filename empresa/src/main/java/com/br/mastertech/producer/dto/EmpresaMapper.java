package com.br.mastertech.producer.dto;


import com.br.mastertech.producer.dto.request.EmpresaRequest;
import com.br.mastertech.producer.dto.response.EmpresaResponse;
import com.br.mastertech.producer.producer.Empresa;
import org.springframework.stereotype.Component;

@Component
public class EmpresaMapper {

    public Empresa toEmpresa(EmpresaRequest empresaRequest){
        Empresa empresa = new Empresa();
        empresa.setName(empresaRequest.getName());
        empresa.setCNPJ(empresaRequest.getCNPJ());
        return empresa;
    }

    public EmpresaResponse toEmpresaResponse(Empresa empresa) {
        EmpresaResponse empresaResponse = new EmpresaResponse();
        empresaResponse.setName(empresa.getName());
        empresaResponse.setName(empresa.getCNPJ());
        return empresaResponse;
    }

}
