/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mintic.misiontic.ciclo3.controladores;


import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mintic.misiontic.ciclo3.dao.IUsuarioCrud;
import mintic.misiontic.ciclo3.modelo.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 *
 * @author USUARIO
 */
@Controller
@Slf4j
public class ControladorInicio {
    @Autowired
    IUsuarioCrud crudUsuario;

    @GetMapping("/")
    public String inicio(Model modelo) {
        List<Usuario> listaUsuarios = (List<Usuario>) crudUsuario.findAll();
        modelo.addAttribute("usuarios", listaUsuarios);
        log.info("Ejecutando el controlador Inicio MVC");
        return "index";
    }

}
