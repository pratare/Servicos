package com.br.mastertech.fatura.service;

import com.br.mastertech.fatura.client.ClientCliente;
import com.br.mastertech.fatura.client.ClientCartao;
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
    ClientCartao clientCartao;

    @Autowired
    ClientCliente clientCliente;

    public List<Fatura> listFaturaByCartaoId(Integer clientid, Integer cartaoid) {
        PagamentoDTO pagamentoDTO = null;

        pagamentoDTO = clientCliente.buscaByIdCliente(clientid);

        pagamentoDTO = clientCartao.buscaById(cartaoid);

        return faturaRepository.findAllByCartaoId(pagamentoDTO.getId());
    }


}
