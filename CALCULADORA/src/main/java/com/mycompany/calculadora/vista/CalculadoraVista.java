package com.mycompany.calculadora.vista;

import com.mycompany.calculadora.controlador.CalculadoraController;

public interface CalculadoraVista {
    
    public String getNumero1();
    public String getNumero2();
    
    public void setResultado(String resultado);
    
    public void iniciar(CalculadoraController controller);
    
    public void mostrarExcepcion(Exception ex);
}
