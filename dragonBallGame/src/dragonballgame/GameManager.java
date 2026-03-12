/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

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
    
    
    public Character balzarBean(){
        character.resetHp();
        character.resetStamina();
        return character;
    }
    public Character trainingSession(){
        character.aura += 15;
        if(character.stamina-20>0){
            character.stamina-=20;
        }
        else {
            character.stamina=0;        
        }            
        return character;
    }
    //da implementare dopo aver finito tutti i metodi dei vari personaggi
    public Character enemyAppear(Enemy e){
        if(e.isAlive==false){
            player.score+=10;
        }
        return character;
    }
}
