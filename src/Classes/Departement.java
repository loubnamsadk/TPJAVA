package Classes;

public class Departement{
   long Id;
    private String intitule;
    Enseigant responsable;

    public Departement() {
    }

    public Departement(String intitule, Enseigant responsable) {
        this.intitule = intitule;
        this.responsable = responsable;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Enseigant getResponsable() {
        return responsable;
    }

    public void setResponsable(Enseigant responsable) {
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "intitule='" + intitule + '\'' +
                ", responsable=" + responsable +
                '}';
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }
}
