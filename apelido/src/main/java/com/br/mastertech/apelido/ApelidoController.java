package com.br.mastertech.apelido;

import com.br.mastertech.apelido.security.Codinome;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApelidoController {

    @GetMapping("/{apelido}")
    public OcultoNome create(@PathVariable String apelido, @AuthenticationPrincipal Codinome codinome) {
        OcultoNome ocultoNome = new OcultoNome();
        ocultoNome.setApelido(apelido);
        ocultoNome.setNome(codinome.getNomeVerdadeiro());
        return ocultoNome;
    }
}
