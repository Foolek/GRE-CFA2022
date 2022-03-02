import java.io.*;


public class fichier {
	private BufferedWriter fW;
	private BufferedReader fR;
	private char mode;

	public fichier() throws IOException {
		fW = new BufferedWriter(Writer.nullWriter());
		fR = new BufferedReader(Reader.nullReader());
	}



	/* OUVERTURE DU FLUX */

	// notes concernant la méthode 'ouvrir':
	// *throws IOException est obligatoire pour toutes méthodes
	//      qui manipule des opérations "entrée-sortie", indique aussi que
	//      cette méthode est susceptible de traiter ou propager une erreur
	//      de type IOException qui pourrait apparaitre pendant l'execution;
	//
	// *Paramètre 1 = nom fichier associé au flux
	// *Paramètre 2 = indique le mode d'ouverture (entrant ou sortant et
	//                pourra prendre des valeurs 'E' 'L' (écriture, lecture..)

	public void ouvrir(String nomDuFichier, String s) throws IOException{
		mode = (s.toUpperCase()).charAt(0);
		if(mode == 'R' || mode == 'L'){
			fR = new BufferedReader(new FileReader(new File(nomDuFichier)));
			// si mode == R ou L (read, lecture), l'ouvrture du fichier est réaliser en lecture;
			// new File(nomDuFichier) : permet d'obtenir une représentation logique du fichier (?existe-t-il ou pas ?);
			// FileReader : est un constructeur qui permet l'ouverture du fichier en lecture, caractère par caractère, il fournit en retour l'adresse du début du fichier
			//
			// cependant ce mode de lecture ne n'autorise pas la lecture de plusieurs caractères à la fois, on fait alors appel a:
			// BufferedReader : permet la lecture du fichier ligne par ligne, l'adresse du début du fichier est alors mémorisée, grace au signe d'affectation, dans l'objet fR

		}else if(mode == 'W' || mode == 'E'){
			fW = new BufferedWriter(new FileWriter(new File(nomDuFichier)));
			// si mode == W ou E (write, ecriture), l'ouvrture du fichier est réaliser en écriture;
			// les opérations réalisées sont équivalentes à celle décrites ci dessus en remplacant le mode lecture par écriture
			// * Si le fhicier spécifié en paramètre n'existe pas, et:
			//      -Si le chemin d'acces à ce fichier est valide, alors le fichier est créé, et l'adresse du fichier est sotkcé dans l'objet fW
			//      -Si le chemin d'accès n'est pas valide, le fichier n'est pas créé, et une erreur du type FileNotFoundException est détectée
			// * Si le fichier existe, il est ouvert, et son  contenu est totalement effacé. L'adresse du début du fichier est stocké dans l'objet fW

		}
	}



	/* TRAITEMENT DU FICHIER */

	// Concernant la méthode ecrire:
	// La méthode écrire prend en paramètre la valeur a enregistrer dans le fichier.
	// Comme il s'agit d'un entier et que le fichier est un text, la valeur stockée dans tmp est convertie en String
	// Ensuite, l'écriture de cette chaine dans le fichier est réalisée par fW.write;

	public void ecrire(int tmp) throws IOException{
		String chaine = "";
		chaine = String.valueOf(tmp);
		if(chaine != null){
			fW.write(chaine, 0, chaine.length());
			this.fW.newLine();
		}
	}

	// la lecture dans un fichier est décrite par la méthode:
	public String lire() throws IOException{
		String chaine = fR.readLine();
		// readLine réalise l'opération de lecture qui envoie tout d'abord la ligne lue sur le flux fR
		// puis passe automatiquement à la ligne suivante dans le fichier.
		// la chaine de caractère "chaine" récupère alors la suite des caractères lus.
		// Pour finir, la chaine est retournée à la méthode appellante.
		return chaine;
	}




	/* FERMETURE DU FLUX */

	// Une fois que tous les traitements ont été réalisés, le flux peut etre naturellement fermé grace à la méthode:
	public void fermer() throws IOException{
		if(mode == 'R' || mode == 'L'){
			fR.close();
		}else if(mode == 'W'|| mode == 'E'){
			fW.close();
		}
		//Suivant le mode d'ouverture spéifié par la varialbe d'instance mode (initialisé lors de l'éxecution de la méthode ouvrir() )
		//le flux fR et fW sont fermés grace à la méthode close().
	}


}


