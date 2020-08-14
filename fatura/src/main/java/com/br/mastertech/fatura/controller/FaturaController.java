package com.br.mastertech.fatura.controller;

import com.br.mastertech.fatura.dto.FaturaMapper;
import com.br.mastertech.fatura.dto.response.FaturaResponse;
import com.br.mastertech.fatura.dto.response.FaturaSummaryInListResponse;
import com.br.mastertech.fatura.models.Fatura;
import com.br.mastertech.fatura.service.FaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/fatura")
public class FaturaController {

	@Autowired
	FaturaService faturaService;

	@Autowired
	FaturaMapper faturaMapper;
	
	@GetMapping("/{clientid}/{cartaoid}")
	public List<FaturaSummaryInListResponse> exibeFatura(@PathVariable Integer clientid, Integer cartaoid) {
		List<Fatura> faturas = faturaService.listFaturaByCartaoId(clientid, cartaoid);
		List<FaturaSummaryInListResponse> faturaSummaryInListResponseList = faturas.stream()
				.map(fatura -> faturaMapper.toFaturaSummaryInListResponse(fatura))
				.collect(Collectors.toList());
		return faturaSummaryInListResponseList;

//
//		List<Fatura> faturas = faturaService.listFaturaByCartaoId(clientid, cartaoid);
//		return faturas;
	}
	
	@PostMapping("/{cliente-id}/{cartao-id}/pagar")
	public FaturaResponse pagarFatura(@PathVariable Integer clienteid, Integer cartaoid) {
		return null;
	}

	@PostMapping("/{cliente-id}/{cartao-id}/expirar")
	public FaturaResponse expirarFatura(@PathVariable Integer clienteid, Integer cartaoid) {
		return null;
	}

}
