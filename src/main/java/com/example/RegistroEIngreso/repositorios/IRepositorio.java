package com.example.RegistroEIngreso.repositorios;

import com.example.RegistroEIngreso.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositorio  extends JpaRepository<Usuario,Integer> {
}
