package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;

import java.util.List;

public interface EmpresaService {

    Empresa findById (Long id);

    List<Empresa> getAllEmpresas ();

    Empresa guardarEmpresa (Empresa empresa);

    Empresa modificarEmpresa (Empresa empresa);

    String borrarEmpresaPorId (Long id);
}
