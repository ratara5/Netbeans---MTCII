/* LA EXPLICACIÓN ESTÁ EN: https://www.youtube.com/watch?v=nUuVdKBttKc*/

package co.cajero.bean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author TabSan
 */
public class Cliente {
    private String numeroDeCedula;
    private String constrasena;
    
    private String nombreCompleto;
    
    private float saldo;
    private float tipoCuenta; //CA - CC

    /**
     * @return the numeroDeCedula
     */
    public String getNumeroDeCedula() {
        return numeroDeCedula;
    }

    /**
     * @param numeroDeCedula the numeroDeCedula to set
     */
    public void setNumeroDeCedula(String numeroDeCedula) {
        this.numeroDeCedula = numeroDeCedula;
    }

    /**
     * @return the constrasena
     */
    public String getConstrasena() {
        return constrasena;
    }

    /**
     * @param constrasena the constrasena to set
     */
    public void setConstrasena(String constrasena) {
        this.constrasena = constrasena;
    }

    /**
     * @return the nombreCompleto
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * @param nombreCompleto the nombreCompleto to set
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    /**
     * @return the saldo
     */
    public float getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoCuenta
     */
    public float getTipoCuenta() {
        return tipoCuenta;
    }

    /**
     * @param tipoCuenta the tipoCuenta to set
     */
    public void setTipoCuenta(float tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }
            
    
    
    
    
}
