package KevinDeArcoSegundaPreEntrega.entregable.Service;


import KevinDeArcoSegundaPreEntrega.entregable.Entity.DetalleFactura;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {

    @Autowired
    DetalleFacturaRepository detalleFacturaRepository;

    public DetalleFactura findById(Long id) {
        return detalleFacturaRepository.findById(id).get();
    }


    public List<DetalleFactura> obtenerTodosLosDetalles(){
        return detalleFacturaRepository.findAll();
    }

}

