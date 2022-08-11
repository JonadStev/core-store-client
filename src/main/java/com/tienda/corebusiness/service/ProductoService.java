package com.tienda.corebusiness.service;

import com.tienda.corebusiness.model.Producto;

import java.util.ArrayList;

public interface ProductoService {

    Producto saveProducto(Producto producto);
    ArrayList<Producto> getAllProductos();
}
