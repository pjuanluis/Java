package com.cursos.lambdas;

public interface PersonaB {

    default public void hablar(){
        System.out.println("saludos Coders - ClaseB");
    }
}
