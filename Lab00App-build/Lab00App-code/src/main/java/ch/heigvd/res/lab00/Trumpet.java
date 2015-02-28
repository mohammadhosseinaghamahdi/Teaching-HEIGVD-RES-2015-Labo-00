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
public class Trumpet extends IInstrument{
    
    @Override
    String play(){
        return "pouet";
    }
    
    @Override
    int getSoundVolume() {
        return 20;
    }
    
    String getColor(){
        return "golden";
    }
}
