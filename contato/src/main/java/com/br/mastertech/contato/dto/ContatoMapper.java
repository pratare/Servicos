package com.br.mastertech.contato.dto;

import com.br.mastertech.contato.dto.request.ContatoRequest;
import com.br.mastertech.contato.dto.response.ContatoDetalheResponse;
import com.br.mastertech.contato.dto.response.ContatoResponse;
import com.br.mastertech.contato.models.Contato;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ContatoMapper {

    public Contato  toContato(ContatoRequest contatoRequest, Integer usuarioId) {
        Contato contato = new Contato();
        contato.setNome(contatoRequest.getNome());
        contato.setTelefone(contatoRequest.getTelefone());
        contato.setUsuarioId(usuarioId);
        return contato;
    }

    public ContatoResponse toContatoResponse(Contato contato) {
        ContatoResponse contatoResponse = new ContatoResponse();
        contatoResponse.setNome(contato.getNome());
        contatoResponse.setTelefone(contato.getTelefone());
        return contatoResponse;
    }

    public List<ContatoResponse> toListContatoResponse(List<Contato> listContato) {
        List<ContatoResponse> listaContatoResponse = new ArrayList<ContatoResponse>();

        listContato.forEach(n -> listaContatoResponse.add(
                new ContatoResponse(n.getNome(),n.getTelefone())));

        return listaContatoResponse;
    }

}
