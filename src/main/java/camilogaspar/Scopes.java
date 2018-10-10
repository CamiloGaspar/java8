package camilogaspar;

public class Scopes {
    
    public static void main( String[] args ) {
        Scopes app = new Scopes();

        System.out.println(app.probarLocalVariable());
    }

    private double probarLocalVariable() {
        final double n3 = 3;

        /* SIN LAMBDA
        Operacion op = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return n1+n2+n3;
            }
        };*/

        // CON LAMBDA
        Operacion op = (n1,n2)-> n1+n2+n3;

        return op.calcularPromedio(1,1);
    }
}
