package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Dto.*;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.*;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.FacturaRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.loader.collection.OneToManyJoinWalker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
@Slf4j
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    @Autowired
    ClienteService clienteService;

    @Autowired
    ProductoService productoService;


    public Factura findById (Long id) {
        return facturaRepository.findById(id).get();
    }


    public List <Factura> getAllTheInvoices(){
        return facturaRepository.findAll();
    }

    public Factura guardarFactura (Factura factura){
        return facturaRepository.save(factura);
    }

    public Factura generarFactura (FacturaDto facturaDto){
        Cliente cliente = clienteService.findByDni(facturaDto.getClienteDto().getId());

        List<Producto> productoList = new ArrayList<>();

        for(DetalleFacturaDto detalleFacturaDto: facturaDto.getDetalleFacturaDto()){
            Producto producto = productoService.findById(detalleFacturaDto.getProductoDto().getProducto_id());
            productoList.add(producto);
        }
        Factura factura = new Factura();
        factura.setCliente(cliente);
        factura.setFecha(facturaDto.getFecha());
        factura.setDetalleFactura(new HashSet<>());
        for (DetalleFacturaDto detalleFacturaDto : facturaDto.getDetalleFacturaDto()){
            factura.agregarDetalle(crearDetalleFactura(detalleFacturaDto));
        }

        productoService.restarStockListProducto(productoList);

        Factura factura1 = facturaRepository.save(factura);
        log.info("informacion de factura warning {}", factura1);

        return factura;
    }
    DetalleFactura crearDetalleFactura (DetalleFacturaDto detalleFactura){
        DetalleFactura detalleFacturaAGuardar = new DetalleFactura();
        detalleFacturaAGuardar.setProducto_id(detalleFacturaAGuardar.getProducto_id());
        return detalleFacturaAGuardar;
    }




  /* public Factura modificarFactura (Factura factura){
        Factura facturaModificada = facturaRepository.findById(factura.getId()).get();
        facturaModificada.setNumeroFactura(facturaModificada.getNumeroFactura());
        return facturaRepository.save(factura);
    }

    public String borrarFacturaPorId (Long id){
        Factura factura = facturaRepository.findById(id).get();
        facturaRepository.deleteById(id);
        return "eliminaste a" +" "+ factura.getNumeroFactura();
    }*/
}
