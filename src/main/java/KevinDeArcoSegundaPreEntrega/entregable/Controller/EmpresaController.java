package KevinDeArcoSegundaPreEntrega.entregable.Controller;

import KevinDeArcoSegundaPreEntrega.entregable.Entity.Cliente;
import KevinDeArcoSegundaPreEntrega.entregable.Entity.Empresa;
import KevinDeArcoSegundaPreEntrega.entregable.Service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpresaController {

    @Autowired
    EmpresaService empresaService;

    @GetMapping("/getEmpresa/{id}")
    public Empresa getEmpresa (@PathVariable(name = "id")Long id){
        Empresa empresa = empresaService.findById(id);
        return empresa;
    }

    @GetMapping("/getAllEmpresas")
    public List<Empresa> getAllEmpresas(){

        return empresaService.getAllEmpresas();
    }
    @PostMapping("/saveEmpresa")
    public Empresa saveEmpresa(@RequestBody Empresa empresa){
        return empresaService.guardarEmpresa(empresa);
    }
}
