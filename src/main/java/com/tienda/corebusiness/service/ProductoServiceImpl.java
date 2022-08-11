package com.tienda.corebusiness.service;

import com.tienda.corebusiness.model.Producto;
import com.tienda.corebusiness.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductoServiceImpl implements ProductoService{

    @Autowired
    ProductoRepository productoRepository;

    @Override
    public Producto saveProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    @Override
    public ArrayList<Producto> getAllProductos() {
        return (ArrayList<Producto>) productoRepository.findAll();
    }
}
