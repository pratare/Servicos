package com.br.mastertech.cartao.service;


import com.br.mastertech.cartao.client.ClientCliente;
import com.br.mastertech.cartao.client.Cliente;
import com.br.mastertech.cartao.exception.CartaoNotFoundException;
import com.br.mastertech.cartao.models.Cartao;
import com.br.mastertech.cartao.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    @Autowired
    private ClientCliente cliente;


    public Cartao mostrarCartao(String numero) {
    	Optional<Cartao> cartaoOptional = cartaoRepository.getByNumero(numero);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();

    }
    
    public Cartao mostrarCartaoId(Integer id) {
    	Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();

    }

    public Cartao criarCartao(Cartao cartao) {
        Cliente byId = null;


        cliente.getClienteById(cartao.getClienteId());

        cartao.setAtivo(false);

        return cartaoRepository.save(cartao);
    }

    public Cartao ativar(String numero, boolean ativo) {
    	
    	Cartao cartao = mostrarCartao(numero);
        cartao.setAtivo(ativo);
    	
        return cartaoRepository.save(cartao);
    }
    
    public Cartao buscarCartao(Integer id) {
        Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }

}
