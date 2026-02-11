package org.example;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {

    private String codigo;
    private String nombre;
    private String correo;
    private String carrera;
    List<Cursos> curso = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String correo, String carrera, List<Cursos> curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Cursos> getCurso() {
        return curso;
    }

    public void setCurso(List<Cursos> curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", curso=" + curso +
                '}';
    }

    public void inscribir(Cursos curso){
        this.curso.add(curso);
    }
}