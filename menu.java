package toto;

import java.util.ArrayList;
import java.util.Scanner;

public class menu { 
	public static void main(String[] args) { 
		boolean isRunning = true;
		int choix = 0;
		boolean fin = false;
		Scanner scan = new Scanner(System.in);
		ArrayList<Article> mesArticles = new ArrayList<Article>();
		while(isRunning) {
			System.out.println("choisisez ce que vous voulez commander \n 1 : kebab \n 2 : Tacos \n 3 : Galette");
			int commande = scan.nextInt();
			
			switch (commande) {
			
			case 1:
				Article kebab = new Article("Kebab", 2, 4.5);
				mesArticles.add(kebab);
				break;
				
			case 2:
				Article tacos = new Article("Tacos", 4, 5.5);
				mesArticles.add(tacos);
				break;
				
			case 3: 
				Article galette = new Article("Galette", 1, 3.5);
				mesArticles.add(galette);
				break;
				
			default:
				System.out.println("choisir un produit valide");
				break;
			}
			
			for (int i = 0; i <= mesArticles.size() -1 ; i++) {
				System.out.println(mesArticles.get(i).getLibelle());
				System.out.println(mesArticles.get(i).getQtity());
				System.out.println(mesArticles.get(i).getPrice());
			}
			
			if (fin) {
				System.out.println("fin");
			}
			
		}
		
		
	}

	
	
}
