package com.tienda.corebusiness.service;

import com.tienda.corebusiness.repository.DeliveryRepository;
import com.tienda.security.enums.RolNombre;
import com.tienda.security.model.Rol;
import com.tienda.security.model.Usuario;
import com.tienda.security.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DeliveryServiceImpl implements DeliveryService{

    @Autowired
    DeliveryRepository deliveryRepository;

    @Autowired
    RolService rolService;

    @Override
    public ArrayList<Usuario> getAllDelivery() {

        ArrayList<Usuario> listaUsuarios = (ArrayList<Usuario>) deliveryRepository.findAll();
        Optional<Rol> OpRol =  rolService.getByRolNombre(RolNombre.ROLE_DELIVERY);
        Set<Rol> roles = new HashSet<>();
        roles.add(OpRol.get());
        return (ArrayList<Usuario>) listaUsuarios.stream().filter(x -> x.getRoles().equals(roles)).collect(Collectors.toList());
    }
}
