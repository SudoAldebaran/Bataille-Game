package bataille_game;

public class Partie {
    public static void main(String[] args) {
        PaquetCartes paquet = new PaquetCartes();
        paquet.melangerPaquet();

        Joueur joueur1 = new Joueur("Sara");
        Joueur joueur2 = new Joueur("Philippe");

        paquet.distribuerCartes(joueur1, joueur2);

        while (joueur1.nombreDeCartes() > 0 && joueur2.nombreDeCartes() > 0) {
            joueur1.tirerCarte();
            joueur2.tirerCarte();

            // COMPARER LES CARTES DES DEUX JOUEURS
            Bataille.comparer(joueur1, joueur2);

            System.out.println(joueur1);
            System.out.println(joueur2);
            System.out.println("------------------------");
        }

        // DETERMINER LE GAGNANT FINAL
        if (joueur1.getScore() > joueur2.getScore()) {
            System.out.println(joueur1.getNom() + " remporte la partie !");
        } else if (joueur1.getScore() < joueur2.getScore()) {
            System.out.println(joueur2.getNom() + " remporte la partie !");
        } else {
            System.out.println("égalité !");
        }
    }
}
