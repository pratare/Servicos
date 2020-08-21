package com.br.mastertech.usuario.repository;

import com.br.mastertech.usuario.models.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

}
