package bataille_game;

import java.util.Arrays;

public class Carte {

    // LISTE DES COULEURS
    public static String[] COLORS = {"Coeur", "Trèfle", "Pic", "Carreau"};
    // LISTE DES VALEURS
    public static String[] VALUES = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Valet", "Dame", "Roi", "As"};

    // COULEUR
    private String color;
    // VALEUR
    private String value;

    // CONCTRCUTEUR
    public Carte(String c, String v) {
        this.color = c;
        this.value = v;
    }

    // TO STRING
    public String toString(){
        return this.value + " de " + this.color;
    }

    // PUISSANCE CARTE
    public int puissance(){
        int power = Arrays.asList(VALUES).indexOf(this.value);
        return power;
    }

}
