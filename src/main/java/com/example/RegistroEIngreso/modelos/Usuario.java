package com.example.RegistroEIngreso.modelos;

import jdk.jfr.events.CertificateId;
import sun.util.resources.LocaleData;

import java.time.LocalDate;
@Entity
public class Usuario {
    @Id
    private Integer id;
    private String nomdre;
    private String contraseña;
    private LocalDate fechaNacimiento;
    private String ciudad;

    public Usuario() {
    }

    public Usuario(Integer id, String nomdre, String contraseña, LocalDate fechaNacimiento, String ciudad) {
        this.id = id;
        this.nomdre = nomdre;
        this.contraseña = contraseña;
        this.fechaNacimiento = fechaNacimiento;
        this.ciudad = ciudad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomdre() {
        return nomdre;
    }

    public void setNomdre(String nomdre) {
        this.nomdre = nomdre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
