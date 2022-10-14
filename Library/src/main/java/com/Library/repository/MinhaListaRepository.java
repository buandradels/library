package com.Library.repository;

import com.Library.model.MinhaLista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinhaListaRepository extends JpaRepository<MinhaLista, Long> {

}
