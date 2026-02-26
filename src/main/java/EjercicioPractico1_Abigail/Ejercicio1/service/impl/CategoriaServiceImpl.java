/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioPractico1_Abigail.Ejercicio1.service.impl;

import EjercicioPractico1_Abigail.Ejercicio1.domain.Categoria;
import EjercicioPractico1_Abigail.Ejercicio1.repository.CategoriaRepository;
import EjercicioPractico1_Abigail.Ejercicio1.service.CategoriaService;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    private final CategoriaRepository repo;

    public CategoriaServiceImpl(CategoriaRepository repo) {
        this.repo = repo;
    }

    @Override
    public List<Categoria> listar() {
        return repo.findAll();
    }

    @Override
    public Categoria obtener(Integer id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void guardar(Categoria categoria) {
        repo.save(categoria);
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);
    }
}