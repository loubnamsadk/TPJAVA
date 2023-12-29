package Classes;

public class Enseigant {

    String nom;
    int ID;
    private String prenom;
    private String email;
    private String grade;

    public Enseigant() {

    }

    public Enseigant(String nom, String prenom, String email, String grade) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
    }

    public Enseigant(long id, String nom, String prenom, String email, String grade, Classes.Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;
    }

    public Enseigant(String nom, String prenom, String email, String grade, Departement departement) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.grade = grade;

    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enseigant{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }

    public int getId() {
        int id = 0;
        return id;
    }

    public void setId(int Id) {
        this.ID= Id;
    }
}