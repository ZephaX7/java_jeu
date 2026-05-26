import java.util.Scanner;

public class menu{

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean jeuEnCours = true;

       
        System.out.println("=== Bienvenue dans le jeu ===");

        
        while (jeuEnCours) {

            System.out.println("1 - Jouer :");
            System.out.println("2 - Quitter");

            
            String choix = scanner.nextLine();

           
            switch (choix) {

                case "1":
                    System.out.println("Bonne chance !");
                    

                case "2":
                    jeuEnCours = false;
                    break;

                default:
                    System.out.println("Commande inconnue.");
            }
        }

       
        scanner.close();
    }
}