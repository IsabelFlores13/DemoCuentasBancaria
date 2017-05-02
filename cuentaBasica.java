/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author Lenovo
 */
public class cuentaBasica {
    private static final int numeroDeCuenta=0;
    private static final String cliente;
    private static final double saldo=0;
    private static final double depositar=0;
    private static final double retirar =0;
    
    
    public cuentaBasica(int numeroDeCuenta, double saldo, String cliente){
     }
    public cuentaBasica (){
   this( numeroDeCuenta,saldo ,cliente) ;
}
    public double saldo() {
    return this.saldo;

}
public double getdepositar() {
return this.depositar;
}
public double getretirar() {
return this.retirar;
}
}
