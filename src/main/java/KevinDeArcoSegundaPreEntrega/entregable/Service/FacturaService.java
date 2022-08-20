package KevinDeArcoSegundaPreEntrega.entregable.Service;


import KevinDeArcoSegundaPreEntrega.entregable.Entity.Factura;
import org.springframework.stereotype.Service;

import java.util.List;


public interface FacturaService {

    Factura findById(Long id);

    List<Factura> obtenerTodasLasFacturas();
}
