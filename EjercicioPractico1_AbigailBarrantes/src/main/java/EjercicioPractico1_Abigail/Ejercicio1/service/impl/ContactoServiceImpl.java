/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.service.impl;

import org.springframework.stereotype.Service;
import EjercicioPractico1_Abigail.Ejercicio1.domain.Contacto;
import EjercicioPractico1_Abigail.Ejercicio1.service.ContactoService;

@Service
public class ContactoServiceImpl implements ContactoService {

    public void enviarMensaje(Contacto contacto) {
        // Aquí podrías imprimir en consola solo como simulación
        System.out.println("Mensaje recibido de: " + contacto.getNombre());
        System.out.println("Correo: " + contacto.getCorreo());
        System.out.println("Mensaje: " + contacto.getMensaje());
    }
}