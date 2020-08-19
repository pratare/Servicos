package com.br.mastertech.acesso.client.cliente;

public class ClienteClientFallback implements ClientCliente {

    @Override
    public ClienteDTO buscaById(Integer id) {
        throw new ClientNotFoundException();
    }
}
