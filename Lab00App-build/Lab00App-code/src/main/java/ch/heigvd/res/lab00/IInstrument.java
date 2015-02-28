/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.heigvd.res.lab00;

/**
 *
 * @author mohammadhossein
 */
public abstract class IInstrument {

    String play() {
        return "beeeeep";
    }

    int getSoundVolume() {
        return 10;
    }

    abstract String getColor();
    
}
