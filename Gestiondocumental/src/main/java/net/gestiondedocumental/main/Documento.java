/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.gestiondedocumental.main;

/** 
 *
 * @author LAB_REDES
 */
public class Documento {
    private String nombre;
    private String fechaPublicacion; 
    private String isbn;
    private String tipoDocumentos;
    private String genero;
    private String autor;
    private String descripcion;
    private int numeroPaginas;
    private int edicion;
    private int cantidadDisponible;
    private double precio;
    private double valoracion;
    
    public Documento(){}

    public Documento(String nombre, String fechaPublicacion, String isbn, String tipoDocumentos, String genero, String autor, String descripcion, int numeroPaginas, int edicion, int cantidadDisponible, double precio, double valoracion) {
        this.nombre = nombre;
        this.fechaPublicacion = fechaPublicacion;
        this.isbn = isbn;
        this.tipoDocumentos = tipoDocumentos;
        this.genero = genero;
        this.autor = autor;
        this.descripcion = descripcion;
        this.numeroPaginas = numeroPaginas;
        this.edicion = edicion;
        this.cantidadDisponible = cantidadDisponible;
        this.precio = precio;
        this.valoracion = valoracion;
    }
    
    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTipoDocumentos(String tipoDocumentos) {
        this.tipoDocumentos = tipoDocumentos;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
    
    //getters
    public String getNombre() {
        return nombre;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTipoDocumentos() {
        return tipoDocumentos;
    }

    public String getGenero() {
        return genero;
    }

    public String getAutor() {
        return autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public int getEdicion() {
        return edicion;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public double getPrecio() {
        return precio;
    }

    public double getValoracion() {
        return valoracion;
    } 
}