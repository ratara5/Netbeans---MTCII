package com.mycompany.calculadora1;

import com.mycompany.calculadora.controlador.CalculadoraController;
import com.mycompany.calculadora.modelo.CalculadoraModelo;
import com.mycompany.calculadora.vista.CalculadoraConsola;
import com.mycompany.calculadora.vista.CalculadoraVista;

public class App {
    
    private enum tipoVista{
        CONSOLA, SUMA, RESTA, MULTIPLICACION, DIVISION, MODULO
    }
    
    public static void main(String[] args) {
        
        tipoVista tipo = tipoVista.CONSOLA;
        CalculadoraVista view = null;
        
        switch(tipo){
            case CONSOLA:
                view = new CalculadoraConsola();
                break;
        }
        
        CalculadoraModelo model = new CalculadoraModelo();
        CalculadoraController controller = new CalculadoraController(view, model);
        controller.iniciar();
    }
}
