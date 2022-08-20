package KevinDeArcoSegundaPreEntrega.entregable.Entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.List;

@Entity (name = "factura")
@Table(name = "factura")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "factura_id")
    private Long id;

    @Column (name = "numero")
    @NotEmpty(message = "Por favor ingrese el numero de factura")
    @NotBlank(message = "Por favor ingrese el numero de factura" )
    private int numeroFactura;

    @Column(name = "fecha")
    @NotEmpty (message = "Por favor ingrese una fecha")
    @NotEmpty(message = "Por favor ingrese una fecha")
    @Pattern( regexp = "^\\d{4}-(0[1-9]|1[0-2]-(0[1-9]|[12][0-9]|3[01])$")
    private Date fecha;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "cliente_id")
    private Cliente cliente;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "empresa_id")
    private Empresa empresa;

    @OneToMany (mappedBy = "factura",fetch = FetchType.EAGER)
    private List <DetalleFactura> detalleFactura;

}

