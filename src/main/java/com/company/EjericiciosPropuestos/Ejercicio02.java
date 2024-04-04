package com.company.EjericiciosPropuestos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio02 {

    /*
    
    Desarrollar un   programa en Java que permita calcular la comisión total que recibe un vendedor
    donde ingrese el monto de ventas, si el monto es menor a 10000 recibirá solamente 5% de su venta por comisión; 
    si sus ventas se encuentran entre 10000 a 50000 su comisión será de 7.5% de las ventas y 200 por bonificación,
    pero si su venta es mayor a 50000 su comisión será de 9% de sus ventas y su bonificación es 300.
    Visualizar el total.

     */
    public static void main(String[] args) {
        double comision;
        double montoVentas;

        montoVentas = Double.parseDouble(JOptionPane.showInputDialog("Ingrese sus ventas: "));

        comision = calcularComision(montoVentas);
        JOptionPane.showMessageDialog(null, "Comision por su venta de: " + montoVentas + " es " + comision);
    }

    public static double calcularComision(double montoVentas) {
        double comi;
        if (montoVentas >= 0 && montoVentas < 10000) {
            comi = montoVentas * 0.05;
        } else if (montoVentas >= 10000 && montoVentas <= 50000) {
            comi = (montoVentas * 0.075) + 200;
        } //elif (montoVentas > 50000)
        else {
            comi = (montoVentas * 0.09) + 300;
        }
        return comi;
    }

}
