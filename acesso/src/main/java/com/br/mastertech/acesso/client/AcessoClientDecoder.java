package com.br.mastertech.acesso.client;

import feign.Response;
import feign.codec.ErrorDecoder;

public class AcessoClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 404) {
            return new DoorNotFoundException();
        }
        return errorDecoder.decode(s,response);
    }
}
