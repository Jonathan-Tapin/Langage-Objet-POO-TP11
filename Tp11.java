package fr.mds.langageobjet.niv1.poo;

import fr.mds.langageobjet.niv1.poo.utils.Conjugateur;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tp11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		List<String> listeVerbesenDur = new ArrayList<>();
		listeVerbesenDur.add("manger");
		listeVerbesenDur.add("vibrer");
		Conjugateur.conjugueAvecSaisi(listeVerbesenDur);
		
		System.out.println();
		
		List<String> listeVerbesSaisi = new ArrayList<>();
		System.out.println("Saisir un verbe  du premier groupe non irrégulierà conjuguer :");
		listeVerbesSaisi.add(sc.nextLine());
		System.out.println("Saisir un autre verbe du premier groupe non irrégulier à conjuguer :");
		listeVerbesSaisi.add(sc.nextLine());
		
		
		
		Conjugateur.conjugueAvecSaisi(listeVerbesSaisi);
		
		
		sc.close();
	}

}
