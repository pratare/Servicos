package com.br.mastertech.fatura.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FaturaClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if(response.status() == 404) {
            return new PaymentNotFoundException();
        }
        return errorDecoder.decode(s, response);

    }
}
