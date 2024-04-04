package com.company.EjericiciosPropuestos;

import javax.swing.JOptionPane;

/**
 * @author Jhonatan
 */
public class Ejercicio05 {

    public static void main(String[] args) {

        int marca;
        int talla;
        int pares;
        String mensaje = """
                         1. [Nike]
                         2. [Adidas]
                         3. [Fila] """;
        String mensaje2 = """
                       1. [38]
                       2. [40] 
                       3. [42]""";
        marca = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje, "Selecciona una marca", 2));
        talla = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje2, "Selecciona una talla", 2));
        pares = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos pares necesita?", "Selecciona", 2));

        String mensaje3 = calcularPrecio(marca, talla, pares);
        JOptionPane.showMessageDialog(null, mensaje3, "MOSTRANDO INFORMACION", 2);

    }

    public static String calcularPrecio(int marca, int talla, int pares) {

        String mensaje = null;
        double precioFinal = 0;
        switch (marca) {
            case 1:
                switch (talla) {
                    case 1:
                        mensaje = informacionVenta(150, pares) + "\nMarca: Nike"
                                + "\nTalla : 38";
                        break;
                    case 2:
                        mensaje = informacionVenta(160, pares) + "\nMarca: Nike"
                                + "\nTalla : 40";
                        //precioFinal = precioFinal(160, pares);
                        break;
                    case 3:
                        mensaje = informacionVenta(160, pares) + "\nMarca: Nike"
                                + "\nTalla : 42";
                        // precioFinal = precioFinal(160, pares);
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (talla) {
                    case 1:
                        mensaje = informacionVenta(140, pares) + "\nMarca: Adidas"
                                + "\nTalla : 38";
                        //  precioFinal = precioFinal(140, pares);
                        break;
                    case 2:
                        mensaje = informacionVenta(150, pares) + "\nMarca: Adidas"
                                + "\nTalla : 40";
                        //precioFinal = precioFinal(150, pares);
                        break;
                    case 3:
                        mensaje = informacionVenta(150, pares) + "\nMarca: Adidas"
                                + "\nTalla : 42";
                        // precioFinal = precioFinal(150, pares);
                        break;
                    default:
                        break;
                }
                break;
            case 3:
                switch (talla) {
                    case 1:
                        mensaje = informacionVenta(80, pares) + "\nMarca: Fila"
                                + "\nTalla : 38";
                        // precioFinal = precioFinal(80, pares);
                        break;
                    case 2:
                        mensaje = informacionVenta(85, pares) + "\nMarca: Fila"
                                + "\nTalla : 40";
                        // precioFinal = precioFinal(85, pares);
                        break;
                    case 3:
                        mensaje = informacionVenta(90, pares) + "\nMarca: Fila"
                                + "\nTalla : 42";
                        //precioFinal = precioFinal(90, pares);
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }

        return mensaje;
    }

    public static String informacionVenta(int precio, int pares) {
        double preciofinal = 0;
        double descuento = 0;
        double totalPar = 0;
        String mensaje;
        if (pares >= 0 && pares <= 1) {
            preciofinal = precio;
        }
        if (pares >= 2 && pares <= 5) {
            totalPar = precio * pares;
            descuento = totalPar * 0.05;
            preciofinal = totalPar - descuento;
        }
        if (pares >= 6 && pares <= 10) {

            totalPar = precio * pares;
            descuento = totalPar * 0.08;
            preciofinal = totalPar - descuento;
        }
        if (pares >= 11 && pares <= 20) {
            totalPar = precio * pares;
            descuento = totalPar * 0.10;
            preciofinal = totalPar - descuento;
        }
        if (pares >= 21) {
            totalPar = precio * pares;
            descuento = totalPar * 0.15;
            preciofinal = totalPar - descuento;
        }
        mensaje = "Precio por par: " + precio
                + "\nPares: " + pares
                + "\nPrecio pares: " + totalPar
                + "\nDescuento: " + descuento
                + "\nPreciofinal: " + preciofinal;
        return mensaje;
    }

}
