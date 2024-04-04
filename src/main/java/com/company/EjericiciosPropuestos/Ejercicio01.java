package com.company.EjericiciosPropuestos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio01 {

    /*

    Desarrollar un programa en Java que permita calcular la remuneración del empleado. 
    Ingrese el básico, número de hijos y cargo;
    si su cargo es obrero [O] recibirá 100 por Bonificación, 
    si su cargo es empleado [E] recibirá una Bonificación de 120. 
    Si tiene hijos recibirá por cada uno 41 soles por concepto de Asignación.
    El total será la suma del básico, bonificación y Asignación.
     */
    public static void main(String[] args) {

        int sueldoBasico;
        int numhijos;
        int cargo;

        sueldoBasico = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa su sueldo basico", "Ingresando Datos", 1));
        numhijos = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad de Hijos", "Ingresando Datos", 1));
        cargo = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                   Cargo
                                                                   1. Obrero
                                                                   2. Empleado""", "Ingresando datos", 1));
        JOptionPane.showMessageDialog(null, cacularRemu(cargo, sueldoBasico, numhijos), "Mostrando sueldo Basico", 2);
    }

    public static String cacularRemu(int cargo, int sueldobasico, int nHijos) {
        String mensaje;
        double remuneracion;
        switch (cargo) {
            case 1:
                remuneracion = (sueldobasico + 100) + (nHijos * 41);
                mensaje = "Sueldo Total: " + remuneracion;
                break;
            case 2:
                remuneracion = (sueldobasico + 120) + (nHijos * 41);
                mensaje = "Sueldo Total: " + remuneracion;
                break;
            default:
                mensaje = "Eliga una opcion Valida";
                break;
        }
        return mensaje;
    }
}
