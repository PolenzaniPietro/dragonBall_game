/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author polenzani.pietro
 */
public class Gohan extends Character{

    public Gohan(int aura, int att, int stamina, int nBalls, int hp) {
        super(aura, att, stamina, nBalls, hp);
    }
    
    @Override
    public  void specialAbility(){
        this.transformation=true;
        this.att=att*5;
        aura*=2;
    }

}
