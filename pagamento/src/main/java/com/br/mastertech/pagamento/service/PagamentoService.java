package com.br.mastertech.pagamento.service;

import com.br.mastertech.pagamento.client.CartaoDTO;
import com.br.mastertech.pagamento.client.ClientCartao;
import com.br.mastertech.pagamento.exceptions.CartaoInativoException;
import com.br.mastertech.pagamento.exceptions.CartaoNaoExisteException;
import com.br.mastertech.pagamento.models.Pagamento;
import com.br.mastertech.pagamento.repository.PagamentoRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PagamentoService {
	
	@Autowired
	PagamentoRepository pagamentoRepository;
	
	@Autowired
	ClientCartao clientCartao;
	
	public Pagamento criarPagamento(Pagamento pagamento) {
		CartaoDTO cartaoDTO = null;
		try {
			cartaoDTO = clientCartao.buscaById(pagamento.getCartaoid());
		} catch(FeignException.BadRequest e) {
			throw new CartaoNaoExisteException();
		}
		if(!cartaoDTO.getAtivo()) {
			throw new CartaoInativoException();
		}
        pagamento.setCartaoid(cartaoDTO.getId());

		return pagamentoRepository.save(pagamento);
		 
	}

	public List<Pagamento> listPagamentoByCartaoId(Integer id) {
        return pagamentoRepository.findAllByCartaoId(id);
    }

	
}
