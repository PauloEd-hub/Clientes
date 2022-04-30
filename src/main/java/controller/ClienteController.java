package controller;


import com.program.fazoteuBackend.models.ClientesModel;
import com.program.fazoteuBackend.service.ClientesService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    final ClientesService clientesService;

    public ClienteController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @PostMapping
    ResponseEntity<ClientesModel> saveClientes(@PathVariable UUID idClientes) {
        var clientesModel = new ClientesModel();
        return  ResponseEntity.status(HttpStatus.CREATED).body(clientesService.save(clientesModel));

    }
//
//    @DeleteMapping("/{idCliente}")
//    ResponseEntity<ClientesService> deleteCliente(UUID idCliente) {
//        return clientesService.deleteCliente(idCliente);
//    }


//    @GetMapping
//    ResponseEntity<ClientesService> getAllClientes() {
//        return ResponseEntity.ok(clientesService);    }
}
