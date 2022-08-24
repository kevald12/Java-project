package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
/*import KevinDeArcoSegundaPreEntrega.entregable.Exception.ClienteException;*/
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;
import KevinDeArcoSegundaPreEntrega.entregable.Exception.DbExpcetion;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.ClienteRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    ClienteRepository clienteRepository;
/* utilizo los metodos CRUD para trabajar con postman */
    public Cliente findById (Long id) {
        Optional<Cliente> cliente =clienteRepository.findById(id);
        if(cliente.isPresent()){
            return cliente.get();
        }else{
            throw new DbExpcetion("No se encuentra el cliente con el id" + id);
        }
    }


    public Cliente obtenerClientePorDni (Cliente cliente){
        Optional <Cliente> buscarCliente = clienteRepository.findByDni (cliente.getDni());
        if (buscarCliente.isPresent()){
            log.info("ese cliente ya existe");
            return buscarCliente.get();
        }else{
            log.info("se guardo el nuevo cliente");
            return clienteRepository.save(cliente);
        }
    }


    @Override
    public Cliente findByDni(Long id) {
        return null;
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
