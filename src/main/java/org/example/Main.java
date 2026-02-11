package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Cursos> lstvacia = new ArrayList<>();

        Cursos c1 = new Cursos("505050", "programacion", "5");
        Cursos c2 = new Cursos("515151", "bases de datos", "5");
        Cursos c3 = new Cursos("525252", "redes", "5");

        Estudiante e1 = new Estudiante("101010", "lorena", "lor@gamil.com", "ingenieria",lstvacia);

        e1.inscribir(c1);
        e1.inscribir(c2);
        e1.inscribir(c3);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}

