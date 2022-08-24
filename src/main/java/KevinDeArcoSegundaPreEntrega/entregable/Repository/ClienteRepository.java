package KevinDeArcoSegundaPreEntrega.entregable.Repository;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository  extends JpaRepository <Cliente,Long> {


  @Query(" SELECT s from cliente s WHERE s.dni = :dni")
   Optional<Cliente> findByDni (int dni);


}
