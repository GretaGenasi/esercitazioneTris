package org.italy.generation;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		String [] [] campo = new String [3][3]; //Matrice stringa 3x3
		int r, c, cont, giocatore;
		
		
		//Scorro tutte le righe da 0 a 3 e tutte le colonne da 0 a 3
		for (r = 0; r <= 2; r++) {
			for (c = 0; c <= 2; c++) {
				campo[r][c] = " - ";
			}	
		}
		
		cont = 0;     //Contiamo quante X ci sono nel campo

		giocatore = 1;
		do {
			System.out.println("\n\n\n");  //Per fare spazio 
			for (r = 0; r <= 2; r++) {
				//stampo le 3 righe
				for (c = 0; c <= 2; c++) 
					System.out.print(campo[r][c] + " ");
				//Vado a capo e il ciclo riparte e mi ristampa 3 righe ecc ecc
				System.out.println();
					
			}
			System.out.println("Giocatore: "+giocatore);
			if (giocatore == 1)
				System.out.println("Dove vuoi mettere la X?");
			else
				System.out.println("Dove vuoi mettere lo 0?");
			r = sc.nextInt();
			c = sc.nextInt();
			sc.nextLine();
			
			if (campo[r][c].equals("X")) {  //Confronta la casella campo [r][c] con il valore X
				System.out.println("Casella già occupata");
			}
				else {
					if (giocatore == 1) {
					campo [r][c] = "X";
					giocatore=2;
					}
					else {
						campo [r][c] = "0";
						giocatore=1;
					}
					
					cont++; 
				}
			for (r = 0; r <= 2; r++) {
				for (c = 0; c <= 2; c++) {
					System.out.print(campo[r][c] + " ");
				}
					System.out.println();
			}
			
				System.out.print("Premi invio per continuare");
				sc.nextLine();
				
		if ((campo [0][0] == "X" && campo [0][1] == "X" && campo [0][2] == "X") || (campo [1][0] == "X" && campo [1][1] == "X" && campo [1][2] == "X")
			|| (campo [2][0] == "X" && campo [2][1] == "X" && campo [2][2] == "X")) {
			System.out.println("Giocatore 1 ha vinto");
			break;
		} else if ((campo [0][0] == "0" && campo [0][1] == "0" && campo [0][2] == "0") || (campo [1][0] == "0" && campo [1][1] == "0" && campo [1][2] == "0")
				|| (campo [2][0] == "0" && campo [2][1] == "0" && campo [2][2] == "0")) {
			System.out.println("Giocatore 2 ha vinto");
			break;
		}
			
			
		} while (cont < 9);  //torna indietro se cont<9 quindi non abbiamo ancora occupato tutte le caselle
		
		if (cont >= 9)
		System.out.println("Pareggio");

		
	} //Chiusura main

}
