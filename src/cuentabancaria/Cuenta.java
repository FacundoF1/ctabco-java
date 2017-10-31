/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentabancaria;

/**
 *
 * @author facundo
 */
public class Cuenta {
    
    private double saldo; // variable instancia que almacena el saldo
    
    
    // Construcctor
    public Cuenta( double saldoInicial){
        if( saldoInicial > 0.0 )
            saldo = saldoInicial; // Validamos el saldo inicial y-o inicializamos
    }
    
    // genera un ingreso en la cuenta
    public void abonar( double monto ){
        saldo = saldo + monto;
    }
    
    // obtener saldo de la cuenta
    public double obtenerSaldo(){
        return saldo;
    }
    
}
