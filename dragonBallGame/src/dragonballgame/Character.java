/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author pietr
 */
public abstract class Character {
    private int aura;
    private int att;
    private int stamina;
    private boolean transformation;
    
    public abstract void attack();
    public abstract void specialAttack();
    public abstract void specialAbility();
    public abstract void auraCharge();           
}
