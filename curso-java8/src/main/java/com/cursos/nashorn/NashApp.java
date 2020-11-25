package com.cursos.nashorn;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.FileReader;

/**
 * Nashhorn
 * Implementacion de JavaScript mediante Java
 *
 */
public class NashApp {

    private ScriptEngineManager manager;
    private ScriptEngine engine;
    private Invocable invocable;


    public NashApp(){
        manager = new ScriptEngineManager();
        engine = manager.getEngineByName("nashorn");
        invocable = (Invocable) engine;
    }

    public void callFunctions() throws Exception{
        //engine.eval("print('JS from Java')");
        engine.eval(new FileReader("src/main/java/com/cursos/nashorn/archivo.js"));
        String res = (String) invocable.invokeFunction("calcular", 2, 3);
        System.out.println(res);
    }

    public void implementInterface() throws Exception{

    }

    public static void main(String[] args) throws Exception {
        NashApp app = new NashApp();
        app.callFunctions();
    }

}
