package com.company.EjericiciosPropuestos;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio03 {

    /*
    Ingrese por Teclado el Nombre del Obrero, las horas trabajadas y 
    el Tipo de Actividad (Pintado, Laqueado, Barnizado), 
    por cada hora trabajada se le pagara:
    a) Si el Servicio es Pintado se le pagara s/. 10 
    b) si el Servicio es Laqueado se le pagara s/. 12 
    c) si el Servicio es Barnizado se le pagara s/. 14
    
    
    Por cada hora extra se le pagara 30% más sobre el pago por hora trabajada, 
    sabiendo que semanalmente trabaja 40 horas. 
    Calcule y visualice El Jornal Semanal que recibirá el Obrero, 
    el Jornal Extra y el Total del Jornal.

     */
    public static void main(String[] args) {
        String nombre;
        int horasTrabajas;
        int tipoActividad;
        nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre del Obrero: ", "Ingresado Datos", 2);
        horasTrabajas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa las horas trabajadas: ", "Ingresando datos", 2));
        tipoActividad = Integer.parseInt(JOptionPane.showInputDialog(null, """
                                                                          1. Servicio de Pintado
                                                                          2. Servicio de Laqueado
                                                                          3, Servicio de Barnizado""", "Tipo de Actividad", 2));
        calcularJornal(tipoActividad, horasTrabajas);
    }

    public static void calcularJornal(int cargo, int horas) {

        //en caso se ingrese un numero por ejemplo 90 serian 2 semanas cada una de 40 y sobran 10
        /*
        90  40 = semana
            40 = otra semana
            10 extras;
         */
        //hacemos una resta sucesiva
        int semana;
        int cociente;
        int horasExtras;
        double pagoHorasNormales;
        double pagoHorasExtras;
        switch (cargo) {
            case 1:
                semana = 40;
                if (horas < semana) {
                    pagoHorasNormales = horas * 10;
                    JOptionPane.showMessageDialog(null, "Horas Trabajadas: " + horas
                            + "\nPago Horas Trabajadas: " + pagoHorasNormales);
                } else {
                    cociente = 0;
                    horasExtras = 0;
                    while (horas >= semana) {
                        cociente++;
                        horasExtras = horas - semana;
                        horas -= semana;
                    }

                    pagoHorasNormales = (cociente * semana) * 10;
                    pagoHorasExtras = horasExtras * ((10 * 0.30) + 10);

                    String mensaje = "Horas trabajadas Normales: " + (cociente * semana)
                            + "\nHoras Extras: " + horasExtras
                            + "\nPago Horas Normales: " + pagoHorasNormales
                            + "\nPago Horas Extras: " + pagoHorasExtras
                            + "\nTotal de horas: " + (horas);
                    JOptionPane.showMessageDialog(null, mensaje, "Mostrando Datos", 2);
                }
                break;
            case 2:
                semana = 40;
                if (horas < semana) {
                    pagoHorasNormales = horas * 10;
                    JOptionPane.showMessageDialog(null, "Horas Trabajadas: " + (semana - horas)
                            + "\nPago Horas Trabajadas: " + pagoHorasNormales);
                } else {
                    cociente = 0;
                    horasExtras = 0;
                    while (horas >= semana) {
                        cociente++;
                        horasExtras = horas - semana;
                        horas -= semana;
                    }

                    pagoHorasNormales = (cociente * semana) * 12;
                    pagoHorasExtras = horasExtras * ((12 * 0.30) + 12);

                    String mensaje = "Horas trabajadas Normales: " + (cociente * semana)
                            + "\nHoras Extras: " + horasExtras
                            + "\nPago Horas Normales: " + pagoHorasNormales
                            + "\nPago Horas Extras: " + pagoHorasExtras
                            + "\nTotal de horas: " + (horas);
                    JOptionPane.showMessageDialog(null, mensaje, "Mostrando Datos", 2);
                }
                break;
            case 3:
                semana = 40;
                if (horas < semana) {
                    pagoHorasNormales = horas * 10;
                    JOptionPane.showMessageDialog(null, "Horas Trabajadas: " + (semana - horas)
                            + "\nPago Horas Trabajadas: " + pagoHorasNormales);
                } else {
                    cociente = 0;
                    horasExtras = 0;
                    while (horas >= semana) {
                        cociente++;
                        horasExtras = horas - semana;
                        horas -= semana;
                    }

                    pagoHorasNormales = (cociente * semana) * 14;
                    pagoHorasExtras = horasExtras * ((14 * 0.30) + 14);
                    String mensaje = "Horas trabajadas Normales: " + (cociente * semana)
                            + "\nHoras Extras: " + horasExtras
                            + "\nPago Horas Normales: " + pagoHorasNormales
                            + "\nPago Horas Extras: " + pagoHorasExtras
                            + "\nTotal de horas: " + (horas);
                    JOptionPane.showMessageDialog(null, mensaje, "Mostrando Datos", 2);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Eliga un opcino valida", "WARNING", 3);
                break;
        }
    }

}
