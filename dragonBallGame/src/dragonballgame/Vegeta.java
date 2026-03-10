/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author polenzani.pietro
 */
public class Vegeta extends Character{

    public Vegeta(int aura, int att, int stamina, int nBalls, int hp) {
        super(aura, att, stamina, nBalls, hp);
    }


    public  void specialAbility(){
        this.transformation=true;
        att*=5;
        hp/=2;
        int i = stamina/3;
        stamina-=i;
        aura*=2;
    }

}
