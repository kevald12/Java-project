package KevinDeArcoSegundaPreEntrega.entregable.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {

    private Long id;

    private String nombre;

    private String apellido;

    private int dni;

    private String direccion;
}
