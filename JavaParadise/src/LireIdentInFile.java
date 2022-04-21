import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class LireIdentInFile {

	Utilisateur u;

	public LireIdentInFile() {
		u = null;
	}

	public Utilisateur Lire(String keyFromLogin, String mp) {
		/*
		 * avec fichier externe Properties prop = new Properties(); FileInputStream in =
		 * new FileInputStream("utilisateurs"); prop.load(in); Extraction des propriétés
		 * String user = prop.getProperty(id); in.close();
		 */
		ResourceBundle ptFile;
		// gestion exception est ce que le fichier existe?

		try {
			ptFile = ResourceBundle.getBundle("utilisateurs");
		} catch (MissingResourceException e) {
			System.err.println("Erreur Fichier Properties- " + e.getMessage());
			return null;
		}

		try {
			// test si la clé sasie dans le form existe dans le .properties
			ptFile.getString(keyFromLogin);
			String[] result = ptFile.getString(keyFromLogin).split(";");

			// marleyb=Bob;MARLEY;124;marleyb
			if (result[3].equals(mp)) // commela clé correspond à la saisie nous testons le password
			{
				// instanciation et initialisation d'un bean Utilisateur
				u = new Utilisateur();
				u.setPrenom(result[0]);
				u.setNom(result[1]);
				u.setId(result[2]);
				u.setMdp(result[3]);
			}
			return u;
		} catch (Exception e) {
			System.err.println("Erreur key " + e.getMessage());
			return null;
		}
	}

}