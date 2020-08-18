package com.br.mastertech.porta.dto;


import com.br.mastertech.porta.dto.request.PortaRequest;
import com.br.mastertech.porta.dto.response.PortaDetalheResponse;
import com.br.mastertech.porta.dto.response.PortaResponse;
import com.br.mastertech.porta.models.Porta;
import org.springframework.stereotype.Component;

@Component
public class PortaMapper {

    public Porta toPorta(PortaRequest portaRequest){
        Porta porta = new Porta();
        porta.setAndar(portaRequest.getAndar());
        porta.setSala(portaRequest.getSala());
        return porta;
    }

    public PortaResponse toPortaResponse(Porta porta) {
    	PortaResponse portaResponse = new PortaResponse();
        portaResponse.setId(porta.getId());
        portaResponse.setAndar(porta.getAndar());
        portaResponse.setSala(porta.getSala());
        return portaResponse;
    }

    public PortaDetalheResponse toPortaDetalheResponse(Porta porta) {
    	PortaDetalheResponse portaDetalheResponse = new PortaDetalheResponse();
    	portaDetalheResponse.setId(porta.getId());
    	portaDetalheResponse.setAndar(porta.getAndar());
    	portaDetalheResponse.setSala(porta.getSala());
        return portaDetalheResponse;
    }



}
