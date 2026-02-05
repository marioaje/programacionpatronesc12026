package org.example.model;

public class Libro {


    //Cumplimos con el encapsulamiento
    private String titulo;
    private String autor;
    private String categoria;
    private String disponibilidad;
    public String atributoPublico;

    public Libro(String titulo, String autor, String categoria, String disponibilidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.disponibilidad = disponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    //        Clase Libro:
//
//        Atributos privados: título, autor, categoría, disponibilidad.
//        Métodos públicos: getters y setters para acceder y modificar los atributos, métodos para prestar y devolver libros.
//
}
