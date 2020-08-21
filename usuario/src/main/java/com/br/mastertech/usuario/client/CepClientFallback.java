package com.br.mastertech.usuario.client;

public class CepClientFallback implements ClientCep {

    @Override
    public CepDTO buscaCep(String cep) {
        return null;
    }
}
