package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.DetalleFactura;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.DetalleFacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DetalleFacturaService {

    DetalleFactura findById (Long id);
    List<DetalleFactura> getAllTheDetails();

}