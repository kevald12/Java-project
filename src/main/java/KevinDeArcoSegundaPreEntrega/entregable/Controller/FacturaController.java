package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Dto.FacturaDto;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Factura;
import KevinDeArcoSegundaPreEntrega.entregable.Service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
public class FacturaController {

    @Autowired
    FacturaService facturaService;

    @GetMapping("/getTheInvoice/{id}")

    public Factura getTheInvoice(@PathVariable(name = "id")Long id){

        Factura factura = facturaService.findById(id);
        return factura;
    }

   /* @GetMapping("/obtenerFacturaDto")
    public FacturaDto obtenerFacturaDto (@PathVariable(name = "id")Long id){
        FacturaDto facturaDto = new FacturaDto();
        return facturaDto;
    }*/

    @GetMapping("/getAllTheInvoices")
    public List<Factura> getAllTheInvoices (){
        return facturaService.getAllTheInvoices();
    }

    @PostMapping("/saveInvoice")
    public  FacturaDto getFacturaDto (@Validated @RequestBody FacturaDto facturaDto) throws Exception {
        if(facturaDto.getDetalleFacturaDto().isEmpty()){
            throw new Exception("La Lista esta vacia");
        }
        return facturaDto;
    }


    @PostMapping("/generarFactura")
    public Factura generarFactura (@Validated @RequestBody FacturaDto factura){ return facturaService.generarFactura(factura);}

}
