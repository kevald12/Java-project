package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Factura;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository facturaRepository;

    public Factura findById (Long id) {
        return facturaRepository.findById(id).get();
    }


    public List <Factura> obtenerTodasLasFacturas(){
        return facturaRepository.findAll();
    }
}
