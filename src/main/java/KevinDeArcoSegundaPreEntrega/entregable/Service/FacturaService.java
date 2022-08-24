package KevinDeArcoSegundaPreEntrega.entregable.Service;


import KevinDeArcoSegundaPreEntrega.entregable.Dto.FacturaDto;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Factura;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FacturaService {

    Factura findById(Long id);

    List<Factura> getAllTheInvoices();

    Factura guardarFactura (Factura factura);


    Factura generarFactura (FacturaDto facturaDto);

    /*String FacturaFinal(Long id);*/
}
