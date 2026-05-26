package menu;

import java.util.Scanner;
import jeu.jeu;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuer = true;

        while (continuer) {

        System.out.println("Bienvenue dans le menu du jeu !");

        System.out.println(" ");
        System.out.println("1. Jouer");
        System.out.println("2. Regles du jeu");
        System.out.println("3. Quitter");
        System.out.println(" ");

        System.out.println("Veillez saisir quelque chose :");
        System.out.println(" ");
        String reponse = sc.nextLine();

            switch (reponse) {
                case "1":
                    System.out.println("Bon jeu !");
                    System.out.println(" ");
                    jeu.main(null);
                    break;

                case "2":
                    System.out.println("Voici les regles du jeu :");
                    System.out.println("Le but du jeu est de trouver le mot mystere en devinant les lettres");
                    System.out.println(" ");
                    break;

                case "3":
                    System.out.println("Au revoir !");
                    System.out.println(" ");
                    continuer = false;
                    break;

                default:
                    System.out.println("Option invalide, veuillez reessayer.");
                    System.out.println(" ");
            }
        }
        sc.close();
    }
}