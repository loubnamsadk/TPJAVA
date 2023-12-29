package Classes;
public class Module {
    private String intitule;
    Enseigant professeur;
    Filiere filiere;

    public Module() {
    }

    public Module(String intitule, Enseigant professeur, Filiere filiere) {
        this.intitule = intitule;
        this.professeur = professeur;
        this.filiere = filiere;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public Enseigant getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Enseigant professeur) {
        this.professeur = professeur;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }

    @Override
    public String toString() {
        return "Module{" +
                "intitule='" + intitule + '\'' +
                ", professeur=" + professeur +
                ", filiere=" + filiere +
                '}';
    }
}
