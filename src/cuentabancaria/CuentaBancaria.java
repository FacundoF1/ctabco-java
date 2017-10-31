/*
 * Cuenta bancaria saldo inicial ingreso de montos.
 */
package cuentabancaria;
import java.util.Scanner;

/**
 *
 * @author facundo ferrari
 * http://facundoferrari.ml
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta ( 50.00);
        Cuenta cuenta2 = new Cuenta ( -7.53);
        
        System.out.printf("Saldo de la cuenta 1: $%.2f\n", cuenta1.obtenerSaldo() );
        System.out.printf("Saldo de la cuenta 2: $%.2f\n\n", cuenta2.obtenerSaldo() );
        
        Scanner entrada = new Scanner( System.in );
        double montoDeposito; // variable escrita por el usuario
        
        System.out.println("Escriba el monto a depositar en la cuenta 1: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\n sumando $%.2f al saldo de la cuenta 1\n\n", montoDeposito );
        cuenta1.abonar( montoDeposito ); // suma al saldo de la cuenta 1
        
        System.out.printf("Saldo de la cuenta 1: $%.2f\n", cuenta1.obtenerSaldo() );
        System.out.printf("Saldo de la cuenta 2: $%.2f\n\n", cuenta2.obtenerSaldo() );
        
        System.out.println("Escriba el monto a depositar en la cuenta 2: ");
        montoDeposito = entrada.nextDouble();
        System.out.printf("\n sumando $%.2f al saldo de la cuenta 2\n\n", montoDeposito );
        cuenta2.abonar( montoDeposito ); // suma al saldo de la cuenta 1
        
        System.out.printf("Saldo de la cuenta 1: $%.2f\n", cuenta1.obtenerSaldo() );
        System.out.printf("Saldo de la cuenta 2: $%.2f\n\n", cuenta2.obtenerSaldo() );
    }
    
}
