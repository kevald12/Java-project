package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.DetalleFactura;
import KevinDeArcoSegundaPreEntrega.entregable.Service.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DetalleFacturaController {

    @Autowired
    DetalleFacturaService detalleFacturaService;

    @GetMapping("/getTheInvoiceDetail/{id}")
    public DetalleFactura getTheInvoiceDetail(@PathVariable(name = "id")Long id){

        DetalleFactura detalleFactura = detalleFacturaService.findById(id);
        return detalleFactura;
    }
}
