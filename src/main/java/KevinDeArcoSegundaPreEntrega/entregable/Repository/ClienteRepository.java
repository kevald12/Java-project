package KevinDeArcoSegundaPreEntrega.entregable.Repository;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository  extends JpaRepository <Cliente,Long> {

}
