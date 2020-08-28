package ejercicio2;

public class Atleta {
	private String nombre;
	private double tiempo;

	
	public Atleta (String nombre,double tiempo) {
		this.nombre = nombre;
		this.tiempo = tiempo;
	}
	
	public double getTiempo() {
		return this.tiempo;
	}

	public String getNombre() {
		return this.nombre;
	}
}
