package com.cursos.optional;

import java.util.Optional;


public class OptionalApp {

    public void probar(String value){
        //System.out.println(value.contains("Mito"));
        try {

            Optional op = Optional.empty();
            op.get();

        } catch (Exception e){
            System.out.println("No hay elemento");
        }

    }

    public void orElse(String value){
        Optional<String> op = Optional.ofNullable(value);
        String x = op.orElse("Valor Predeterminado");
        System.out.println(x);

    }

    public void orElseThrow(String value){
        Optional<String> op = Optional.ofNullable(value);
        op.orElseThrow(NullPointerException::new);
    }

    public void isPresent(String value){
        Optional<String> op = Optional.ofNullable(value);
        System.out.println(op.isPresent());

    }

    public static void main(String[] args) {
        OptionalApp app = new OptionalApp();
        //app.probar();
        //app.orElse(null);
        //app.orElseThrow(null);
        app.isPresent(null);
    }
}
