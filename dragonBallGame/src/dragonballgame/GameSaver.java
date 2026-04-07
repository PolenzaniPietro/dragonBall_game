/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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

    public Character getCharacter() {
        return c;
    }

    public Player getPlayer() {
        return p;
    }
    
    public void saveCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salvataggio.csv"))) {

            writer.write(
                    p.getName() + ","
                    + c.getClass().getSimpleName() + ","
                    + c.getHp() + ","
                    + c.getAura() + ","
                    + c.getAtt() + ","
                    + c.getStamina() + ","
                    + c.getBalls() + ","
                    + c.getImagePath() + ","
                    + c.getSpecialImagePath()
            );

            writer.newLine();

        } catch (IOException e) {

        }
    }

    public void loadCSV() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("salvataggio.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] stats = line.split(",");
                String type = stats[2];
                if (type.equals("Goku")) {
                    c = new Goku(c.getAura(), c.getAtt(), c.getStamina(), c.getBalls(), c.getHp(), c.getImagePath(), c.getSpecialImagePath());
                } else if (type.equals("Gohan")) {
                    c = new Gohan(c.getAura(), c.getAtt(), c.getStamina(), c.getBalls(), c.getHp(), c.getImagePath(), c.getSpecialImagePath());
                } else if (type.equals("Vegeta")) {
                    c = new Vegeta(c.getAura(), c.getAtt(), c.getStamina(), c.getBalls(), c.getHp(), c.getImagePath(), c.getSpecialImagePath());
                }
                c.setHp(Integer.parseInt(stats[3]));
                c.setAura(Integer.parseInt(stats[4]));
                c.setAtt(Integer.parseInt(stats[5]));
                c.setStamina(Integer.parseInt(stats[6]));
                c.setnBalls(Integer.parseInt(stats[7]));
                c.setImagePath(stats[8]);
                c.setSpecialImagePath(stats[9]);
            }

            reader.close();

        } catch (IOException e) {

        }
    }

    public void saveBinary() {
        try {
            ObjectOutputStream saver = new ObjectOutputStream(new FileOutputStream("salvataggio.dat"));

            saver.writeObject(p);
            saver.writeObject(c);
            saver.close();
            System.out.println("Salvataggio binario completato!");

        } catch (IOException e) {
        }
    }

    public void loadBinary() {
        try {
            ObjectInputStream loader = new ObjectInputStream(new FileInputStream("salvataggio.dat"));

            p = (Player) loader.readObject();
            c = (Character) loader.readObject();

            loader.close();

        } catch (IOException | ClassNotFoundException e) {
        }
    }

}
