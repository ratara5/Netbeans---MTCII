/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class PrincipalGenericMethod {

    public static void main(String args[]) {

        Collection<String> lista = new ArrayList<String>(Arrays.asList("A", "B", "C"));

        Collection<String> nueva = duplicarColleccion(lista);

        nueva.forEach(x -> System.out.println(x));

    }

    public static <T> Collection<T> duplicarColleccion(Collection<T> coleccion) {

        coleccion.addAll(coleccion);
        return coleccion;

    }
}
