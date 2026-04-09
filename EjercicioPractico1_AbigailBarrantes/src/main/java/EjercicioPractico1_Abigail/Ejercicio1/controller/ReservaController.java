package EjercicioPractico1_Abigail.Ejercicio1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import EjercicioPractico1_Abigail.Ejercicio1.domain.Reserva;
import EjercicioPractico1_Abigail.Ejercicio1.service.ReservaService;
import EjercicioPractico1_Abigail.Ejercicio1.service.ServicioService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ServicioService servicioService;

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("reservas", reservaService.listar());
        return "reserva/lista";
    }

    @GetMapping("/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("reserva", new Reserva());
        model.addAttribute("servicios", servicioService.listar());
        return "reserva/form";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Reserva reserva) {
        reservaService.guardar(reserva);
        return "redirect:/reservas";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable Long id) {
        reservaService.eliminar(id);
        return "redirect:/reservas";
    }
}
