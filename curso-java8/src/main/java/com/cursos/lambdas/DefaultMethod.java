package com.cursos.lambdas;

public class DefaultMethod implements PersonaA, PersonaB {

    @Override
    public void caminar() {
        System.out.println("Hola Coders");
    }

    @Override
    public void hablar() {
        //PersonaA.super.hablar();
        System.out.println("Hola super");
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.hablar();
    }


}
