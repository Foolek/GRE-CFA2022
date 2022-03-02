package TD2calculatrice;

import java.util.Scanner;

public class Calculatrice {
	Scanner sc = new Scanner(System.in);
	protected  Boolean encore;
	protected String valeurSaisie;
	protected int entierSaisie;


	public int saisieEntier(){
		System.out.println("Saisissez un entier");
		this.entierSaisie = sc.nextInt();
		return entierSaisie;
	}


	public char saisieOperateur(){
		System.out.println("Saisissez un opérateur '+ , * , - , / ' ");
		encore = true;
		char operateur = 0;

		while(encore){
			valeurSaisie = sc.next();
			operateur = valeurSaisie.charAt(0);
			try{
				if(operateur != '+' && operateur != '-' && operateur != '*' && operateur != '/' ){
					throw new Exception("Erreur dans la saisie de l'opérateur");
				}else{
					encore = false;
				}
			}catch (Exception e){
				System.out.println(e.getMessage());
			}
		}
		return operateur;
	}


	public int calculer( int x,char a, int y){
		int result = 0;
		switch (a){
			case '-':
				result = x-y;
				return result;
			case '+':
				result = x+y;
				return result;
			case '*':
				result = x*y;
				return result;
			case '/':
				result = x/y;
				return result;
			default:
				throw new IllegalStateException("Unexpected value: " + a);
		}
	}


}
