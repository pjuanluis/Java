package com.cursos.rxjava;

import rx.Observable;
import rx.functions.Action1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RxApp {

    private List<Integer> list1;
    private List<Integer> list2;

    public RxApp(){
        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        this.fillList();
    }

    public void fillList(){
        for (int i = 0; i < 10; i++) {
            list1.add(i);
            list2.add(i);
        }
    }

    /**
     * Buscar de manera asincrona en ambas listas
     */
    public void search(){
        Observable<Integer> obs1 = Observable.from(list1);
        Observable<Integer> obs2 = Observable.from(list2);
        //Expresion comun
/*        Observable.merge(obs1, obs2).subscribe(new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if (integer == 1)
                    System.out.println(integer);
            }
        });*/
        //Lambda
        Observable.merge(obs1, obs2).filter(x -> x == 1).subscribe(System.out::println);
        Observable.merge(obs1, obs2).filter(x -> x == 1).subscribe(x -> {
            if (x == 1)
                System.out.println(x);
        });
    }

    public static void main(String[] args) {
/*        List<String> list = Arrays.asList("Mito", "Code", "MitoCode");

        Observable<String> observable = Observable.from(list);
        observable.subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println(s);
            }
        });*/
        RxApp app = new RxApp();
        app.search();

    }
}
