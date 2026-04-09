package EjercicioPractico1_Abigail.Ejercicio1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Servicio;
import EjercicioPractico1_Abigail.Ejercicio1.repository.ServicioRepository;
import EjercicioPractico1_Abigail.Ejercicio1.service.ServicioService;

@Service
public class ServicioServiceImpl implements ServicioService {

    @Autowired
    private ServicioRepository servicioRepository;

    @Override
    public List<Servicio> listar() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio guardar(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public Servicio buscarPorId(Long id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        servicioRepository.deleteById(id);
    }
}
