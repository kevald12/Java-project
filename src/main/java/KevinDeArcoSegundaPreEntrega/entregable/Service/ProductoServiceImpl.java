package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto findById (Long id) {
        return productoRepository.findById(id).get();
    }

    public List<Producto> getAllProducts (){
        return productoRepository.findAll();
    }
}
