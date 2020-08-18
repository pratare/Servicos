package com.br.mastertech.acesso.client;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Cartão não encontrado")
public class DoorNotFoundException extends RuntimeException {
}

