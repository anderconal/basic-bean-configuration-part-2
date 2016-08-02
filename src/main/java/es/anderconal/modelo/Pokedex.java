package es.anderconal.modelo;

import java.util.HashMap;
import java.util.Map;

public class Pokedex {
	private Map<String, String> tipos = new HashMap<String, String>();
	private Map<String, Pokemon> pokemon = new HashMap<String, Pokemon>();

	public void setTipos(Map<String, String> tipos) {
		this.tipos = tipos;
	}
	
	public void setPokemon(Map<String, Pokemon> pokemon) {
		this.pokemon = pokemon;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<String, String> entrada : tipos.entrySet()) {
			sb.append(entrada.getKey() + ": " + entrada.getValue() + "\n");
		}
		
		sb.append("\n");
		
		for (Map.Entry<String, Pokemon> entrada : pokemon.entrySet()) {
			sb.append(entrada.getKey() + ": " + entrada.getValue());
		}
		
		return sb.toString();
	}
}
