package com.cursos.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapApp {

    private Map<Integer, String> map;

    public void poblar(){
        map = new HashMap<>();
        map.put(1, "Mito");
        map.put(2, "Code");
        map.put(3, "Luis");
    }

    public void imprimir_v7(){
        for (Entry<Integer, String> e : map.entrySet()){
            System.out.println("Llava: " + e.getKey() + " Valor: " + e.getValue());
        }
    }

    public void imprimir_v8(){
        //map.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
        map.entrySet().stream().forEach(System.out::println);
    }

    public void recolectar(){
        Map<Integer, String > mapRecolectado = map.entrySet().stream()
                .filter(e -> e.getValue().contains("Lu"))
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));

        mapRecolectado.forEach((k, v) -> System.out.println("Key: " + k + " Value: " + v));
    }

    public void insertarSiAusente(){
        map.putIfAbsent(3, "Juan");
    }

    public void operarSiPresente(){
        map.computeIfPresent(3, (k, v) -> k + v);
        System.out.println(map.get(3));
    }

    public void obtenerOrPredeterminado(){
       String value =  map.getOrDefault(5, "Valor por defecto");
        System.out.println(value);
    }

    public static void main(String[] args) {
        MapApp app = new MapApp();
        app.poblar();
        //app.insertarSiAusente();
        //app.imprimir_v8();
        //app.operarSiPresente();
        //app.obtenerOrPredeterminado();
        app.recolectar();
    }
}
