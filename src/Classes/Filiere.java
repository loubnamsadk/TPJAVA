package Classes;
public class Filiere {
    private String intitule;
    Enseigant responsable;
    Departement Departement;

    public Filiere(String intitule, Enseigant responsable, Departement departement) {
        this.intitule = intitule;
        this.responsable = responsable;
        Departement = departement;

    }

    public Filiere() {
    }

    public String getIntitule() {
        return intitule;
    }

    public Enseigant getResponsable() {
        return responsable;
    }

    public Departement getDepartement() {
        return Departement;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setResponsable(Enseigant responsable) {
        this.responsable = responsable;
    }

    public void setDepartement(Departement departement) {
        Departement = departement;
    }
}
