package KevinDeArcoSegundaPreEntrega.entregable.Repository;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository <Producto,Long> {
}
