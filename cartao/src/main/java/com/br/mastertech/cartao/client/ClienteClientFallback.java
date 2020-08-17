package com.br.mastertech.cartao.client;

import com.br.mastertech.cartao.exception.CartaoNotFoundException;

public class ClienteClientFallback implements ClientCliente {

    @Override
    public Cliente getClienteById(int id) {
        throw new ClientNotFoundException();
    }
}
