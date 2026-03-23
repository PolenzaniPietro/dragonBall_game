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
     private Player player;
     public Character character;
     private Enemy currentEnemy = null;
     private int killedEnemies = 0;

    public GameManager() {
    }
    public void setCharacter(Character c){
        this.character = c;
    }
     public int addDragonBall(){ 
        if(character.nBalls+1<8){
        return character.nBalls++; 
         }
        return 7;
    }
    
     public Enemy getCurrentEnemy()
     {
         return currentEnemy;
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
        currentEnemy = new Enemy(random.nextInt(70, 200));
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
