package com.br.mastertech.acesso.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.NOT_FOUND, reason = "Favor escolher um cartão ativo")
public class CartaoInativoException extends RuntimeException {

}
