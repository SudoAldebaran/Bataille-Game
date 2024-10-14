package bataille_game;

import java.util.ArrayList;
import java.util.List;

public class Joueur {

    // NOM JOUEUR
    private String nom;

    // SCORE JOUEUR
    public int score = 0;

    // PAQUET DE JOUEUR
    public List<Carte> paquetJoueur = new ArrayList<>();

    // PLATEAU DU JOUEUR
    public List<Carte> plateauJoueur = new ArrayList<>();

    // CONSTRUCTEUR
    public Joueur(String n) {
        this.nom = n;
    }

    // TIRER CARTE ET POSER SUR LE PLATEAU
    public Carte tirerCarte() {
        if (paquetJoueur.isEmpty()) {
            return null;
        }
        // RETIRE LA PREMIÈRE CARTE DU PAQUET DU JOUEUR
        Carte carteTiree = paquetJoueur.remove(0);

        // AJOUTER CETTE CARTE AU PLATEAU DU JOUEUR
        plateauJoueur.add(carteTiree);

        // RETOURNER LA CARTE TIREE POUR L'AFFICHER OU LA COMPARER DANS LA PARTIE
        return carteTiree;
    }

    // AJOUTER UNE CARTE AU PAQUET DU JOUEUR
    public void ajouterCarte(Carte carte) {
        paquetJoueur.add(carte);
    }

    // ACCESSEURS
    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public int nombreDeCartes() {
        return paquetJoueur.size();
    }

    // TOSTRING POUR AFFICHER LE JOUEUR
    @Override
    public String toString() {
        return nom + " avec un score de " + score;
    }
}
