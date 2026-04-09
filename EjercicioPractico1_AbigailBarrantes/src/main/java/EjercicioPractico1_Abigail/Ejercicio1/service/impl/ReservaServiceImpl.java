/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Reserva;
import EjercicioPractico1_Abigail.Ejercicio1.repository.ReservaRepository;
import EjercicioPractico1_Abigail.Ejercicio1.service.ReservaService;

@Service
public class ReservaServiceImpl implements ReservaService {

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> listar() {
        return reservaRepository.findAll();
    }

    @Override
    public Reserva guardar(Reserva reserva) {
        return reservaRepository.save(reserva);
    }

    @Override
    public Reserva buscarPorId(Long id) {
        return reservaRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        reservaRepository.deleteById(id);
    }
}