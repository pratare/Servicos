package com.br.mastertech.pagamento.dto;

import com.br.mastertech.pagamento.dto.request.PagamentoRequest;
import com.br.mastertech.pagamento.dto.response.PagamentoResponse;
import com.br.mastertech.pagamento.dto.response.PagamentoSummaryInListResponse;
import com.br.mastertech.pagamento.models.Pagamento;
import org.springframework.stereotype.Component;

@Component
public class PagamentoMapper {
	
	public Pagamento toPagamento(PagamentoRequest pagamentoRequest) {
		Pagamento pagamento = new Pagamento();
		pagamento.setDescricao(pagamentoRequest.getDescricao());
		pagamento.setValor(pagamentoRequest.getValor());
		pagamento.setCartaoid(pagamentoRequest.getCartaoid());
		
		return pagamento;
	}

	public PagamentoResponse toPagamentoResponse(Pagamento pagamento) {
		PagamentoResponse pagamentoResponse = new PagamentoResponse();
		
		pagamentoResponse.setCartaoid(pagamento.getCartaoid());
		pagamentoResponse.setDescricao(pagamento.getDescricao());
		pagamentoResponse.setValor(pagamento.getValor());
		pagamentoResponse.setId(pagamento.getId());
		
		return pagamentoResponse;
		
	}
	
	public PagamentoSummaryInListResponse toPagamentoSummaryInListResponse(Pagamento pagamento) {
        PagamentoSummaryInListResponse pagamentoSummaryInListResponse = new PagamentoSummaryInListResponse();
        pagamentoSummaryInListResponse.setId(pagamento.getId());
        pagamentoSummaryInListResponse.setDescricao(pagamento.getDescricao());
        pagamentoSummaryInListResponse.setValor(pagamento.getValor());
        pagamentoSummaryInListResponse.setCartaoId(pagamento.getCartaoid());

        return pagamentoSummaryInListResponse;
    }

	
}
