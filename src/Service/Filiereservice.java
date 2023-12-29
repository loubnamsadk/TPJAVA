package Service;

import Classes.Departement;
import Classes.Enseigant;
import Classes.Filiere;

import java.util.ArrayList;

public class Filiereservice {

    public static Filiere addFiliere(String intitule, Enseigant chef, Departement dept) {
        return  new Filiere();
    }

    public static Filiere updateFiliere(int id , String intitule, Enseigant chef, Departement dept){
        return  new Filiere();
    }
    public static ArrayList<Filiere> deleteFiliereById(int id){
        return  Basedonne.filieres;
    }

    public static Filiere getFiliereById(int id){
        return  new Filiere();
    }

    public static ArrayList<Filiere> getAllFiliere(){
        return  Basedonne.filieres;
    }
}
