/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author pietr
 */
public class Goku extends Character{

    public Goku(int aura, int att, int stamina, int nBalls, int hp) {
        super(aura, att, stamina, nBalls, hp);
    }

    
    

    public  void specialAbility(){
        this.transformation=true;
    }

}
