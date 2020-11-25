package com.cursos.anotaciones;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class Anotaciones {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface Lenguajes {
        Lenguaje[] value() default {};
    }
    @Repeatable(value = Lenguajes.class)
    public @interface Lenguaje {
        String value();
    }

    //Java 1.7
/*    @Lenguajes({
            @Lenguaje("Java"),
            @Lenguaje("Python")
    })*/
    //Java 1.8
    @Lenguaje("Java")
    @Lenguaje("Python")
    public interface LenguajeProgramacion {

    }

    public static void main(String[] args) {

        Lenguaje[] lenguajeArray = LenguajeProgramacion.class.getAnnotationsByType(Lenguaje.class);
        System.out.println("Se tiene " + lenguajeArray.length + " anotaciones en lenguaje");

        Lenguajes len = LenguajeProgramacion.class.getAnnotation(Lenguajes.class);
        for (Lenguaje l : len.value())
            System.out.println(l.value());


    }
}
