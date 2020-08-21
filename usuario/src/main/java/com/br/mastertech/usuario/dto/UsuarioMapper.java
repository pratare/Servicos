package com.br.mastertech.usuario.dto;

import com.br.mastertech.usuario.dto.request.UsuarioRequest;
import com.br.mastertech.usuario.dto.response.UsuarioResponse;
import com.br.mastertech.usuario.models.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioMapper {

    public Usuario toUsuario(UsuarioRequest usuarioRequest){
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioRequest.getName());
        usuario.setCep(usuarioRequest.getCep());
        return usuario;
    }

    public UsuarioResponse toClienteResponse(Usuario usuario) {
        UsuarioResponse usuarioResponse = new UsuarioResponse();
        usuarioResponse.setId(usuario.getId());
        usuarioResponse.setNome(usuario.getNome());
        return usuarioResponse;
    }

}
