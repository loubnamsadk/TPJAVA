package Controlleurs;

import Classes.Enseigant;
import Service.Basedonne;

public class Controlleurenseigant {

    public static void AfficherMenu(){

    }
    public static void showEnseigants(){
        for (Enseigant enseigant : Basedonne.enseignants) {
            System.out.print("Id : " + enseigant.getId());
            System.out.print(" | Nom : " + enseigant.getNom() + " " + enseigant.getPrenom());
            System.out.print(" | Email : " + enseigant.getEmail() );

//            if (! Main.isNull(departement.getChef())) {
//                System.out.print(" | Chef : " + departement.getChef().getNom() + " " + departement.getChef().getPrenom());
//            }
            System.out.println("");
        }
    }
    public static void createEnseigant(){

    }
    public static void editEnseigant(){

    }
    public static void destroyEnseigant(){

    }
}