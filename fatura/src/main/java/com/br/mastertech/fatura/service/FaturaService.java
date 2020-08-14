package com.br.mastertech.fatura.service;

import com.br.mastertech.fatura.client.ClientCliente;
import com.br.mastertech.fatura.client.ClientPagamentos;
import com.br.mastertech.fatura.client.PagamentoDTO;
import com.br.mastertech.fatura.models.Fatura;
import com.br.mastertech.fatura.repository.FaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FaturaService {

    @Autowired
    FaturaRepository faturaRepository;

    @Autowired
    ClientPagamentos clientPagamentos;

    @Autowired
    ClientCliente clientCliente;

    public List<Fatura> listFaturaByCartaoId(Integer clientid, Integer cartaoid) {
        PagamentoDTO pagamentoDTO = null;

        pagamentoDTO = clientCliente.buscaByIdCliente(clientid);

        pagamentoDTO = (PagamentoDTO) clientPagamentos.buscaById(cartaoid);

        return faturaRepository.findAllByCartaoId(pagamentoDTO.getId());
    }


}
