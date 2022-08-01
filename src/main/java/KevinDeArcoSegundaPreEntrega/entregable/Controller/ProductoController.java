package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import KevinDeArcoSegundaPreEntrega.entregable.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @PostMapping("/saveProduct")
    public Producto saveProduct(@RequestBody Producto producto){
        return productoService.guardarProducto(producto);
    }

    @PutMapping ("/modifyProduct")
    public Producto modifyClient (@RequestBody Producto producto){
        return productoService.modificarProducto(producto);
    }

    @DeleteMapping ("/deleteProduct/{id}")
    public String deleteProduct (@PathVariable(value = "id")Long id){
        return productoService.borrarProductoPorId(id);
    }


    @PostMapping ("/restarProducto")
    public String restarProducto(@RequestParam(value = "nro1")int nro1, @RequestParam( value = "id")Long id){
        return productoService.restarStock(nro1, id);
    }


}
