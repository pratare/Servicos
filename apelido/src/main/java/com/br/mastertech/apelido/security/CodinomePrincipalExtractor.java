package com.br.mastertech.apelido.security;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class CodinomePrincipalExtractor implements PrincipalExtractor {

    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        Codinome codinome = new Codinome();

        codinome.setId((Integer) map.get("id"));
        codinome.setNomeVerdadeiro((String) map.get("name"));

        return codinome;
    }
}
