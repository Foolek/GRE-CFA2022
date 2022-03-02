package TP_Comparator.Society.Humans;
import java.util.Objects;

public class Etudiant implements Comparateurs {

    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age){
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }


    /* Getters */
    public String getNom() {return nom;}
    public String getPrenom() {return prenom;}
    public int getAge() {return age;}

    /* Setters */
    private void setNom(String nom) {this.nom = nom;}
    private void setPrenom(String prenom) {this.prenom = prenom;}
    private void setAge(int age) {this.age = age;}




    // Redéfinition de la méthode "toString"
    @Override
    public String toString() {
        return  "Identité de l'étudiant ---> " + this.nom + " " + this.prenom + " " + this.age + " ans";
    }




    public void showEquals(Etudiant o){
        if(this.equals(o)){
            System.out.println(this.getNom() + " " + this.getPrenom() + " et " + o.getNom() + " " + o.getPrenom() + " sont le même étudiant ");
        }else{
            System.out.println(this.getNom() + " " + this.getPrenom() +" et " + o.getNom() + " " + o.getPrenom() + " sont deux étudiants différents");
        }
    }
    /* Méthodes de l'interface "Comparateur" */
    @Override
    public boolean equals(Etudiant o) {
        return getAge() == o.getAge() && Objects.equals(getNom().toLowerCase(), o.getNom().toLowerCase()) && Objects.equals(getPrenom().toLowerCase(), o.getPrenom().toLowerCase());
    }
    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), getAge());
    }

}
