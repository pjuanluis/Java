package com.cursos.lambdas;

public interface PersonaA {

    public void caminar();

    default public void hablar(){
        System.out.println("saludos Coders - ClaseA");
    }
}
