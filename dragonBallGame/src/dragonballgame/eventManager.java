/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import dragonballgame.Events.event;
import java.util.Random;

/**
 *
 * @author pietr
 */
public class EventManager {
    public static event randomEvent(){
        int rnd = new Random().nextInt(event.values().length);
        event eventoRandom = event.values()[rnd];  
        if(eventoRandom.equals("dragonBall")){
            int i = new Random().nextInt(100);
            if(i<50){
                 rnd = new Random().nextInt(event.values().length);
            }
            else{
                return eventoRandom;
            }
        }
            
        return eventoRandom;
    }
    
    
    
}
