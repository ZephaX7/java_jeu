package jeu;

import listemot.listemot;
import java.util.Random;
import java.util.Scanner;

public class jeu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        listemot liste = new listemot();
        Random random = new Random();

        String motAleatoire = liste.motus.get(random.nextInt(liste.motus.size()));
        System.out.println("Mot choisi : " + motAleatoire);

        boolean motTrouve = false;
        int tentatives = 6;

        while (!motTrouve && tentatives > 0) {
            System.out.print("Votre proposition : ");
            String choix = sc.nextLine();

            if (choix.equals(motAleatoire)) {
                System.out.println("Bravo, vous avez trouvé !");
                motTrouve = true;
            } else {
                tentatives--;
                System.out.println("Mauvaise réponse. Tentatives restantes : " + tentatives);
            }
        }

        if (!motTrouve) {
            System.out.println("Perdu ! Le mot était : " + motAleatoire);
        }

        sc.close();
    }
}
