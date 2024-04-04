package com.mycompany.main;

import javax.swing.JOptionPane;

/**
 *
 * @author Jhonatan
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        char categoria;
        double descuento;
        double promedio;

        categoria = JOptionPane.showInputDialog(null, """
                                                      Ingresa la categoria: 
                                                       (A),(B),(C),(D)""").charAt(0);

        switch (categoria) {
            case 'A':
                promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu promedio: "));
                JOptionPane.showMessageDialog(null, """
                                                    Pension Inicial S/.550
                                                    Pension Por tener Promedio:  """ + promedio + "  Nueva pension: " + nuevaPension(550, promedio));
                break;
            case 'B':
                promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu promedio: "));
                JOptionPane.showMessageDialog(null, """
                                                    Pension Inicial S/.500
                                                    Pension Por tener Promedio:  """ + promedio + "  Nueva pension: " + nuevaPension(500, promedio));
                break;

            case 'C':
                promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu promedio: "));
                JOptionPane.showMessageDialog(null, """
                                                    Pension Inicial S/.400
                                                    Pension Por tener Promedio: """ + promedio + " Nueva pension: " + nuevaPension(460, promedio));
                break;
            case 'D':
                promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa tu promedio: "));
                JOptionPane.showMessageDialog(null, """
                                                    Pension Inicial S/.400
                                                    Pension Por tener Promedio:  """ + promedio + "  Nueva pension: " + nuevaPension(400, promedio));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Categoria no encontrada");
                break;
        }
    }

    public static double nuevaPension(double pension, double promedio) {

        if (promedio >= 0 && promedio <= 13.99) {
            pension = pension;
        }
        if (promedio >= 14.00 && promedio <= 15.99) {
            pension -= (pension * 0.10);
        }
        if (promedio >= 16.00 && promedio <= 17.99) {
            pension -= (pension * 0.12);
        }
        if (promedio >= 18.00 && promedio <= 20.00) {
            pension -= (pension * 0.15);
        }
        return pension;
    }

}
