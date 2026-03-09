/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author polenzani.pietro
 */
public class Enemy extends Npc{
    private int name;

    public Enemy(int name, int hp) {
        super(hp);
        this.name = name;
    }
    
}
