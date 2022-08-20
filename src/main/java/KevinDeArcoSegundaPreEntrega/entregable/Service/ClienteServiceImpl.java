package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
/*import KevinDeArcoSegundaPreEntrega.entregable.Exception.ClienteException;*/
import KevinDeArcoSegundaPreEntrega.entregable.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public Cliente findById (Long id) {
        return clienteRepository.findById(id).get();
                /*.orElseThrow(()->new ClienteException(id));*/
    }

    public List<Cliente> obtenerTodosLosClientes (){
        return clienteRepository.findAll();
    }


    public Cliente guardarCliente(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public Cliente modificarCliente (Cliente cliente){
        Cliente clienteModificado = clienteRepository.findById(cliente.getId()).get();
        clienteModificado.setNombre(cliente.getNombre());
        return clienteRepository.save(cliente);
    }

    public String borrarClientePorId (Long id){
        Cliente cliente = clienteRepository.findById(id).get();
        clienteRepository.deleteById(id);
        return "eliminaste a" +" "+ cliente.getNombre();
    }
}
