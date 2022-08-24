package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.DetalleFactura;
import KevinDeArcoSegundaPreEntrega.entregable.Service.DetalleFacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DetalleFacturaController {

    @Autowired
    DetalleFacturaService detalleFacturaService;

    @GetMapping("/getTheInvoiceDetail/{id}")
    public DetalleFactura getTheInvoiceDetail(@PathVariable(name = "id")Long id){

        DetalleFactura detalleFactura = detalleFacturaService.findById(id);
        return detalleFactura;
    }

    @GetMapping("/getAllTheDetails")
    public List<DetalleFactura> getAllTheDetails(){
        return detalleFacturaService.getAllTheDetails();
    }

   /* @PostMapping("/saveDetail")
    public  DetalleFactura create (@Validated @RequestBody DetalleFactura detalleFactura){
        return detalleFacturaService.guardarDetalleFactura(detalleFactura);
    }*/
}
