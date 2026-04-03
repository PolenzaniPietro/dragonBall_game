/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author pietr
 */
public abstract class Character extends Npc {

    protected int aura;
    protected int att;
    protected int stamina;
    protected int startStamina;
    protected boolean transformation;
    protected int nBalls;
    protected String imagePath;
    protected String specialImagePath;

    public Character(int aura, int att, int stamina, int nBalls, int hp, String ip, String sip) {
        super(hp);
        this.aura = aura;
        this.att = att;
        this.startStamina = stamina;
        this.stamina = startStamina;
        this.nBalls = nBalls;
        this.transformation = false;
        this.imagePath = ip;
        this.specialImagePath = sip;
    }

    public String getImagePath() {
        return imagePath;
    }

    public String getSpecialImagePath() {
        return specialImagePath;
    }

    public int getAura() {
        return aura;
    }

    public int getBalls() {
        return nBalls;
    }

    public int getAtt() {
        return att;
    }

    public int getStamina() {
        return stamina;
    }

    public int resetStamina() {
        this.stamina = startStamina;
        return stamina;
    }

    public int resetHp() {
        this.hp = this.StartHp + 10;
        return hp;
    }

    public void attack(Enemy e) {

        if (!transformation) {
            if (stamina < 15) {
                e.damage(5);
            } else {
                e.damage(20);
            }
            this.stamina -= 10;
            this.hp -= 20;
        } else {
            e.damage(att / 2);
            this.stamina -= 10;
            this.hp -= 15;
        }

        if (stamina < 0) {
            stamina = 0;
        }
        if (hp < 0) {
            hp = 0;
        }
    }

    public void specialAttack(Enemy e) {
        e.isAlive = false;
        if (stamina - 50 > 0) {
            this.stamina -= 50;
        } else {
            stamina = 0;
        }
        this.transformation = false;

    }

    public abstract void specialAbility();

    public void auraCharge() {
        if (aura - 15 < 10) {
            aura += aura - 15;
        } else {
            aura += 40;
        }
    }

    public Character balzarBean() {
        this.resetHp();
        this.resetStamina();
        return this;
    }

    public Character trainingSession() {
        this.aura += 15;
        if (this.stamina - 15 > 0) {
            this.stamina -= 15;
        } else {
            this.stamina = 0;
        }
        return this;
    }
}
