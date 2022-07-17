package com.mycompany.calculadora.vista;

import com.mycompany.calculadora.controlador.CalculadoraController;
import com.mycompany.calculadora.controlador.Operacion;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculadoraConsola implements CalculadoraVista{
    
    private String numero1;
    private String numero2;
    private CalculadoraController controller;
    
    private void menuPrincipal(){
        
        try(BufferedReader input = new BufferedReader(new InputStreamReader(System.in))){
            boolean mainLoop = true;
            while(mainLoop){
                System.out.println("CALCULADORA MANUAL");
                System.out.println("Puede escoger cualquier operación aritmética a ejecutar");
                System.out.println("'+': SUMA");
                System.out.println("'-': RESTA");
                System.out.println("'*': MULTIPLICACIÓN");
                System.out.println("'/': DIVISIÓN");
                System.out.println("'%': MODULO");
                System.out.println("'.': SALIDA");
                System.out.println("Ingrese la operación que desea ejecutar mediante su símbolo");
                String opcion = input.readLine();
                
                switch(opcion){
                    case "+":
                        controller.setOperation(Operacion.SUMA);
                        break;
                                
                    case "-":
                        controller.setOperation(Operacion.RESTA);
                        break;
                                
                    case "*":
                        controller.setOperation(Operacion.MULTIPLICACION);
                        break;
                                
                    case "/":
                        controller.setOperation(Operacion.DIVISION);
                        break; 
                                
                    case "%":
                        controller.setOperation(Operacion.MODULO);
                        break;
                                
                    case ".":
                        System.out.println("HASTA LA PRÓXIMA");
                        mainLoop = false;
                        continue;
                                
                    default:
                        System.err.println("Opción "+ opcion +" no es válida");
                        System.out.println("Presione ENTER para continuar");
                        input.readLine();
                        continue;
                }
                
                System.out.println("Ingrese el primer número");
                numero1 = input.readLine();
                System.out.println("Ingrese el segundo número");
                numero2 = input.readLine();
                controller.actionPerformed(null);
                System.out.println("Presione ENTER para continuar");
                input.readLine();
            }
        } catch (IOException ex) {
            System.out.println("Error en la aplicación"+ex.getMessage());
        }
    }
    
    @Override
    public String getNumero1() {
        return numero1;
    }
    
    @Override
    public String getNumero2() {
        return numero2;
    }
    
    @Override
    public void setResultado(String resultado){
        System.out.println("El resultado: "+resultado);
    }
    
    @Override
    public void iniciar(CalculadoraController controller){
        this.controller = controller;
        menuPrincipal();
    }
    
    @Override
    public void mostrarExcepcion(Exception ex){
        System.err.println("La excepción es: " + ex.getMessage());
    }
}
