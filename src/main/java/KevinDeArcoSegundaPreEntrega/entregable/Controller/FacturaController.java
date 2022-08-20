package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Factura;
import KevinDeArcoSegundaPreEntrega.entregable.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/getTheInvoice/{id}")

    public Factura getTheInvoice(@PathVariable(name = "id")Long id){

        Factura factura = facturaService.findById(id);
        return factura;
    }
}
