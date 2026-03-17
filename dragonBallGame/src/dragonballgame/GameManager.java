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

    public GameManager(Player player, Character character) {
        this.player = player;
        this.character = character;
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
}
