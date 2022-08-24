package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Dto.ProductoDto;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import KevinDeArcoSegundaPreEntrega.entregable.Exception.DbExpcetion;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.ProductoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    ProductoRepository productoRepository;

    public Producto findById(Long id) {
        log.info("vamos a buscar un producto por id{}");
        Optional <Producto> producto =productoRepository.findById(id);
        if (producto.isPresent()){
            log.info("El producto esta presente y  su nombre es {}", producto.get().getNombre());
            return producto.get();
        }else{
            log.error("EL producto no esta disponible");
            throw new DbExpcetion("No se encontro el Producto con el id"+id);
        }
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

    public void restarStockListProducto(List<Producto> productoList){
        for (Producto producto :productoList){
            if (producto.getCantidad() == 0){
                throw new DbExpcetion("no hay mas stock de: "+producto.getNombre());
            }else {
                producto.setCantidad(producto.getCantidad() - 1);
            }
        }
        productoRepository.saveAll(productoList);
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





