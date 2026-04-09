/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.service;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Reserva;
import java.util.List;

public interface ReservaService {
    List<Reserva> listar();
    Reserva guardar(Reserva reserva);
    Reserva buscarPorId(Long id);
    void eliminar(Long id);
}

