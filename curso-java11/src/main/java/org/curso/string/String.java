package org.curso.string;

import java.util.stream.Collectors;

public class String {

    public void estaVacio(java.lang.String s){
        System.out.println(s.isBlank());
    }

    public void repetir(java.lang.String s, int qty){
        var repetido = s.repeat(qty);
        System.out.println(repetido);
    }

    public void convertirLista(java.lang.String s){
        System.out.println(s.lines().collect(Collectors.toList()));
    }

    public void removerEspacios(java.lang.String s){
        //Al inicio y al final
        System.out.println(s.strip());
        //Inicio
        System.out.println(s.stripLeading());
        //Final
        System.out.println(s.stripTrailing());
        //Inicio y Final
        System.out.println(s.trim());
    }
}
