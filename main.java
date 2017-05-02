/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import model.cuentaDeBanco;
import model.cuentaDeAhorro;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class main {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Que cuenta desea abrir?(ingresa el numero 1 o 2)");
            System.out.println("1 -> Cuenta Bancaria");
            System.out.println("2 -> Cuenta de Ahorro");
            int cuenta = entrada.nextInt();
        
        if (cuenta == 1){    
        System.out.println("Proporcione tu numero de cuenta. ");
        int numeroDeCuenta = entrada.nextInt();
        System.out.println("Ingresa tu nombre . ");
        String cliente = entrada.next();
       cuentaDeBanco cuentaBancaria = 
                new cuentaDeBanco(numeroDeCuenta,cliente);
        int contador = 0;
        while (contador == 0){
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 -> Depositar");
            System.out.println("2 -> Retirar");
            System.out.println("3 -> Finalizar");
            int accion = entrada.nextInt();
            if (accion == 1){
                System.out.println("¿Cuanto dinero deseas depositar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Depositar(cantidad);
            }
            if (accion == 2){
                System.out.println("¿Cuanto dinero deseas retirar?");
                double cantidad = entrada.nextDouble();
                cuentaBancaria.Retirar(cantidad);
            }
            if (accion == 3){
                System.out.println("Fin");
                contador = 1;
            }
            double saldo = cuentaBancaria.getSaldo();
            System.out.println(+saldo);
            }   
        }
        
        if(cuenta == 2){
            System.out.println("Proporcione el numero de cuenta. ");
            int numeroDeCuenta = entrada.nextInt();
            System.out.println("Proporcione el nombre de el cliente.");
            String cliente = entrada.next();
            cuentaDeAhorro nuevaCuenta = 
                    new cuentaDeAhorro(numeroDeCuenta,cliente);
            
            System.out.println(nuevaCuenta.getSaldo());
           nuevaCuenta.Depositar(200);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());    
            nuevaCuenta.Retirar(500);
            System.out.println(nuevaCuenta.getSaldo());
            nuevaCuenta.corteMensual();
            System.out.println(nuevaCuenta.getSaldo());
        }
        int contador = 0;
        }
    }
    