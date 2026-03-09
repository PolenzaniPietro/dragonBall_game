/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author pietr
 */
public abstract class Character extends Npc{
    protected int aura;
    protected int att;
    protected int stamina;
    protected boolean transformation;
    protected int nBalls;

    public Character(int aura, int att, int stamina, int hp) {
        super(hp);
        this.aura = aura;
        this.att = att;
        this.stamina = stamina;
        this.transformation = false;
    }

    public abstract void attack();
    public abstract void specialAttack();
    public abstract void specialAbility();
    public abstract void auraCharge();           
}
