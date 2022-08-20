package KevinDeArcoSegundaPreEntrega.entregable.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity (name = "cliente")
@Table(name = "cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "cliente_id")
    private Long id;

    @Column (name = "nombre")
    @NotNull(message = "Por favor ingrese nombre")
    @NotBlank(message ="Por favor ingrese nombre" )
    private String nombre;

    @Column (name = "apellido")
    @NotNull(message = "Por favor ingrese apellido")
    @NotBlank(message = "Por favor ingrese apellido")
    private String apellido;

    @Column (name = "dni")
    @NotNull(message = "Por favor ingrese DNI")
    @NotBlank(message = "Por favor ingrese DNI")
    private int dni;

    @Column (name = "direccion")
    @NotNull(message = "Por favor ingrese la direccion")
    @NotBlank(message = "Por favor ingrese la direccion")
    private String direccion;

    @OneToMany (mappedBy = "cliente",fetch = FetchType.EAGER)
    private List<Factura> factura;

}
