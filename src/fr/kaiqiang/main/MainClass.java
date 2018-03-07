package fr.kaiqiang.main;

import java.util.Scanner;

import fr.kaiqiang.util.Bordure;
import fr.kaiqiang.util.Drawer;
import fr.kaiqiang.util.DrawerSlow;

public class MainClass {
	
	public static void main(String[] args) {
		int h = 0; int l = 0; int b = 0;
		
		Scanner scan = new Scanner(System.in);
		DrawerSlow ds = new DrawerSlow();
		Drawer d = new Drawer();
		
		System.out.println("Rentrez la hauteur");
		h = scan.nextInt();
		System.out.println("Vous avez saisi " + h + " pour la hauteur");
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println("Rentrez la largeur");
		l = scan.nextInt();
		System.out.println("Vous avez saisi " + l + " pour la largeur");
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Mode Animé 0 pour Oui ou 1 pour Non");
		int m = sc.nextInt();
		
		System.out.println("Mode : " + m);
		
		if (m == 0) {
//		d.setSymbol("0 ");
			ds.rect(h, l);
		
		}
		else {
			if (m == 1) {
				d.rect(h, l);
			
			}
		
			else { 
				System.out.println("Veuillez rentrez 0 pour OUI ou 1 pour NON");
			}
		}
		
		System.out.println("Mode Bordure 0 pour OUI et 1 pour NON");
		b = sc.nextInt();
		System.out.println("Mode Bordure : " + b);
		
		if (b ==0 ) {
			Bordure bo = new Bordure();
			bo.bord(0, 0, 0, 0, h, l);
			
		}
		else {
			System.out.println("Fin du Programme");
		}
	}
}