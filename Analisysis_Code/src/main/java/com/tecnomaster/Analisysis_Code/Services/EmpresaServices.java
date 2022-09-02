package com.tecnomaster.Analisysis_Code.Services;

import com.tecnomaster.Analisysis_Code.Entities.Empresa;

import java.util.ArrayList;

public class EmpresaServices {

    ArrayList<Empresa> enterprise = new ArrayList<Empresa>();

    public EmpresaServices(){
        this.datosIniciales();
    }
//---------------ArrayList Prueba Metodos Empresa---------------

    public ArrayList<Empresa> getEnterprise() {
        return enterprise;
    }
    //GET RUTA ENTERPRISE
    public void datosIniciales(){
        enterprise.add(new Empresa("Tech2","Avenida 34","123123","111122223"));
        enterprise.add(new Empresa("Tech3","Avenida 89","321321","333322123"));
        enterprise.add(new Empresa("Tech4","Avenida 45","321123","123123123"));
        enterprise.add(new Empresa("Tech5","Avenida 98","312332","321231312"));
        enterprise.add(new Empresa("Tech6","Avenida 12","121233","123123123"));
    }

    //POST RUTA ENTERPRISE
    public String createEnterprise(Empresa e){
        enterprise.add(e);
        return "Empresa creada exitosamente";
    }

    //GET RUTA ENTERPRISE/ID
    public Empresa buscarEmpresa(int index){
        return enterprise.get(index);
    }
    //PATCH RUTA ENTERPRISE/ID
    public String actualizarEmpresa(int index, Empresa e){
        enterprise.set(index, e);
        return "Empresa actualizada exitosamente";
    }
    //DEL RUTA ENTERPRISE/ID
    public String eliminarEmpresa(int index){
        enterprise.remove(index);
        return "Empresa eliminada exitosamente";
    }
}