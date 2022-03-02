package TP_Comparator.Society;

import TP_Comparator.Society.Humans.Etudiant;
import java.util.Comparator;

public class CompareEtudiant implements Comparator<Etudiant>{


	@Override
	public int compare(Etudiant o1, Etudiant o2) {
		if (o1.getNom().compareTo(o2.getNom()) != 0) {
			return o1.getNom().compareTo(o2.getNom());
		} else if (o1.getPrenom().compareTo(o2.getPrenom()) != 0) {
			return o1.getPrenom().compareTo(o2.getPrenom());
		} else
			return o1.getAge() - o2.getAge();
	}
}
