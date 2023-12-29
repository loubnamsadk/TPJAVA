
package Controlleurs;

import Service.Etudiantservice;
import Classes.Etudiant;
import Classes.Filiere;

import java.util.ArrayList;
import java.util.Scanner;

public class ControlleurEtudiant {

    private static Etudiantservice etudiantService = new Etudiantservice();

    public static void AfficherMenu() {
        System.out.println("-------------------------[ Gestion des Étudiants ]---------------------------");
        System.out.println("1: Ajouter un étudiant");
        System.out.println("2: Afficher tous les étudiants");
        System.out.println("3: Modifier un étudiant");
        System.out.println("4: Supprimer un étudiant");
        System.out.println("0: Retourner au menu principal");

        int option = getIntInput("Veuillez sélectionner une option : ");
        switch (option) {
            case 1:
                ajouterEtudiant();
                break;
            case 2:
                afficherTousLesEtudiants();
                break;
            case 3:
                modifierEtudiant();
                break;
            case 4:
                supprimerEtudiant();
                break;
            case 0:
                Main.showPrincipalMenu();
                break;
            default:
                System.out.println("Option non valide. Veuillez sélectionner une option valide.");
                AfficherMenu();
        }
    }

    private static void ajouterEtudiant() {
        String nom = getStringInput("Entrez le nom de l'étudiant : ");
        String prenom = getStringInput("Entrez le prénom de l'étudiant : ");
        String email = getStringInput("Entrez l'email de l'étudiant : ");
        int apogee = getIntInput("Entrez l'apogée de l'étudiant : ");

        // Vous pouvez ajouter la sélection de la filière si nécessaire
        // Filiere filiere = sélectionnerFiliere();

        // Exemple avec une filière prédéfinie
        Filiere filiere = new Filiere("Informatique", null, null);

        Etudiant nouvelEtudiant = new Etudiant(nom, prenom, email, apogee, filiere);

        etudiantService.addEtd(nom, prenom, email, apogee, filiere);

        System.out.println("Étudiant ajouté avec succès !");
        AfficherMenu();
    }

    private static void afficherTousLesEtudiants() {
        ArrayList<Etudiant> etudiants = etudiantService.getAllEtd();

        if (etudiants.isEmpty()) {
            System.out.println("Aucun étudiant n'est disponible.");
        } else {
            System.out.println("Liste des étudiants :");
            for (Etudiant etudiant : etudiants) {
                System.out.println(etudiant);
            }
        }

        AfficherMenu();
    }

    private static void modifierEtudiant() {
        int id = getIntInput("Entrez l'ID de l'étudiant à modifier : ");
        Etudiant etudiantExistant = etudiantService.getEtdById(id);

        if (!etudiantExistant.equals(new Etudiant())) {
            // Les champs que vous souhaitez mettre à jour
            String nouveauNom = getStringInput("Entrez le nouveau nom de l'étudiant : ");
            String nouveauPrenom = getStringInput("Entrez le nouveau prénom de l'étudiant : ");
            String nouvelEmail = getStringInput("Entrez le nouvel email de l'étudiant : ");
            int nouvelApogee = getIntInput("Entrez le nouvel apogée de l'étudiant : ");

            // Modifier l'étudiant
            Filiere filiere = new Filiere("Informatique", null, null); // Exemple avec une filière prédéfinie
            Etudiant etudiantMisAJour = new Etudiant(nouveauNom, nouveauPrenom, nouvelEmail, nouvelApogee, filiere);
            etudiantService.updateEtd(id, nouveauNom, nouveauPrenom, nouvelEmail, nouvelApogee, filiere);

            System.out.println("Étudiant modifié avec succès !");
        } else {
            System.out.println("Aucun étudiant trouvé avec cet ID.");
        }

        AfficherMenu();
    }

    private static void supprimerEtudiant() {
        int id = getIntInput("Entrez l'ID de l'étudiant à supprimer : ");
        ArrayList<Etudiant> etudiantsRestants = etudiantService.deleteEtdById(id);

        if (etudiantsRestants != null) {
            System.out.println("Étudiant supprimé avec succès !");
        } else {
            System.out.println("Aucun étudiant trouvé avec cet ID.");
        }

        AfficherMenu();
    }

    private static int getIntInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        return scan.nextInt();
    }

    private static String getStringInput(String prompt) {
        Scanner scan = new Scanner(System.in);
        System.out.print(prompt);
        return scan.nextLine();
    }
}
