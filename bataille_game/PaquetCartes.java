package bataille_game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PaquetCartes {
    // LISTE CARTES
    private List<Carte> cartes;

    // CONSTRUCTEUR
    public PaquetCartes() {
        this.cartes = new ArrayList<>();
        this.creerPaquet();
    }

    // CREATION DU PAQUET
    private void creerPaquet() {
        for (String colors : Carte.COLORS){
            for (String values : Carte.VALUES){
                Carte carte = new Carte(colors, values);
                cartes.add(carte);
            }
        }
    }

    // AFFICHER LE PAQUET
    public void afficherPaquet() {
        for (Carte carte : cartes){
            System.out.println(carte);
        }
    }

    // MELANGER LE PAQUET
    public void melangerPaquet() {
        Collections.shuffle(cartes);
    }

    // DISTRIBUER LES CARTES ENTRE LES 2 JOUEURS
    public void distribuerCartes(Joueur joueur1, Joueur joueur2){
        int taillePaquet = cartes.size();

        // DISTRIBUER ALTERNATIVEMENT LES CARTES ENTRE CHAQUE JOUEUR
        for (int i = 0; i < taillePaquet; i++) {
            if (i % 2 == 0) {
                joueur1.ajouterCarte(cartes.get(i));
            } else {
                joueur2.ajouterCarte(cartes.get(i));
            }
        }

        // VIDER LE PAQUET PRINCIPAL
        cartes.clear();
    }

    public int nombreCartes() {
        return cartes.size();
    }
}
