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

    public Empresa modificarEmpresa (Empresa empresa){
        Empresa empresaModificada = empresaRepository.findById(empresa.getId()).get();
        empresaModificada.setNombre(empresaModificada.getNombre());
        return empresaRepository.save(empresa);
    }

    public String borrarEmpresaPorId (Long id){
        Empresa empresa = empresaRepository.findById(id).get();
        empresaRepository.deleteById(id);
        return "eliminaste a" +" "+ empresa.getNombre();
    }
}
