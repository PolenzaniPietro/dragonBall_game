/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import java.util.Random;

/**
 *
 * @author pietr
 */
public class GameManager {
     Player player;
     Character character;

    public GameManager() {
    }
    
     public int addDragonBall(){        
        return character.nBalls++; 
    }
    
    
    public void balzarBean(){
        character.balzarBean();
    }
    public void trainingSession(){
        character.trainingSession();
    }
    //da implementare dopo aver finito tutti i metodi dei vari personaggi
    public void enemyAppear(){
        Random random = new Random();
        //Enemy e = new Enemy(random.nextInt(70, 200));
    }
    public void eventSelection(){
        EventManager.randomEvent();
        if(EventManager.randomEvent()== Events.event.balzarBean){
            this.balzarBean();
        }
        else if(EventManager.randomEvent()== Events.event.dragonBall){
            this.addDragonBall();
        }
        else if(EventManager.randomEvent()== Events.event.trainingSession){
            this.trainingSession();
        }
        else if(EventManager.randomEvent()== Events.event.enemyAppear){
            this.enemyAppear();
        }
        
    }
    
    
}
