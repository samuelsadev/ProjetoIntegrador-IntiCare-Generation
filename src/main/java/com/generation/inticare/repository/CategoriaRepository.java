package com.generation.inticare.repository;

import com.generation.inticare.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {
    List<CategoriaModel> findAllByGeneroContainingIgnoreCase(@Param("genero")String genero);
    List<CategoriaModel> findAllByNomeContainingIgnoreCase(String nome);
}