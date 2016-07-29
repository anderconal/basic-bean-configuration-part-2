package es.anderconal.modelo;

import java.util.List;

public class Pokedex {
	private Pokemon masPoderoso;
	private List<Pokemon> pokemon;
	
	public Pokemon getMasPoderoso() {
		return masPoderoso;
	}
	public void setMasPoderoso(Pokemon masPoderoso) {
		this.masPoderoso = masPoderoso;
	}
	public List<Pokemon> getPokemon() {
		return pokemon;
	}
	public void setPokemon(List<Pokemon> pokemon) {
		this.pokemon = pokemon;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("El Pokémon más poderoso es: " + masPoderoso + "\n");
		sb.append("Otros Pokémon: \n");
		
		for (Pokemon pokemon : pokemon) {
			sb.append(pokemon);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
