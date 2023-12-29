package Service;

import Classes.Departement;
import Classes.Enseigant;

import java.util.ArrayList;

public class Enseigantservice {

    public static Enseigant addEns(String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseigant();
    }

    public static Enseigant updateEns(int id, String nom, String prenom, String email, String grade, Departement dept){
        return  new Enseigant();
    }
    public static ArrayList<Enseigant> deleteEnsById(int id){
        return  Basedonne.enseignants;
    }

    public static Enseigant getEnsById(int id){
        for (Enseigant enseignant : Basedonne.enseignants) {
            if (enseignant.getId() == id) return  enseignant;
        }
        return  new Enseigant();
    }

    public static ArrayList<Enseigant> getAllEns(){
        return  Basedonne.enseignants;
    }
}