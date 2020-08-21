package com.br.mastertech.usuario.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class CepClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 404) {
            return new CepNotFoundException();
        }
        return errorDecoder.decode(s,response);
    }
}
