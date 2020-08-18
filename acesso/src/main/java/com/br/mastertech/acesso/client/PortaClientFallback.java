package com.br.mastertech.acesso.client;

public class PortaClientFallback implements ClientPorta {

    @Override
    public PortaDTO buscaById(Integer id) {
        throw new DoorNotFoundException();
    }
}
