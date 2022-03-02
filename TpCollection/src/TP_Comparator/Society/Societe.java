package TP_Comparator.Society;

import TP_Comparator.Society.Humans.Etudiant;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Societe implements IteratorSociety, Comparator<Etudiant>{

    public  ArrayList<Etudiant> listePersonnel = new ArrayList<Etudiant>();

    public Societe(){
        ArrayList<Etudiant> listePersonnel = new ArrayList<Etudiant>();
    }

    /* Getter Setter listePersonnel*/
    public ArrayList<Etudiant> getListePersonnel() {return listePersonnel;}
    public void setListePersonnel(ArrayList<Etudiant> listePersonnel) {this.listePersonnel = listePersonnel;}


    /* Recrutement et Congédiement */
    public void Recruter(Etudiant a){listePersonnel.add(a); System.out.println(a.getNom() + " " + a.getPrenom() + " à rejoint l'entreprise !");}
    public void Congedier(Etudiant a){listePersonnel.remove(a);System.out.println(a.getNom() + " " + a.getPrenom() + " à quitté l'entreprise...");}


    /* Affichage avec Iterator */
    @Override
    public void afficher(ArrayList<Etudiant> a) { // Affiche tous les étudiants d'une liste d'étudiants

        System.out.println("\n");
        // Iterator = objet générique qui "itère" CàD répète plusieurs fois la même acion
        // Iterator va parcourirs un ensemble d'objet de type étudiant Iterator<Etudiant>

        Iterator<Etudiant> it = listePersonnel.iterator();
        // it = va parcrourir l'arraylist "listePersonnel" qui est un arraylist de type étudiant

        // Si nous parcourions un tableau de type int alors l'opération aurait été écrite de cette façon:
        // Iterator<Integer> it = tableauInt.iterator();

        while ((it.hasNext())) {
            Etudiant test = it.next();
            System.out.println(test);
        }
    }

    @Override
    public int compare(Etudiant o1, Etudiant o2) {

        return 0;
    }
}