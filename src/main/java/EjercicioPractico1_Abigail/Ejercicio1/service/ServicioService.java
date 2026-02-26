/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.service;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Servicio;
import java.util.List;

public interface ServicioService {

    List<Servicio> listar();
    Servicio obtener(Integer id);
    void guardar(Servicio servicio);
    void eliminar(Integer id);
}