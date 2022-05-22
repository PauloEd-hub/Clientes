package com.program.fazoteuBackend.service;

import com.program.fazoteuBackend.models.ClientesModel;
import com.program.fazoteuBackend.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.persistence.Column;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;


    public List<ClientesModel> findAll(){
        return  clientesRepository.findAll();
    }

}
