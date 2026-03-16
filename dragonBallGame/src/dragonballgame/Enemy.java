/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import java.util.Random;

/**
 *
 * @author polenzani.pietro
 */
public class Enemy extends Npc{
    private EnemiesNames name;
    Random random= new Random();

    public Enemy(int hp) {
        super(hp);
        int i= random.nextInt(EnemiesNames.values().length);
        this.name = EnemiesNames.values()[i];
    }
    
}
