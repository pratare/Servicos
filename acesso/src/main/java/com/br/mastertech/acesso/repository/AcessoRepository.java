package com.br.mastertech.acesso.repository;

import com.br.mastertech.acesso.models.Acesso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;


public interface AcessoRepository extends CrudRepository<Acesso, Integer> {

    void removeAllByClienteIdAndPortaId(Integer clienteId, Integer portaId);

    void findAllByClienteIdAndPortaId(Integer clienteId, Integer portaId);

}
