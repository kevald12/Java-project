package KevinDeArcoSegundaPreEntrega.entregable.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDto {

    private String nombre;

    private String descripcion;

    private int cantidadDeProductos;

    private int cantidadAntesDeRestar;

    private int cantidadRestada;

    private int total;

    private Long producto_id;

    private String metodoDePago;

    private int precioParcial;

}
