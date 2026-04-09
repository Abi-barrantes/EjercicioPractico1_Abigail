package EjercicioPractico1_Abigail.Ejercicio1.controller;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Servicio;
import EjercicioPractico1_Abigail.Ejercicio1.service.CategoriaService;
import EjercicioPractico1_Abigail.Ejercicio1.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/servicios")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listado(Model model) {
        model.addAttribute("servicios", servicioService.listar());
        return "servicio/listado";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("servicio", new Servicio());
        model.addAttribute("categorias", categoriaService.listar());
        return "servicio/formulario";
    }

    @PostMapping("/guardar")
    public String guardar(Servicio servicio) {
        servicioService.guardar(servicio);
        return "redirect:/servicios";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        model.addAttribute("servicio", servicioService.buscarPorId(id));
        model.addAttribute("categorias", categoriaService.listar());
        return "servicio/formulario";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        servicioService.eliminar(id);
        return "redirect:/servicios";
    }
}
