package com.br.mastertech.acesso.client.cliente;

import feign.Response;
import feign.codec.ErrorDecoder;

public class ClienteClientDecoder implements ErrorDecoder {

    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String s, Response response) {
        if (response.status() == 404) {
            return new ClientNotFoundException();
        }
        return errorDecoder.decode(s,response);
    }
}
