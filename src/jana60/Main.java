package jana60;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*
		 * Creare una classe Main con metodo main in cui implementare il seguente
		 * programma: Creare una lista dei desideri vuota e chiedere all’utente di
		 * aggiungere i suoi desideri uno alla volta, fino a che sceglie di fermarsi.
		 * Ogni volta che viene aggiunto un desiderio stampare a video quanti desideri
		 * sono contenuti nella lista in quel momento. Al termine dell’inserimento
		 * stampare a video la lista ordinata. …poi, visto che siamo buoni ma non
		 * buonissimi, possiamo anche mettere un limite a quanti desideri può inserire
		 * una persona
		 */

		// Effettuato dalla sezione 3

		Scanner scan = new Scanner(System.in);

		ArrayList<String> listaDesideri = new ArrayList<String>();

		System.out.println("Benvenuto nella lista dei tuoi desideri, hai un massimo di tre desideri");

		boolean flag = true;
		boolean flag2 = true;
		do {
			String scelta;
			do {
				System.out.println("cosa vuoi fare? Inserisci 1 per inserire un nuovo desiderio, 2 per uscire");
				scelta = scan.nextLine();
				if (scelta.equalsIgnoreCase("1") || scelta.equalsIgnoreCase("2")) {
					flag2 = false;
				}
			} while (flag2);
			switch (scelta) {
			case "1":
				if (listaDesideri.size() < 3) {
					System.out.println("Inserisci il tuo desiderio: ");
					listaDesideri.add(scan.nextLine());
					System.out.println("Hai espresso " + listaDesideri.size() + " desideri");
					System.out.println("Ecco la tua lista desideri finora: ");
					System.out.println(listaDesideri);
				} else {
					System.out.println("Hai già espresso tutti i tuoi desideri");
					flag = false;
				}
				break;

			case "2":
				flag = false;
				break;
			}

		} while (flag);
		Collections.sort(listaDesideri);
		System.out.println("Ecco la tua lista ordinata: ");
		System.out.println(listaDesideri);

		scan.close();
	}

}
