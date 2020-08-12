package com.br.mastertech.cartao.controller;


import com.br.mastertech.cartao.dto.CartaoMapper;
import com.br.mastertech.cartao.dto.request.CartaoAtivoRequest;
import com.br.mastertech.cartao.dto.request.CartaoRequest;
import com.br.mastertech.cartao.dto.response.CartaoAtivoResponse;
import com.br.mastertech.cartao.dto.response.CartaoDetalheResponse;
import com.br.mastertech.cartao.dto.response.CartaoResponse;
import com.br.mastertech.cartao.models.Cartao;
import com.br.mastertech.cartao.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

	@Autowired
	private CartaoService cartaoService;
	
	@Autowired
	private CartaoMapper cartaoMapper;
	
	@GetMapping("/{numero}")
	public CartaoDetalheResponse exibeCartao(@PathVariable String numero) {
        Cartao cartao = cartaoService.mostrarCartao(numero);
        return cartaoMapper.toCartaoDetalheResponse(cartao);

	}
	
	@GetMapping("/cartoes/{id}")
	public CartaoDetalheResponse exibeCartaoId(@PathVariable Integer id) {
        Cartao cartao = cartaoService.mostrarCartaoId(id);
        return cartaoMapper.toCartaoDetalheResponse(cartao);

	}

	@PostMapping
	public CartaoResponse cadastrarNovoCartao(@Valid @RequestBody CartaoRequest cartaoRequest){
		Cartao cartao = cartaoMapper.toCartao(cartaoRequest);
		cartao = cartaoService.criarCartao(cartao);
		return cartaoMapper.toCartaoResponse(cartao);
	}
	
	@PatchMapping("/{numero}")
    public CartaoAtivoResponse ativarCartao(@PathVariable String numero, @Valid  @RequestBody CartaoAtivoRequest cartaoAtivoRequest) {
        Cartao cartao = cartaoService.ativar(numero, cartaoAtivoRequest.getAtivo());
        return cartaoMapper.toCartaoAtivoResponse(cartao);
    }


}
