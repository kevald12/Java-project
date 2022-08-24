package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;

import java.util.List;

public interface ProductoService {

    Producto findById (Long id);

    List<Producto> getAllProducts ();

    Producto guardarProducto (Producto producto);

    Producto modificarProducto (Producto producto);

    String borrarProductoPorId (Long id);

    String restarStock (int nro1, Long id);

    void restarStockListProducto (List<Producto> productoList);
}
