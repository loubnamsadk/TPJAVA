package Service;

import Classes.Etudiant;
import Classes.Filiere;

import java.util.ArrayList;

public class Etudiantservice {

    public static Etudiant addEtd(String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }

    public static Etudiant updateEtd(int id,String nom, String prenom, String email, int apogee, Filiere filiere){
        return  new Etudiant();
    }
    public static ArrayList<Etudiant> deleteEtdById(int id){
        return  Basedonne.etudiants;
    }

    public static Etudiant getEtdById(int id){
        return  new Etudiant();
    }

    public static ArrayList<Etudiant> getAllEtd(){
        return  Basedonne.etudiants;
    }
}