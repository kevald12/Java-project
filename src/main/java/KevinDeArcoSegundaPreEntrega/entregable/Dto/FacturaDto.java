package KevinDeArcoSegundaPreEntrega.entregable.Dto;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class FacturaDto {

    private int numeroFactura;

    private Date fecha;

    private int totalFactura;

   /* private  Cliente cliente;*/
    private ClienteDto clienteDto;

   /* private ClienteDto clienteDto;*/

    private List <DetalleFacturaDto> detalleFacturaDto;

    private EmpresaDto empresaDto;

}
