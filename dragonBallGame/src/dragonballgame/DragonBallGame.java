/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dragonballgame;

/**
 *
 * @author pietr
 */
public class DragonBallGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CharacterSelection characterSelection = new CharacterSelection();
        characterSelection.setVisible(true);
        GameInteface form = new GameInteface();
        form.setVisible(false);
    }
    
}
