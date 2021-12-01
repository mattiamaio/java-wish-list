package org.generation.italy.christmas;

import java.util.List;

public class LetteraBabboNatale {
	private String nome;
	private String indirizzo;
	private List<String> listaDesideri;

	public LetteraBabboNatale(String nome, String indirizzo, List<String> regaliNatale) {
		this.nome = nome;
		this.indirizzo = indirizzo;
		this.listaDesideri = regaliNatale;
	}

	public String invia() throws Exception {
		if (listaDesideri.size() <= 5) {
			return nome + " - " + indirizzo + " - " + listaDesideri;
		} else {
			throw new Exception("Non puoi scrivere più di 5 desideri.");
		}

	}

}
