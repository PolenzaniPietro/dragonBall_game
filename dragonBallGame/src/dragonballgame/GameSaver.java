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
            reader.readLine();
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
        }
    }
}
