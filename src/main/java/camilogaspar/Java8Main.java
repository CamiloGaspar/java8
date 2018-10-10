package camilogaspar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Java8Main
{
    public static void main( String[] args )
    {
        Java8Main app = new Java8Main();
        app.ordenar();
        app.calcular();
    }

    public void ordenar(){
        List<String> lista = new ArrayList<String>();
        lista.add("Juan");
        lista.add("Pedro");
        lista.add("Andrés");
        lista.add("Carlos");


        /* SIN LAMBDA
        Collections.sort(lista, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        }); */
        // CON LAMBDA
        Collections.sort(lista, (s1, s2) -> s1.compareTo(s2));

        for(String elem: lista){
            System.out.println(elem);
        }
    }

    public void calcular(){

        /* SIN LAMBDA
        Operacion op = new Operacion() {
            @Override
            public double calcularPromedio(double n1, double n2) {
                return (n1+n2)/2;
            }
        };*/

        // CON LAMBDA
        Operacion op = (double d1, double d2) -> (d1+d2)/2;

        System.out.println(op.calcularPromedio(4, 12));
    }
}
