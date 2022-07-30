package KevinDeArcoSegundaPreEntrega.entregable.Service;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;
import KevinDeArcoSegundaPreEntrega.entregable.Repository.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaServiceImpl implements  EmpresaService{

    @Autowired
    EmpresaRepository empresaRepository;

    public Empresa findById (Long id) {
        return empresaRepository.findById (id).get();
    }
    public Empresa guardarEmpresa (Empresa empresa){
        return empresaRepository.save(empresa);
    }

    public List<Empresa> getAllEmpresas (){
        return empresaRepository.findAll();
    }
}
