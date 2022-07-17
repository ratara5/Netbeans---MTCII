/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_generics;

import java.util.ArrayList;
import java.util.List;

public class Bolsa<T> {

    private List<T> lista = new ArrayList<T>();

    public void add(T item) {

        lista.add(item);
    }

}
