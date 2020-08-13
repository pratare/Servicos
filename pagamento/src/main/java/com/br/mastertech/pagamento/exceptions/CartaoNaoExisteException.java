package com.br.mastertech.pagamento.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code= HttpStatus.BAD_REQUEST, reason = "Escolha um cartão existente")
public class CartaoNaoExisteException  extends RuntimeException {

}
