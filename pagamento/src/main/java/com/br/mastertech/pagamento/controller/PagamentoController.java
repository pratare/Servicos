package com.br.mastertech.pagamento.controller;

import com.br.mastertech.pagamento.dto.PagamentoMapper;
import com.br.mastertech.pagamento.dto.request.PagamentoRequest;
import com.br.mastertech.pagamento.dto.response.PagamentoResponse;
import com.br.mastertech.pagamento.dto.response.PagamentoSummaryInListResponse;
import com.br.mastertech.pagamento.models.Pagamento;
import com.br.mastertech.pagamento.service.PagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pagamento")
public class PagamentoController {

	@Autowired
	PagamentoService pagamentoService;
	
	@Autowired
	PagamentoMapper pagamentoMapper;
	
	@PostMapping
	public PagamentoResponse criarPagamento(@RequestBody PagamentoRequest pagamentoRequest) {
		Pagamento pagamento = pagamentoMapper.toPagamento(pagamentoRequest);
		pagamento = pagamentoService.criarPagamento(pagamento);
		
		return pagamentoMapper.toPagamentoResponse(pagamento);
	}
	
	@GetMapping("/{id_cartao}")
	public List<PagamentoSummaryInListResponse> listByCartaoId(@PathVariable Integer id_cartao) {
        List<Pagamento> pagamentos = pagamentoService.listPagamentoByCartaoId(id_cartao);
        List<PagamentoSummaryInListResponse> pagamentoSummaryInListResponseList = pagamentos.stream()
                .map(pagamento -> pagamentoMapper.toPagamentoSummaryInListResponse(pagamento))
                .collect(Collectors.toList());
        return pagamentoSummaryInListResponseList;
    }

}