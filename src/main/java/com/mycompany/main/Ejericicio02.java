package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 *
 */
/*
Una empresa desea adquirir cierta cantidad de unidades de un producto para 
lo cual cuenta con la oferta de los provedores A y B, tal como se explica a continuacion

Provedor A: 
Costo Unitario igual a S/.25
15% de descuento para mas de 50 unidades adquiridas
Provedor B:
Costo Unitario igual a S/. 27.5
10% de descuento para mas de 35 Unidades adquiridas .
Desarrollar un programa en Java que determine quien de los provedores es el mas conveniente 
 */
public class Ejericicio02 {
    
    public static void main(String[] args) {
        int cantUnidades;
        double costoUnidad;
        double descuentoA, descuentoB;
        cantUnidades = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa al cantidad de Unidades: ", "Cantidad de unidades", 2));
        
        if (cantUnidades > 50) {
            descuentoA = 0.15 * cantUnidades * 25;
        } else {
            descuentoA = 0;
        }
        
        if (cantUnidades > 30) {
            descuentoB = 0.10 * cantUnidades * 27.5;
        } else {
            descuentoB = 0;
        }
        String verificarProvedor = verProvedor(descuentoA, descuentoB);
        
        JOptionPane.showMessageDialog(null, verificarProvedor, "Mostrando provedor", 2);
        
    }
    
    public static String verProvedor(double descA, double descB) {
        if (descA > descB) {
            return "CONVIENE EL PROVEDOR A";
        } else {
            return "CONVIENE EL PROVEDOR B";
        }
    }
    
}
