package bataille_game;

public class Bataille {

    // METHODE POUR COMPARER LES CARTES DE DEUX JOUEURS
    public static void comparer(Joueur joueur1, Joueur joueur2) {
        // VERIFIER QUE LES JOUEURS ONT DES CARTES SUR LE PLATEAU
        if (joueur1.plateauJoueur.isEmpty() || joueur2.plateauJoueur.isEmpty()) {
            System.out.println("UN DES JOUEURS N'A PAS DE CARTES A COMPARER.");
            return;
        }

        // OBTENIR LES DERNIERES CARTES JOUEES
        Carte carteJoueur1 = joueur1.plateauJoueur.get(joueur1.plateauJoueur.size() - 1);
        Carte carteJoueur2 = joueur2.plateauJoueur.get(joueur2.plateauJoueur.size() - 1);

        // COMPARER LES CARTES
        int puissanceJoueur1 = carteJoueur1.puissance();
        int puissanceJoueur2 = carteJoueur2.puissance();

        // DETERMINER LE GAGNANT
        if (puissanceJoueur1 > puissanceJoueur2) {
            joueur1.score++;
            System.out.println(joueur1.getNom() + " gagne ce tour avec " + carteJoueur1 + " contre " + carteJoueur2);
        } else if (puissanceJoueur1 < puissanceJoueur2) {
            joueur2.score++;
            System.out.println(joueur2.getNom() + " gagne ce tour avec " + carteJoueur2 + " contre " + carteJoueur1);
        } else {
            System.out.println("égalité avec " + carteJoueur1 + " et " + carteJoueur2);
        }
    }
}
