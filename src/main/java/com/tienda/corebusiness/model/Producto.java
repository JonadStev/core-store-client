package com.tienda.corebusiness.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_producto")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;

    private double precio;

    private int stock;

    private String srcImage;

    private String estado;

    @OneToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    public Producto(String nombre, double precio, int stock, String srcImage, Categoria categoria, String estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.srcImage = srcImage;
        this.categoria = categoria;
        this.estado = estado;
    }

    public Producto() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getSrcImage() {
        return srcImage;
    }

    public void setSrcImage(String srcImage) {
        this.srcImage = srcImage;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
