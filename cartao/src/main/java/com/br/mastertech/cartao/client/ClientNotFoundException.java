package com.br.mastertech.cartao.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Cliente não encontrado")
public class ClientNotFoundException extends RuntimeException {
}

