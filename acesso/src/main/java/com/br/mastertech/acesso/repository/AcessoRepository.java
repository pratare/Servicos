package com.br.mastertech.acesso.repository;

import com.br.mastertech.acesso.models.Acesso;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface AcessoRepository extends CrudRepository<Acesso, Integer> {

}
