package es.anderconal.modelo;

public class Pokemon {
	private String nombre;
	private String tipo;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Pokemon [nombre=" + nombre + ", tipo=" + tipo + "]";
	}

}
