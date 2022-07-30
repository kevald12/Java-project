package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;

import java.util.List;

public interface ClienteService {

    Cliente findById (Long id);

    List<Cliente> obtenerTodosLosClientes();

    Cliente borrarClientePorId (Long id);

    Cliente guardarCliente(Cliente cliente);

    Cliente modificarCliente (Cliente cliente);
}
