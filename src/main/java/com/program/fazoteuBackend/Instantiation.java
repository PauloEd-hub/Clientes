package com.program.fazoteuBackend;

import com.program.fazoteuBackend.models.ClientesModel;
import com.program.fazoteuBackend.repository.ClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;


@Configuration
public class Instantiation implements CommandLineRunner {


    @Autowired
    private ClientesRepository clientesRepository;

    @Override
    public void run(String... args) throws Exception {

        clientesRepository.deleteAll();


        ClientesModel paulo = new ClientesModel("Paulo", "Rua dos Ingleses", "86778976789");
        ClientesModel jessica = new ClientesModel("Jessica", "Avenida Brasil", "98758763489");
        ClientesModel ruan = new ClientesModel("Ruan", "Rua Pedro Pereira", "987530989");

        clientesRepository.saveAll(Arrays.asList(paulo, jessica, ruan));

    }
}
