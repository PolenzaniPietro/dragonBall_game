/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author polenzani.pietro
 */
public class Npc {
    protected int hp;
    protected int StartHp;
    protected boolean isAlive;

    public Npc(int hp) {
        this.StartHp = hp;
        this.hp=StartHp;
        this.isAlive=true;
    }
    
}
