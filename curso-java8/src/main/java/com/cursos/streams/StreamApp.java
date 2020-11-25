package com.cursos.streams;

import java.util.ArrayList;
import java.util.List;

public class StreamApp {

    private List<String> lista;
    private List<String> numeros;

    public StreamApp(){
        lista = new ArrayList<>();
        lista.add("Mito");
        lista.add("Code");
        lista.add("Luis");
        lista.add("MitoCode");

        numeros = new ArrayList<>();
        numeros.add("1");
        numeros.add("2");
    }

    public void filtrar() {
        lista.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar() {
        //Forma Ascendente
        lista.stream().sorted().forEach(System.out::println);
        //Forma desendente
        lista.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar() {
        //lista.stream().map(String::toUpperCase).forEach(System.out::println);
        //Convertir los string en int
        numeros.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);

    }

    public void limitar() {
        lista.stream().limit(2).forEach(System.out::println);
    }

    public void contar() {
       long x = lista.stream().count();
        System.out.println(x);
    }

    public static void main(String[] args) {
        StreamApp app = new StreamApp();
        //app.filtrar();
        //app.ordenar();
        //app.transformar();
    }



}
