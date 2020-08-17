package com.br.mastertech.fatura.client;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Pagamento não encontrado")
public class PaymentNotFoundException extends RuntimeException {
}

