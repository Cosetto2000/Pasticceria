package Pasticceria;

import java.util.*;

public class Pasticceria {
	Torta cioccolato = new Torta("Cioccolato", 20);
	Torta panna = new Torta("Panna", 15);
	Torta miele = new Torta("Miele", 10);
	Torta ciliege = new Torta("Ciliege", 15);
	Torta mele = new Torta("Mele", 20);
	
	public void stampaTorta() {
		System.out.println(cioccolato.gusto + " " + cioccolato.prezzo);
	}
		
	}