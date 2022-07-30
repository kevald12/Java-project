package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;

import java.util.List;

public interface ProductoService {

    Producto findById (Long id);

    List<Producto> getAllProducts ();

}
