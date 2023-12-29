package Service;

import Classes.Enseigant;
import Classes.Filiere;
import Classes.Module;

import java.util.ArrayList;

public class Moduleservice {

    public static Module addFiliere(String intitule, Enseigant chef,  Filiere filiere) {
        return  new Module();
    }

    public static Module updateFiliere(int id , String intitule, Enseigant chef,  Filiere filiere){
        return  new Module();
    }
    public static ArrayList<Module> deleteModuleById(int id){
        return  Basedonne.modules;
    }

    public static Module getModuleById(int id){
        return  new Module();
    }

    public static ArrayList<Module> getAllModule(){
        return  Basedonne.modules;
    }
}