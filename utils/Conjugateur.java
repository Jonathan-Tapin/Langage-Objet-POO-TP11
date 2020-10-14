package fr.mds.langageobjet.niv1.poo.utils;

import java.util.List;

public class Conjugateur {

	public static void conjugueAvecSaisi(List<String> verbes) {

		for (String verbe : verbes) {
			String str = verbe;
			str = str.substring(0, str.length() - 2);
			System.out.println("Verbe conjuger :" + verbe);
			System.out.println("Je " + str + "e");
			System.out.println("Tu " + str + "es");
			System.out.println("Il/Elle " + str + "e");
			System.out.println("Nous " + str + "ons");
			System.out.println("Vous " + str + "ez");
			System.out.println("Ils/Elles " + str + "ent");
			System.out.println();
		}

	}

}
