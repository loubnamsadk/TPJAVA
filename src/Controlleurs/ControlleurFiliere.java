package Controlleurs;
import Classes.Filiere;
import Service.Basedonne;
public class ControlleurFiliere {
    public static void AfficherMenu() {
        System.out.println("------------------[ Gestion des Filieres ]------------------");
        System.out.println("1: Ajouter une filiere");
        System.out.println("2: Afficher la liste des filieres");
        System.out.println("3: Rechercher une filiere");
        System.out.println("0: Retour au menu principal");

        int option = Main.getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                ajouterFiliere();
                break;
            case 2:
                afficherListeFilieres();
                break;
            case 3:
                rechercherFiliere();
                break;
            case 0:
                Main.showPrincipalMenu();
                break;
            default:
                System.out.println("Option invalide. Veuillez réessayer.");
                AfficherMenu();
        }
    }

    private static void ajouterFiliere() {
        Filiere filiere = new Filiere();

        Basedonne.filieres.add(filiere);

        System.out.println("Filière ajoutée avec succès !");
        AfficherMenu();
    }

    private static void afficherListeFilieres() {
        System.out.println("------------------[ Liste des Filieres ]------------------");
        AfficherMenu();
    }

    private static void rechercherFiliere() {
        String codeRecherche = Main.getStringInput("Entrez le code de la filière à rechercher : ");
        AfficherMenu();
    }
}
