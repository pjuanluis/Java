package com.cursos.dateapi;

import java.time.*;
import java.util.Calendar;

public class App {

    public void verificar(int version){
        if (version == 7) {
            Calendar fecha1 = Calendar.getInstance();
            Calendar fecha2 = Calendar.getInstance();
            fecha1.set(1991, 0, 21);
            System.out.println(fecha1.after(fecha2));
        } else if (version == 8){
            LocalDate fecha1 = LocalDate.of(1993, 01, 13);
            LocalDate fecha2 = LocalDate.now();

            System.out.println(fecha1.isAfter(fecha2));
            System.out.println(fecha1.isBefore(fecha2));

            LocalTime hora1 = LocalTime.of(22, 30, 50);
            LocalTime hora2 = LocalTime.now();

            System.out.println(hora1.isAfter(hora2));
            System.out.println(hora1.isBefore(hora2));

            LocalDateTime fechaTiempo1 = LocalDateTime.of(1993, 8,22, 30, 50);
            LocalDateTime fechaTiempo2 = LocalDateTime.now();

            System.out.println(fechaTiempo1.isAfter(fechaTiempo2));
            System.out.println(fechaTiempo1.isBefore(fechaTiempo2));

        }
    }

    public void medirTiempo(int version) throws InterruptedException {
        if (version == 7){
            long ini = System.currentTimeMillis();
            Thread.sleep(1000);
            long fin = System.currentTimeMillis();
            System.out.println(fin - ini);

        } else if (version == 8){
            Instant ini = Instant.now();
            Thread.sleep(1000);
            Instant fin = Instant.now();
            System.out.println(Duration.between(ini, fin));
        }
    }

    public static void main(String[] args) {
        App app = new App();
        try {
            app.verificar(8);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
