package com.cursos.highorder;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class HighApp {

    private Function<String, String> toUpperCase = x -> x.toUpperCase();
    private Function<String, String> toLowerCase = x -> x.toLowerCase();

    public void print(Function<String, String> function, String value){
        System.out.println(function.apply(value));
    }

    public Function<String, String> show(String message){
        return (String x) -> message + x;
    }

    public void filter(List<String> list, Consumer<String> consumer, int len){
        list.stream().filter(this.logicFilter(len)).forEach(consumer);
    }
    public Predicate<String> logicFilter(int len){
        return texto -> texto.length() < len;
    }

    public static void main(String[] args) {
        HighApp app = new HighApp();
        app.print(app.toLowerCase, "HOLA MUNDO");
        app.print(app.toUpperCase, "from function");
        String res = app.show("Hello").apply("World");
        System.out.println(res);

        List<String> list = Arrays.asList("Mito", "Code", "MitoCode");
        app.filter(list, System.out::println, 5);
    }
}
