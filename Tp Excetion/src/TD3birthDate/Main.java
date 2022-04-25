package TD3birthDate;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		DateDDMMYYYY myBirthDate = null;

		while(true){
			System.out.println("Entrez une date sous format JJMMAAAA");
			String date = sc.next(); //inputting the date in String format
			try{
				myBirthDate = new DateDDMMYYYY(date) ;
			}
			catch (Exception e){
				System.out.println(e.getMessage());
			}
			finally
			{
				if(myBirthDate== null){
					myBirthDate = new DateDDMMYYYY();//par defaut sans try catch
					System.out.println("Veuillez recommencer la saisie");
				}else{
					break;
				}
			}
		}

		myBirthDate.affiche();



	}
}
