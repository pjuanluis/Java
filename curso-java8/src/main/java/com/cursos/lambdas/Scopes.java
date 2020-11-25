package com.cursos.lambdas;

public class Scopes {

    private static double attr1;
    private double attr2;

    /**
     * Cuando se tienen variables locales,
     * no se puede usar dentro de expresiones lambda
     * @return double
     */
    public double probarLocalVariable(){

        final double n3 = 3;

        Operacion operacion = (x,y) -> {
            return x + y + n3;
        };

        return operacion.calcularPromedio(1,1);
    }

    /**
     * Cuando se tienen variales globales,
     * si se pueden usar dentro de expresiones Lambda
     * @return double
     */
    public double probarAtributosStaticVariables(){

        Operacion operacion = (x, y) -> {
            attr1 = x + y;
            attr2 = attr1;
            return attr2;
        };

        return operacion.calcularPromedio(3, 2);

    }

    public static void main(String... lambda) {
        Scopes app = new Scopes();
        System.out.println(app.probarLocalVariable());
        System.out.println(app.probarAtributosStaticVariables());

    }


}
