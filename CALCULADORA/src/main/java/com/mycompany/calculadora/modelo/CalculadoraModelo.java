package com.mycompany.calculadora.modelo;

public class CalculadoraModelo {
    
    private Integer numero1;
    private Integer numero2;
    private Integer resultado;

    public Integer getNumero1() {
        return numero1;
    }

    public void setNumero1(Integer numero1) {
        this.numero1 = numero1;
    }

    public Integer getNumero2() {
        return numero2;
    }

    public void setNumero2(Integer numero2) {
        this.numero2 = numero2;
    }

    public Integer getResultado() {
        return resultado;
    }

    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }
    
    public Integer sumar(){
        resultado = numero1 + numero2;
        return resultado;
    }
    
    public Integer restar(){
        resultado = numero1 - numero2;
        return resultado;
    }
    
    public Integer multiplicar(){
        resultado = numero1 * numero2;
        return resultado;
    }
    
    public Integer dividir(){
        resultado = numero1 / numero2;
        return resultado;
    }
    
    public Integer calcularModulo(){
        resultado = numero1 % numero2;
        return resultado;
    }
}
