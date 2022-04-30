package com.program.fazoteuBackend.service;

import com.program.fazoteuBackend.models.ClientesModel;
import com.program.fazoteuBackend.repository.ClientesRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientesService {

    final ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }


//    public List<ClientesModel> deleteCliente()
//    {
//        return clientesRepository.delete();
//    }
//
//
//    public List<ClientesModel> findAll() {
//        return clientesRepository.findAll();
//    }

    @Transactional
    public ClientesModel save(ClientesModel clientesModel) {
        return clientesRepository.save(clientesModel);
    }
}
