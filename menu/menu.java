import java.util.Scanner;

public class menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenue dans le menu du jeu !");

        System.out.println(" ");
        System.out.println("1. Jouer");
        System.out.println("2. Quitter");
        System.out.println(" ");

        System.out.println("Veillez saisir quelque chose :");
        System.out.println(" ");
        String reponse = sc.nextLine();
        
        switch (reponse) {
            case "1":
                System.out.println("Bon jeu !");
                break;

            case "2":
                System.out.println("Au revoir !");
                break;
        }
    }
}