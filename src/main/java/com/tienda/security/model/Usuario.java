package com.tienda.security.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "TBL_USUARIO")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String email;
    @Column(unique = true)
    private String nombreUsuario;
    private String password;

    private String direccion;

    /*
    Relación muchos a muchos
    Un usuario puede tener varios roles, y un rol puede pertenecer a varios usuarios.
    Se creará una tabla intermedia llamada MDC_USUARIO_ROL donde se mapearán las columnas
    principales de las clases Usuario y Rol, tomando sud @Id de cada clase
    */
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "TBL_USUARIO_ROL", joinColumns = @JoinColumn(name = "usuario_id"),
    inverseJoinColumns = @JoinColumn(name = "rol_id"))
    private Set<Rol> roles = new HashSet<>();

    public Usuario() {
    }

    public Usuario(String nombre, String email, String nombreUsuario, String password, String direccion) {
        this.nombre = nombre;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.direccion = direccion;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<Rol> getRoles() {
        return roles;
    }

    public void setRoles(Set<Rol> roles) {
        this.roles = roles;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
