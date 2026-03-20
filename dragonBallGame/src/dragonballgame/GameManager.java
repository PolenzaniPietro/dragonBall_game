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
    public void setCharacter(Character c){
        this.character = c;
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
        Enemy e = new Enemy(random.nextInt(70, 200));
    }
    public Events.event eventSelection(){
    Events.event ev = EventManager.randomEvent(); 
    if(ev != null){
        switch (ev) {
            case balzarBean:
                this.balzarBean();
                break;
            case dragonBall:
                this.addDragonBall();
                break;
            case trainingSession:
                this.trainingSession();
                break;
            case enemyAppear:
                this.enemyAppear();
                break;
        }
    }
    return ev;
    }
}
