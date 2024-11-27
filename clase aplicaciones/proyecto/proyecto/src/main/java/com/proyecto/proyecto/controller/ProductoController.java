package com.proyecto.proyecto.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.proyecto.proyecto.models.Producto;

import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

@RestController
public class ProductoController {

       // Lista de productos inicializada con productos por defecto
    private List<Producto> productos = new ArrayList<>();

    // Constructor para inicializar algunos productos por defecto
    public ProductoController() {
        Producto p1 = new Producto(1, "Laptop");
        Producto p2 = new Producto(2, "Smartphone");
        Producto p3 = new Producto(3, "Tablet");

        productos.addAll(Arrays.asList(p1, p2, p3));
    }


    // Obtener todos los productos
    @GetMapping("/productos")
    public List<Producto> getProductos() {
        return productos;
    }

    // Listar productos por nombre
    @GetMapping("/productos/buscar")
    public List<Producto> getProductoPorNombre(@RequestParam String nombre) {
        return productos.stream()
            .filter(producto -> producto.getNombreProducto() != null && producto.getNombreProducto().equalsIgnoreCase(nombre))
            .collect(Collectors.toList());
    }

    // Agregar un nuevo producto
    @PostMapping("/productos")
    public Producto postProducto(@RequestBody Producto producto) {
        productos.add(producto);
        return producto;
    }

    // Modificar un producto existente por ID
    @PutMapping("/productos/{id}")
    public String putProducto(@PathVariable int id, @RequestBody Producto productoActualizado) {
        Producto productoExistente = productos.stream()
            .filter(producto -> producto.getIdPro() == id)
            .findFirst()
            .orElse(null);

        if (productoExistente != null) {
            productoExistente.setNombreProducto(productoActualizado.getNombreProducto());
            return "Producto con ID " + id + " modificado correctamente.";
        } else {
            return "Producto con ID " + id + " no encontrado.";
        }
    }

    // Eliminar un producto por ID
    @DeleteMapping("/productos/{id}")
    public String deleteProducto(@PathVariable int id) {
        Producto productoAEliminar = productos.stream()
            .filter(producto -> producto.getIdPro() == id)
            .findFirst()
            .orElse(null);

        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
            return "Producto con ID " + id + " eliminado correctamente.";
        } else {
            return "Producto con ID " + id + " no encontrado.";
        }
    }

   
}
