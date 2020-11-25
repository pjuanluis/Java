package com.cursos.streams;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    private List<Integer> numeros;

    public void llenar(){
        numeros = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            numeros.add(i);
    }

    /**
     * Imprime la lista de numeros
     */
    public void probarStream(){
        numeros.stream().forEach(System.out::println);
    }

    /**
     * Usa hilos
     */
    public void probarParalelo(){
        //Lo imprime en desorden
        numeros.parallelStream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        ParallelStream app = new ParallelStream();
        app.llenar();
        //app.probarStream();
        app.probarParalelo();
    }
}
