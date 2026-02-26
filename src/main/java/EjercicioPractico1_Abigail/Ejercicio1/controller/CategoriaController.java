/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.controller;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Categoria;
import EjercicioPractico1_Abigail.Ejercicio1.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    // LISTAR
    @GetMapping
    public String listado(Model model) {
        model.addAttribute("categorias", categoriaService.listar());
        return "categoria/listado";
    }

    // FORMULARIO NUEVO
    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "categoria/formulario";
    }

    // GUARDAR
    @PostMapping("/guardar")
    public String guardar(Categoria categoria) {
        categoriaService.guardar(categoria);
        return "redirect:/categorias";
    }

    // ELIMINAR
    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        categoriaService.eliminar(id);
        return "redirect:/categorias";
    }
}