package com.br.mastertech.porta.controller;


import com.br.mastertech.porta.dto.PortaMapper;
import com.br.mastertech.porta.dto.request.PortaRequest;
import com.br.mastertech.porta.dto.response.PortaDetalheResponse;
import com.br.mastertech.porta.dto.response.PortaResponse;
import com.br.mastertech.porta.models.Porta;
import com.br.mastertech.porta.service.PortaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/porta")
public class PortaController {

	@Autowired
	private PortaService portaService;

	@Autowired
	private PortaMapper portaMapper;
	
	@GetMapping("/{id}")
	public PortaDetalheResponse exibePorta(@PathVariable int id) {
		Porta portaid = portaService.buscarPorta(id);
        return portaMapper.toPortaDetalheResponse(portaid);

	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public PortaResponse cadastrarPorta(@RequestBody PortaRequest portaRequest) {
		Porta porta = portaMapper.toPorta(portaRequest);
		porta = portaService.cadastrar(porta);
		return portaMapper.toPortaResponse(porta);
	}
	
}
