package KevinDeArcoSegundaPreEntrega.entregable.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity (name = "empresa")
@Data
@Table(name = "empresa")
@AllArgsConstructor
@NoArgsConstructor
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "empresa_id")
    private Long id;

    @Column (name = "nombre")
    private String nombre;

    @Column (name = "rubro")
    private String rubro;

    @Column (name = "factura_id")
    @OneToMany(mappedBy = "empresa", fetch = FetchType.EAGER)
    private List<Factura> factura;
}
