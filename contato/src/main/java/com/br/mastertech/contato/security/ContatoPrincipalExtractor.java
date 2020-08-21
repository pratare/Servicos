package com.br.mastertech.contato.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class ContatoPrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        ContatoAutorizado contatoAutorizado = new ContatoAutorizado();

        contatoAutorizado.setId((Integer) map.get("id"));
        contatoAutorizado.setName((String) map.get("name"));

        return contatoAutorizado;
    }
}
