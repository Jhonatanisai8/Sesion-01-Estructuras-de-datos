package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan Ejercici 01; En la Universidad Autónoma del Perú el
 * rendimiento de un alumno lo calisifican de acuerdo a lo siguientes
 * Calficacion Promedios Bueno Si su promedio esta entre 16 y 20 Regular Si su
 * promedio esta entre 11 y 15 Deficiente Si su promedio esta 6 y 10 Pesimo Si
 * su promedi esta entre 0 y 5 Desarrolla un programa que permita ingresar por
 * teclado 3 notas de un alumno y calcular su respectivo promedio
 *
 */
public class main {

    public static void main(String[] args) {

        //variables 
        int n1, n2, n3;
        String nota1, nota2, nota3;
        double promedio;

        nota1 = JOptionPane.showInputDialog(null, "Ingresa la primera nota: ", "Ingresando Notas", JOptionPane.INFORMATION_MESSAGE);
        nota2 = JOptionPane.showInputDialog(null, "Ingresa la segunda nota: ", "Ingresando Notas", JOptionPane.INFORMATION_MESSAGE);
        nota3 = JOptionPane.showInputDialog(null, "Ingresa la tercera nota: ", "Ingresando Notas", JOptionPane.INFORMATION_MESSAGE);

        //convertimos
        n1 = Integer.parseInt(nota1);
        n2 = Integer.parseInt(nota2);
        n3 = Integer.parseInt(nota3);
        //calculamos el promedio con dos decimales
        // return (double) Math.round((this.sueldoBasico * 0.10) * 100d) / 100d;
        promedio = Math.round(((n1 + n2 + n3) / 3) * 100d) / 100d;
        //  JOptionPane.showMessageDialog(null, "El promedio del aulo es: " + promedio, "Mostrando Notas", JOptionPane.INFORMATION_MESSAGE);
        String condicion = condicion(promedio);
        JOptionPane.showMessageDialog(null, "Promedio del Alumno es: "+promedio
                + "\nCondicion del alumno es: " + condicion, "CONDICION DEL ALUMNO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static String condicion(double promedio) {
        String condicion = "";
        if (promedio >= 0 && promedio <= 5) {
            condicion = "Pesimo";
        }
        if (promedio >= 6 && promedio <= 10) {
            condicion = "Deficiente";
        }
        if (promedio >= 11 && promedio <= 15) {
            condicion = "Regular";
        }
        if (promedio >= 16 && promedio <= 20) {
            condicion = "Bueno";
        }
        return condicion;
    }

}
