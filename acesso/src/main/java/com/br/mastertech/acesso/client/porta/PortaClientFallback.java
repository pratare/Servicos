package com.br.mastertech.acesso.client.porta;

public class PortaClientFallback implements ClientPorta {

    @Override
    public PortaDTO buscaById(Integer id) {
        throw new DoorNotFoundException();
    }
}
