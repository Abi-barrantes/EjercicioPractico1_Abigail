/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.beans.factory.annotation.Autowired;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Contacto;
import EjercicioPractico1_Abigail.Ejercicio1.service.ContactoService;
/**
 *
 * @author abita
 */
@Controller
@RequestMapping("/contacto")
public class ContactoController {

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("contacto", new Contacto());
        return "contacto";
    }

    @PostMapping("/enviar")
    public String enviarMensaje(@ModelAttribute Contacto contacto) {
        return "redirect:/contacto";
    }
}