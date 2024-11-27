package com.proyecto.proyecto.models;

public class Producto{
    private Integer idPro;
    private String nombreProducto;
    private Integer valor;
    private Integer cantidad;



    
    public Producto(Integer idPro, String nombreProducto, Integer valor, Integer cantidad) {
        this.idPro = idPro;
        this.nombreProducto = nombreProducto;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    
    public Integer getIdPro() {
        return idPro;
    }
    public void setIdPro(Integer idPro) {
        this.idPro = idPro;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public Integer getValor() {
        return valor;
    }
    public void setValor(Integer valor) {
        this.valor = valor;
    }
    public Integer getCantidad() {
        return cantidad;
    }
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }


    

   







    
}
