package KevinDeArcoSegundaPreEntrega.entregable.Repository;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.DetalleFactura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetalleFacturaRepository extends JpaRepository<DetalleFactura,Long> {

}
