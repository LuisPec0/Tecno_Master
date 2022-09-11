package com.tecnomaster.Analisysis_Code.Services;

import com.tecnomaster.Analisysis_Code.Entities.Empresa;
import com.tecnomaster.Analisysis_Code.Repository.EmpresaRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class EmpresaServices {
    private EmpresaRepository empresaRepo;
   // private EmpleadoRepository empleadoRepo;

    //private MoviemientoDeDineroRepository movimientoRepo;

    public EmpresaServices(EmpresaRepository empresaRepo, EmpleadoRepository empleadoRepo, MoviemientoDeDineroRepository movimientoRepo) {
        this.empresaRepo = empresaRepo;
        this.empleadoRepo = empleadoRepo;
        this.movimientoRepo = movimientoRepo;
    }

    //listar empresas
    public ArrayList<Empresa> listEnterprise(){
        return (ArrayList<Empresa>) empresaRepo.findAll();

    }
    public Optional <Empresa> buscarEmpresa(int id){
        return empresaRepo.findById(id);
    }


    //POST ENTERPRISE
    public String createEnterprise(Empresa e){
        empresaRepo.save(e);
        return "Empresa creada exitosamente";
    }

    //
    public String actualizarEmpresa (Integer index, Empresa e){
        empresaRepo.save(e);
        return "Empresa actualizada";
    }

    //DEL RUTA ENTERPRISE/ID);
    public String eliminarEmpresa(int id){
        if(buscarEmpresa(id).isPresent()) {
            empresaRepo.deleteById(id);
            return "Empresa eliminada";
        } else{
                return"Empresa no existe";
            }
        }


}