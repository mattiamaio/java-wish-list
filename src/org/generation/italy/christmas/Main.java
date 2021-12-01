package org.generation.italy.christmas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		ArrayList<String> regaliNatale = new ArrayList<String>();

		boolean avanza = true;

		do {
			System.out.print("Aggiungi elemento alla lista dei desideri: ");
			regaliNatale.add(scan.nextLine());
			System.out.println("La tua lista contiene " + regaliNatale.size() 
			+ " elemento/i");

			System.out.print("Continuare? (s/n): ");
			String scelta = scan.nextLine();
			if (scelta.equalsIgnoreCase("n")) {
				avanza = false;
			} else if (scelta.equalsIgnoreCase("s")) {
				avanza = true;
			}
		} while (avanza);
		System.out.println("Ecco la tua lista:");
		for (int i = 0; i < regaliNatale.size(); i++) {
			System.out.println(regaliNatale.get(i));
		}

		scan.close();

	}

}
