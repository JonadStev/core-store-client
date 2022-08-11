package com.tienda.corebusiness.service;

import com.tienda.corebusiness.model.Categoria;

import java.util.ArrayList;

public interface CategoriaService {

    Categoria saveCategoria(Categoria categoria);
    ArrayList<Categoria> getAllCategorias();

}
