package Service;

import java.util.ArrayList;
import java.util.List;
import Classes.Departement;

public class Departementservice {
    private List<Departement> departements;

    public Departementservice() {
        this.departements = new ArrayList<>();
    }

    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    public void mettreAJourDepartement(Departement departementMisAJour) {
        for (int i = 0; i < departements.size(); i++) {
            Departement departementCourant = departements.get(i);
            if (departementCourant.getId() == departementMisAJour.getId()) {
                departements.set(i, departementMisAJour);
                break;
            }
        }
    }

    public void supprimerDepartement(long idDepartement) {
        departements.removeIf(departement -> departement.getId() == idDepartement);
    }

    public List<Departement> obtenirTousLesDepartements() {
        return departements;
    }

    // Ajout de nouvelles méthodes
    public Departement obtenirDepartementParId(long idDepartement) {
        for (Departement departement : departements) {
            if (departement.getId() == idDepartement) {
                return departement;
            }
        }
        return null;
    }

    // Ajoutez d'autres méthodes selon vos besoins
}
