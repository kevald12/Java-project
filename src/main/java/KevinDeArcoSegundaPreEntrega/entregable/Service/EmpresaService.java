package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;

import java.util.List;

public interface EmpresaService {

    Empresa findById (Long id);

    List<Empresa> getAllEmpresas ();

    public Empresa guardarEmpresa (Empresa empresa);
}
