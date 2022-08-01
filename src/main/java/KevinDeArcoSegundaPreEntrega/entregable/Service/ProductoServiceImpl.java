package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Dto.ProductoDto;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto findById(Long id) {
        return productoRepository.findById(id).get();
    }

    public List<Producto> getAllProducts() {
        return productoRepository.findAll();
    }

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public Producto modificarProducto(Producto producto) {
        Producto productoModificado = productoRepository.findById(producto.getId()).get();
        productoModificado.setNombre(producto.getNombre());
        return productoRepository.save(producto);
    }

    public String borrarProductoPorId(Long id) {
        Producto producto = productoRepository.findById(id).get();
        productoRepository.deleteById(id);
        return "eliminaste a" + " " + producto.getNombre();
    }

    public String restarStock (int nro1, Long id){
        Producto producto = productoRepository.findById(id).get();
        ProductoDto productoDto = new ProductoDto();
        productoDto.setNombre(producto.getNombre());
        productoDto.setCantidadAntesDeRestar(producto.getCantidad());
        productoDto.getTotal();
        productoDto.setCantidadRestada(nro1);
        int resta = producto.getCantidad() - nro1;
        productoDto.setTotal(resta);

        String primerMensaje = "no se puede comprar esa cantidad";
        String segundMensaje = "la cantidad es";
        if(nro1 > producto.getCantidad())
            return primerMensaje + " " + segundMensaje + " " + productoDto.getCantidadAntesDeRestar();
            else if ( productoDto.getTotal() == 0) {
            return "te llevaste todo el stock";
            }
            else {
                return productoDto.toString();
            }
        }

    }





