package com.tienda.corebusiness.repository;

import com.tienda.security.model.Rol;
import com.tienda.security.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Set;

@Repository
public interface DeliveryRepository extends CrudRepository<Usuario, Long> {

    //ArrayList<Usuario> findByRoles(Set<Rol> roles);

}
