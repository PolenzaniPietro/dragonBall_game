/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author polenzani.pietro
 */
public class GameSaver {
    private Character c;
    private Player p; 
    
public GameSaver(Character c, Player p) {
    this.c = c;
    this.p = p;
}

public void saveCSV() {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("salvataggio.csv"))) {
        StringBuilder line = new StringBuilder();
        line.append(p.getName()).append(",");
        line.append(c.getHp()).append(",");
        line.append(c.getAura()).append(",");
        line.append(c.getAtt()).append(",");
        line.append(c.getStamina()).append(",");
        line.append(c.getBalls()).append(",");
        line.append(c.getImagePath()).append(",");
        line.append(c.getSpecialImagePath());
        writer.write(line.toString());
        writer.newLine();

    } catch (IOException e) {

    }
}
    

    public void saveBinary(){
        
    }
}
