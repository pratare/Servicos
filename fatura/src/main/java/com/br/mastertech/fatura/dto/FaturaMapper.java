package com.br.mastertech.fatura.dto;

import com.br.mastertech.fatura.dto.request.FaturaRequest;
import com.br.mastertech.fatura.dto.response.FaturaResponse;
import com.br.mastertech.fatura.dto.response.FaturaSummaryInListResponse;
import com.br.mastertech.fatura.models.Fatura;
import org.springframework.stereotype.Component;

@Component
public class FaturaMapper {

    public FaturaSummaryInListResponse toFaturaSummaryInListResponse(Fatura fatura) {
        FaturaSummaryInListResponse pagamentoSummaryInListResponse = new FaturaSummaryInListResponse();
        pagamentoSummaryInListResponse.setId(fatura.getId());
        pagamentoSummaryInListResponse.setDescricao(fatura.getDescricao());
        pagamentoSummaryInListResponse.setValor(fatura.getValor());
        pagamentoSummaryInListResponse.setCartaoId(fatura.getCartaoid());

        return pagamentoSummaryInListResponse;
    }

}
