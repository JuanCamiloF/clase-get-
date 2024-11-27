package com.proyecto.proyecto.models;

public class Usuario {
private Integer idCli;
private String nombre;
private String apellidos;



public Usuario(Integer idCli, String nombre, String apellidos) {
    this.idCli = idCli;
    this.nombre = nombre;
    this.apellidos = apellidos;
}
public Integer getIdCli() {
    return idCli;
}
public void setIdCli(Integer idCli) {
    this.idCli = idCli;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellidos() {
    return apellidos;
}
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

}
