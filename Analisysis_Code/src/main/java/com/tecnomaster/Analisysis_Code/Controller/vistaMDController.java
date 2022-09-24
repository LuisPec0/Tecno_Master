package com.tecnomaster.Analisysis_Code.Controller;

import com.tecnomaster.Analisysis_Code.Entities.MovimientoDinero;
import com.tecnomaster.Analisysis_Code.Services.MovimientoDineroServicios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class vistaMDController {
    @Autowired
    MovimientoDineroServicios servicio;


//    Listar Todos los movimientos
    @GetMapping("/MovimientoDinero")
    public String buscarMd(Model model){
        List<MovimientoDinero> listaMov = this.servicio.movimientos();
        model.addAttribute("lista",listaMov);
        model.addAttribute("movimiento", new MovimientoDinero());
        return "MovimientoDineo";
    }


//    Agregar Movimiento

    @PostMapping("/MovimientoDinero")
    public String newMovimiento(@ModelAttribute("movimiento") MovimientoDinero newMoviDin){
        servicio.crearMovimientoDinero(newMoviDin, newMoviDin.getUsuario().getId());
        return "redirect:/MovimientoDinero";

    }


//    Actualizar Movimiento


//    Eliminar movimiento
    @GetMapping("/eliminarMovimiento/{id}")
    public String eliminarMovimiento(@PathVariable("id") int id, Model model){
        servicio.eliminarMd(id);
        return "redirect:/MovimientoDinero";
    }

}
