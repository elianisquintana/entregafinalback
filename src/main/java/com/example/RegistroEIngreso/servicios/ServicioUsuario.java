package com.example.RegistroEIngreso.servicios;

import com.example.RegistroEIngreso.modelos.Usuario;
import com.example.RegistroEIngreso.repositorios.IRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioUsuario {

    @Autowired
    IRepositorio repositorio;


    public boolean guardar(Usuario datosDelUsuario){
        repositorio.save(datosDelUsuario);
        return true;
    }
}
