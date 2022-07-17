/*
 * Clase para las funciones lógicas de las lavadoras Samsung
 * Falta documentar más este proyecto
 */
package llfunciones;

/**
 *
 * @author Raymond
 */
public class LlFunciones {
    private int kilos=0, llenadoCompleto=0, tipoDeRopa=0, lavadoCompleto=0, secadoCompleto=0; //lenadoCompleto toma valor 0 ó 1(sí o no). Tipo de ropa 1(color) 2(blanca). lavadoCompleto es 0 ó 1. private es el Encapsulamiento!
    
    public LlFunciones(int kilos, int tipoDeRopa){
        this.kilos=kilos; //this: esta variable es de ESTA clase
        this.tipoDeRopa=tipoDeRopa;  
    }
    
    private void llenado(){ //este método se encapsula con private, los programadores de samsung no necesitan acceder a estos métodos. void permite retornar el valor de una función(método) ejecutada. 
        if(kilos<=12){ //suponiendo q samsung nos advirtió que la nueva línea soporta hasta 12kg
            llenadoCompleto=1; //cambiaría el Completo por Correcto
            System.out.println("Llenando...");
            System.out.println("Llenado completo");
        }else{
            System.out.println("La carga de ropa es muy pesada. Reduce la carga");
        }
                
    }
    
    private void lavado(){
        llenado(); //necesitamos saber si se llenó la lavadora. Es decir revisar la etapa anterior
        if(llenadoCompleto==1){
            if(tipoDeRopa==1){
                System.out.println("Ropa blanca / Lavado suave");
                System.out.println("Lavando...");
                lavadoCompleto=1;
            } else if(tipoDeRopa==2){
                System.out.println("Ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto=1;
            } else{
                System.out.println("El tipo de ropa no está disponible");
                System.out.println("Se lavará como ropa de color / Lavado intenso");
                System.out.println("Lavando...");
                lavadoCompleto=1;
            }
        } //anadir algo si llenadoCompleto==0 
    }
    
    private void secado(){
        lavado(); //necesitamos revisar la etapa anterior
        if(lavadoCompleto==1){
            System.out.println("Secando...");
            secadoCompleto=1;
        } 
    }
    
    public void cicloFinalizado(){ //samsung nos dio el nombre de este método y nos dijo que debe ser público
        secado();
        if(secadoCompleto==1){
            System.out.println("Tu ropa está lista");
        }  
    }
}
