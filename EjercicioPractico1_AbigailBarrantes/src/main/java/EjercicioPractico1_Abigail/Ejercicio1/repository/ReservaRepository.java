/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.repository;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Reserva;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author abita
 */
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
