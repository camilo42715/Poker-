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
public class Poker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baraja miBaraja = new Baraja();
        miBaraja.crearBaraja();
        System.out.println(miBaraja.Baraja[0][0].numero);
        System.out.println(miBaraja.Baraja[0][0].simbolos);
        miBaraja.barajar();
        System.out.println(miBaraja.Baraja[0][0].numero);
        System.out.println(miBaraja.Baraja[0][0].simbolos);
    }

}
