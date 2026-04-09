package EjercicioPractico1_Abigail.Ejercicio1.service;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Servicio;
import java.util.List;

public interface ServicioService {
    List<Servicio> listar();
    Servicio guardar(Servicio servicio);
    Servicio buscarPorId(Long id);
    void eliminar(Long id);
}
