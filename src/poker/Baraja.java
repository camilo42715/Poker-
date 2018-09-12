/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

/**
 *
 * @author Estudiantes
 */
public class Baraja {

    String palos[] = {"trebol", "picas", "diamantes", "corazon"};
    String numero[] = {"As", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve", "dies", "jack", "queen", "king"};
    Carta Baraja[][] = new Carta[4][13];

    void crearBaraja() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                Baraja[i][j] = new Carta();
                Baraja[i][j].numero = numero[j];
                Baraja[i][j].simbolos = palos[i];
            }
        }
    }

    void barajar() {
        int cont = 0;
        int cambios = (int) (Math.random() * 1500) + 1;
        Posicion miPosicion = new Posicion();
        Posicion otraPosicion = new Posicion();
        Carta unaCarta;
        while (cont < cambios) {
            miPosicion.generarPosicion();
            unaCarta = Baraja[miPosicion.fila][miPosicion.columna];
            otraPosicion.generarPosicion();
            Baraja[miPosicion.fila][miPosicion.columna] = Baraja[otraPosicion.fila][otraPosicion.columna];
            Baraja[otraPosicion.fila][otraPosicion.columna] = unaCarta;
            cont++;
        }

    }
}
