/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dragonballgame;

import java.io.*;

public class GameSaver {

    private static Character c;
    private static Player p;

    public static void setData(Character character, Player player) {
        c = character;
        p = player;
    }

    public static Character getCharacter() {
        return c;
    }

    public static Player getPlayer() {
        return p;
    }

    public static void saveCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("salvataggio.csv", true))) {
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

    public static void loadCSV() {
    try {
        BufferedReader reader = new BufferedReader(new FileReader("salvataggio.csv"));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] stats = line.split(",");
            p = new Player();
            p.setName(stats[0]);
            if(stats[0]==null){
                p.setName("PLAYER 1");
            }
            String type = stats[1]; 
            if (type.equals("Goku")) {
                c = new Goku(Integer.parseInt(stats[2]), Integer.parseInt(stats[3]), Integer.parseInt(stats[4]), Integer.parseInt(stats[5]), Integer.parseInt(stats[6]),stats[7],stats[8]  );
            } else if (type.equals("Gohan")) {
                c = new Gohan(Integer.parseInt(stats[2]), Integer.parseInt(stats[3]), Integer.parseInt(stats[4]), Integer.parseInt(stats[5]), Integer.parseInt(stats[6]),stats[7],stats[8]  );
            } else if (type.equals("Vegeta")) {
                c = new Vegeta(Integer.parseInt(stats[2]), Integer.parseInt(stats[3]), Integer.parseInt(stats[4]), Integer.parseInt(stats[5]), Integer.parseInt(stats[6]),stats[7],stats[8]  );
            }
        }
        reader.close();
    } catch (IOException e) {
        e.printStackTrace(); 
        }
    }
    public static void saveBinary() {
        try {
            ObjectOutputStream saver = new ObjectOutputStream(new FileOutputStream("salvataggio.dat"));
            saver.writeObject(p);
            saver.writeObject(c);
            saver.close();
        } catch (IOException e) {
        }
    }

    public static void loadBinary() {
    try {
        ObjectInputStream loader = new ObjectInputStream(new FileInputStream("salvataggio.dat"));

        p = (Player) loader.readObject();
        c = (Character) loader.readObject();

        loader.close();

    } catch (IOException | ClassNotFoundException e) {
        p = null;
        c = null;
    }
    if (p == null || p.getName() == null || p.getName().isEmpty()) {
        p = new Player();
        p.setName("PLAYER 1");
    }
    if (c == null) {
        c = new Goku(50, 10, 50, 0, 100, "images/goku.png", "images/goku_special.png");
    } else {
        if (c.getImagePath() == null || c.getImagePath().isEmpty()) {
            c.setImagePath("images/goku.png");
        }
        if (c.getSpecialImagePath() == null || c.getSpecialImagePath().isEmpty()) {
            c.setSpecialImagePath("images/goku_special.png");
        }
    }
}
}
