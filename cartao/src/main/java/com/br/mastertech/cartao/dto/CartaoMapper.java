package com.br.mastertech.cartao.dto;


import com.br.mastertech.cartao.dto.request.CartaoRequest;
import com.br.mastertech.cartao.dto.response.CartaoAtivoResponse;
import com.br.mastertech.cartao.dto.response.CartaoDetalheResponse;
import com.br.mastertech.cartao.dto.response.CartaoResponse;
import com.br.mastertech.cartao.models.Cartao;
import org.springframework.stereotype.Component;

@Component
public class CartaoMapper {
	
	public Cartao toCartao(CartaoRequest cartaoRequest){
		Cartao cartao = new Cartao();
		cartao.setNumero(cartaoRequest.getNumero());
		cartao.setClienteId(cartaoRequest.getClienteId());

        return cartao;
    }
	
	public CartaoResponse toCartaoResponse(Cartao cartao) {
		CartaoResponse cartaoResponse = new CartaoResponse();
		cartaoResponse.setId(cartao.getId());
		cartaoResponse.setNumero(cartao.getNumero());
		cartaoResponse.setAtivo(false);
		cartaoResponse.setClienteId(cartao.getClienteId());
        return cartaoResponse;
    }
	
	public CartaoDetalheResponse toCartaoDetalheResponse(Cartao cartao) {
		CartaoDetalheResponse cartaoDetalheResponse = new CartaoDetalheResponse();
		cartaoDetalheResponse.setId(cartao.getId());
		cartaoDetalheResponse.setNumero(cartao.getNumero());
		cartaoDetalheResponse.setAtivo(cartao.getAtivo());
		cartaoDetalheResponse.setClienteId(cartao.getClienteId());
        return cartaoDetalheResponse;
    }
	
	public CartaoAtivoResponse toCartaoAtivoResponse(Cartao cartao) {
        CartaoAtivoResponse cartaoAtivoResponse = new CartaoAtivoResponse();

        cartaoAtivoResponse.setId(cartao.getId());
        cartaoAtivoResponse.setNumero(cartao.getNumero());
        cartaoAtivoResponse.setAtivo(cartao.getAtivo());
        cartaoAtivoResponse.setClienteId(cartao.getClienteId());

        return cartaoAtivoResponse;
    }


}
