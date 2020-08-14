package com.br.mastertech.fatura.repository;

import com.br.mastertech.fatura.models.Fatura;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FaturaRepository extends CrudRepository<Fatura, Integer> {

    List<Fatura> findAllByCartaoId(Integer cartaoId);

}
