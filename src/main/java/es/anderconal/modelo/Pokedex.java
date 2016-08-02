package es.anderconal.modelo;

import java.util.HashMap;
import java.util.Map;

public class Pokedex {
	private Map<String, String> tipos = new HashMap<String, String>();

	public void setTipos(Map<String, String> tipos) {
		this.tipos = tipos;
	}


	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		for (Map.Entry<String, String> entrada : tipos.entrySet()) {
			sb.append(entrada.getKey() + ": " + entrada.getValue() + "\n");
		}
		return sb.toString();
	}
}
