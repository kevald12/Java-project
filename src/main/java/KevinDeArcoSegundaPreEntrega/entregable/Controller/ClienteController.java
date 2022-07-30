package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import KevinDeArcoSegundaPreEntrega.entregable.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/getTheClient/{id}")
    public Cliente getTheClient(@PathVariable(name = "id" )Long id){

        Cliente cliente = clienteService.findById(id);
        return cliente;
    }

    @GetMapping("/getAllClients")
    public List<Cliente> obtenerCliente(){

        return clienteService.obtenerTodosLosClientes();
    }

    @PostMapping("/saveClient")
    public Cliente saveClient(@RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping ("/modifyClient")
    public Cliente modifyClient (@RequestBody Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }

}
