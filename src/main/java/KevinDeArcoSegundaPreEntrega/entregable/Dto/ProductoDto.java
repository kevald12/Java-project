package KevinDeArcoSegundaPreEntrega.entregable.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {

    private String nombre;

    private int cantidadAntesDeRestar;

    private int cantidadRestada;

    private int total;

}
