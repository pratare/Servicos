package com.br.mastertech.contato.controller;

import com.br.mastertech.contato.dto.ContatoMapper;
import com.br.mastertech.contato.dto.request.ContatoRequest;
import com.br.mastertech.contato.dto.response.ContatoResponse;
import com.br.mastertech.contato.models.Contato;
import com.br.mastertech.contato.security.ContatoAutorizado;
import com.br.mastertech.contato.service.ContatoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ContatoController {

    Logger logger = LoggerFactory.getLogger(ContatoController.class);

    @Autowired
    ContatoMapper contatoMapper;

    @Autowired
    ContatoService contatoService;

    @PostMapping("/{contato}")
    @ResponseStatus(HttpStatus.CREATED)
    public ContatoResponse cadastrarCliente(@RequestBody ContatoRequest contatoRequest, @AuthenticationPrincipal ContatoAutorizado contatoAutorizado) {

        logger.info("Salvando contato " + contatoRequest.getNome() );

        Contato contato = contatoMapper.toContato(contatoRequest, contatoAutorizado.getId());
        contato = contatoService.cadastrar(contato);
        return contatoMapper.toContatoResponse(contato);
    }

    @GetMapping("/{contatos}")
    public List<ContatoResponse> exibeContatos(@AuthenticationPrincipal ContatoAutorizado contatoAutorizado) {

        logger.info("Buscando lista de contato do usuario : " + contatoAutorizado.getName());

        List<Contato> contatos = contatoService.buscarContato(contatoAutorizado.getId());
        return contatoMapper.toListContatoResponse(contatos);

    }

}
