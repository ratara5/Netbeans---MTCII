/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.cajero;

import java.util.Scanner;

/**
 *
 * @author TabSan
 */
public class Interfaz {
    
    private static int op, ret, con;
    private static boolean m;
    
    public static void main(String[] args) {
        System.out.println("Bienvenido a tu cajero");
        Scanner entrada=new Scanner(System.in);
                
        Despliegues despliegue1=new Despliegues();
        Cajero cajero1=new Cajero();
        m=true;
        while(m==true){
            op=despliegue1.menuRay();
            switch(op){
                case 1: op=1;
                    cajero1.consultaSaldo();
                    break;
                case 2: op=2;
                    System.out.println("-------------------------------");
                    System.out.println("Ingresa monto a retirar: ");
                    ret=entrada.nextInt();
                    cajero1.retiro(ret);
                    break;
                case 3: op=3;
                    System.out.println("-------------------------------");
                    System.out.println("Ingresa monto a consignar: ");
                    con=entrada.nextInt();
                    cajero1.deposito(con);
                    break;
                case 4: op=4;
                    System.out.println("-------------------------------");
                    System.out.println("Regresa pronto");
                    System.out.println("-------------------------------");
                    m=false;
                    break;
                }
        }
    }
}
