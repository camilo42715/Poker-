/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Posicion {

    int fila;
    int columna;

    void generarPosicion() {
        Random miAleatorio = new Random();
        fila = miAleatorio.nextInt(3);
        columna = miAleatorio.nextInt(12);

    }
}
