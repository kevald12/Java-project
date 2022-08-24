package KevinDeArcoSegundaPreEntrega.entregable.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity (name = "producto")
@Data
@Table(name = "producto")
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "producto_id")
    @JsonIgnore
    private Long id;

    @Column (name = "nombre")
    @NotNull(message = "Por favor ingrese el nombre del producto")
    @NotBlank(message = "Por favor ingrese el nombre del producto")
    private String nombre;

    @Column (name = "descripcion")
    @NotNull(message = "Por favor agregue una descripcion")
    @NotBlank (message = "Por favor agregue una descripcion")
    private String descripcion;

    @Column (name = "precio")
    @Min(value = 0, message = "El precio debe ser igual o superior a Cero (0)")
    private int precio;

    @Column (name = "cantidad")
    @Min(value = 0, message = "La cantidad debe ser igual o superiro a Cero (0)")
    private int cantidad;

}
