package com.br.mastertech.pagamento.client;

public class CartaoClientFallback implements ClientCartao {

    @Override
    public CartaoDTO buscaById(Integer id) {
        throw new CardNotFoundException();
    }
}
