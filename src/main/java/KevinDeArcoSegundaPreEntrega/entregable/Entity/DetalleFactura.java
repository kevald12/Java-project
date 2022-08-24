package KevinDeArcoSegundaPreEntrega.entregable.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity (name = "detalle_factura")
@Table (name = "detalle_factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DetalleFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "detalle_factura_id")
    @JsonIgnore
    private Long id;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn (name = "factura_id")
    @JsonBackReference
    private Factura factura;

    @Column (name = "precio")
    private double precio;

    @Column(name = "cantidad_de_productos")
    @Min(value = 0, message = "La cantidad debe ser igual o superior a cero (0)")
    private int cantidadDeProductos;

    @Column(name = "producto_id")
    private Long producto_id;


    @Column(name = "metodo_de_pago")
    @NotNull(message = "ingrese el metodo de pago")
    @NotEmpty(message = "ingrese el metodo de pago")
    private String metodoDePago;

}
