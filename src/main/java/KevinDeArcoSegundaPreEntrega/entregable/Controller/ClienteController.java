package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import KevinDeArcoSegundaPreEntrega.entregable.Service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @GetMapping("/getTheClientById/{id}")
    public Cliente getTheClientById(@PathVariable(name = "id" )Long id){

        Cliente cliente = clienteService.findById(id);
        return cliente;
    }

    @GetMapping("GetTheClientByDni")
    public Cliente getTheClientByDni(@PathVariable(name = "dni")Long id){
        Cliente cliente = clienteService.findByDni(id);
        return  cliente;
    }

    @GetMapping("/getAllClients")
    public List<Cliente> obtenerCliente(){

        return clienteService.obtenerTodosLosClientes();
    }

    @PostMapping("/saveClient")
    public Cliente create (@Validated @RequestBody Cliente cliente){
        return clienteService.guardarCliente(cliente);
    }

    @PutMapping ("/modifyClient")
    public Cliente modifyClient (@RequestBody Cliente cliente){
        return clienteService.modificarCliente(cliente);
    }

    @DeleteMapping ("/deleteClient/{id}")
    public String deleteClient (@PathVariable(value = "id")Long id){
        return clienteService.borrarClientePorId(id);
    }


}
