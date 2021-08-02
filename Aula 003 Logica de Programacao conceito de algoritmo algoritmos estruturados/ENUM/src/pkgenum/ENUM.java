/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgenum;

/**
 *
 * @author azlin
 */

class TipoDeFruta {
    enum TipoFruta{banana, laranja, abacaxi}
    TipoFruta Type;
}
public class ENUM {

    public static void main(String[] args) {
        TipoDeFruta Fruta = new TipoDeFruta();
        Fruta.Type = TipoDeFruta.TipoFruta.banana;
        System.out.println("Fruta: " + Fruta.Type);
    }
    
}
