package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import KevinDeArcoSegundaPreEntrega.entregable.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductoController {

    @Autowired
    ProductoService productoService;

    @GetMapping("/getProduct/{id}")
    public Producto getProduct (@PathVariable (name="id")Long id){
        Producto producto = productoService.findById(id);
        return producto;
    }

    @GetMapping("/getAllProducts")
    public List<Producto> getAllProducts (){
        return productoService.getAllProducts();
    }
}
