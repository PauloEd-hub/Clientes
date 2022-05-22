package controller;


import com.program.fazoteuBackend.models.ClientesModel;
import com.program.fazoteuBackend.service.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClientesService clientesService;


    @GetMapping(value = "teste")
    public ResponseEntity<List<ClientesModel>> findAll() {
        List<ClientesModel> list = clientesService.findAll();

        return ResponseEntity.ok().body(list);
    }

}
