package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;

import java.util.List;

public interface ClienteService {

   Cliente findById (Long id);

    Cliente findByDni (Long id);

    List<Cliente> obtenerTodosLosClientes();

    Cliente guardarCliente(Cliente cliente);

    Cliente modificarCliente (Cliente cliente);

    String borrarClientePorId (Long id);
}
