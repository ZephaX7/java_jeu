package jeu;

import java.util.Random;
import java.util.Scanner;

public class jeu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        listemot liste = new listemot();
        Random random = new Random();

        String motAleatoire = liste.motus.get(random.nextInt(liste.motus.size()));
        System.out.println("Le mot mystere a ete choisi : ");
        System.out.println("La premiere lettre est : " + motAleatoire.charAt(0));
        

        boolean motTrouve = false;
        int tentatives = 6;

        while (!motTrouve && tentatives > 0) { 
            System.out.print("Votre proposition : ");
            String choix = sc.nextLine();

            if (choix.equals(motAleatoire)) {
                System.out.println("Bravo, vous avez trouve !");
                motTrouve = true;
                break;

            } else {
    tentatives--;
    System.out.println("Mauvaise reponse. Tentatives restantes : " + tentatives);

    if (tentatives == 3) {
        System.out.println("Voici la liste des mots possibles :");
        for (String mot : liste.motus) {
            System.out.println("- " + mot);
        }
    }
}
        }

        if (!motTrouve) {
            System.out.println("Perdu ! Le mot etait : " + motAleatoire);
        }
        sc.close();
    }
}
