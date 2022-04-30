package com.program.fazoteuBackend.repository;


import com.program.fazoteuBackend.models.ClientesModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClientesRepository extends JpaRepository<ClientesModel, Long> {
}
