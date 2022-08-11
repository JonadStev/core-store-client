package com.tienda.corebusiness.service;

import com.tienda.corebusiness.model.Categoria;
import com.tienda.corebusiness.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public Categoria saveCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public ArrayList<Categoria> getAllCategorias() {
        return (ArrayList<Categoria>) categoriaRepository.findAll();
    }
}
