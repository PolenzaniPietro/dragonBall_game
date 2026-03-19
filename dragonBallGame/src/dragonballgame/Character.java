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
    protected int startStamina;
    protected boolean transformation;
    protected int nBalls;
    

    public Character(int aura, int att, int stamina,int nBalls, int hp) {
        super(hp);
        this.aura = aura;
        this.att = att;
        this.startStamina = stamina;
        this.stamina=startStamina;
        this.nBalls = nBalls;
        this.transformation=false;
    }
    
    public int getAura() {
        return aura;
    }
    public int getAtt() {
        return att;
    }
    public int getStamina() {
        return stamina;
    }

    public int resetStamina(){
        this.stamina=startStamina;
        return stamina;
    }
    public int resetHp(){
        this.hp= this.StartHp;
        return hp;
    }

    public void attack(Enemy e){
        if(e.hp-20 > 0){
            e.damage(20);
        }
        else{
            e.isAlive=false;
        }
        this.stamina-=10;
    }
    
    public void specialAttack(Enemy e){
        e.isAlive=false;
        if(stamina-50>0){
            this.stamina-=50;
        }
        else {
            stamina = 0;
       }
        this.transformation=false;
    }
    public abstract void specialAbility();
    public  void auraCharge(){
        if(aura-20<10){
            aura+= aura-20;
        }
        else aura+=40;
    }
    public Character balzarBean(){
        this.resetHp();
        this.resetStamina();
        return this;
    }
    public Character trainingSession(){
        this.aura += 15;
        if(this.stamina-20>0){
            this.stamina-=20;
        }
        else {
            this.stamina=0;        
        }            
        return this;
    }

    

    
    
}
