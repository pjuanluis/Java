package com.cursos.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ColeccionApp {

    private List<String> lista;

    public void llenarLista(){
        lista = new ArrayList<>();
        lista.add("MitoCode");
        lista.add("Mito");
        lista.add("Code");
    }

    public void usarForEach(){
        //lista.forEach(x -> System.out.println(x));
        lista.forEach(System.out::println);
    }

    public void usarremoveIf(){
/*        Iterator<String> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Code")) {
                it.remove();
            }
        }*/
        lista.removeIf(x -> x.equalsIgnoreCase("Code"));
    }

    public void usarSort(){
        //Collections.sort(lista);
        lista.sort((x, y) -> x.compareTo(y));
    }

    public static void main(String[] args) {
        ColeccionApp app = new ColeccionApp();
        app.llenarLista();
        app.usarForEach();
    }

}
