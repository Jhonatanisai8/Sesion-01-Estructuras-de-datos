package com.company.EjericiciosPropuestos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio04 {

    /*
    Desarrollar un Algoritmo que permita calcular la remuneración
    del trabajador donde ingrese el básico y cargo; 
    Según el Cargo recibirá lo siguiente:
     */
    public static void main(String[] args) {
        int sueldobasico;
        int cargo;
        String mensaje = """
                         1. Obrero
                         2.Empleado
                         3.Ejecutivo""";
        sueldobasico = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el sueldo basico: "));
        cargo = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "Elije un cargo", 2));
        double remu = calcularRemuneracion(sueldobasico, cargo);
        JOptionPane.showMessageDialog(null, "Su remuneracion es: " + remu, "Resultado", 2);

    }

    public static double calcularRemuneracion(int sueldoBasico, int cargo) {
        switch (cargo) {
            case 1:
                sueldoBasico += 100 + 120;
                break;
            case 2:
                sueldoBasico += 120 + 150 + 200;
                break;
            case 3:
                sueldoBasico += 250 + 250 + 500;
                break;
            default:

                break;
        }

        return sueldoBasico;
    }

}
