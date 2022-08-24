package KevinDeArcoSegundaPreEntrega.entregable.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity (name = "factura")
@Table(name = "factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "factura_id")
    @JsonIgnore
    private Long id;

    @Column (name = "numero")
    @NotNull(message = "Por favor ingrese el numero de factura")
    private int numeroFactura;

    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull(message ="Por favor ingrese una fecha")
    private Date fecha;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "cliente_id")
    @JsonBackReference
    private Cliente cliente;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "empresa_id")
    @JsonBackReference
    private Empresa empresa;

    @OneToMany (mappedBy = "factura",fetch = FetchType.EAGER)
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @JsonManagedReference
    private Set<DetalleFactura> detalleFactura;

    public DetalleFactura agregarDetalle (DetalleFactura detalleFactura){
        getDetalleFactura().add(detalleFactura);
        detalleFactura.setFactura(this);
        return detalleFactura;
    }
    public DetalleFactura removerDetalle (DetalleFactura detalleFactura){
        getDetalleFactura().remove(detalleFactura);
        detalleFactura.setFactura(null);
        return  detalleFactura;
    }

}

