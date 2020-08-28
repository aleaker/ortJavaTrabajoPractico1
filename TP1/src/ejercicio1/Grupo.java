package ejercicio1;
import java.util.ArrayList;
public class Grupo {
	
	private String nombre;
	private ArrayList<String> integrantes;
	
	public Grupo (String nombre) {
		integrantes = new ArrayList<String>();
		setNombre(nombre);
	}

	public String getNombre() {
		return this.nombre;
	}
	
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getCantidadIntegrantes() {
		return this.integrantes.size();
	}
	
	public void agregarIntegrante(String nombreIntegrante) {
		if(this.integrantes.size() == 0) {
			this.integrantes.add(nombreIntegrante);}
		else{
			if(obtenerPosicionIntegrante(nombreIntegrante) == -1) {
				this.integrantes.add(nombreIntegrante);
			}
		}
		System.out.println(nombreIntegrante+" fue asignado al grupo "+this.nombre);
	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		int position = -1;
		int index = 0;
		
		while(position == -1 && index < this.integrantes.size()) {
			if(this.integrantes.get(index).equals(nombreIntegrante)){
				position = index;}
			else {
				index++;
			}
		}
		return position;
	}
	
	public String obtenerIntegrante(int posicion) {
		String integrante = null;
		
		if(posicion <= this.integrantes.size()+1 && posicion >= 1) {
			integrante = this.integrantes.get(posicion-1);}
		return integrante;
	}
	
	public String buscarIntegrante(String nombre) {
		String integrante = null;
		int position;

		position = obtenerPosicionIntegrante(nombre);
		if(position != -1) {
			integrante = this.integrantes.get(position);
		}

		return integrante;
	}
	
	public String removerIntegrante(String nombreIntegrante) {
		String integranteRemovido = buscarIntegrante(nombreIntegrante);
		if(integranteRemovido != null) {
			this.integrantes.remove(integranteRemovido);
		}
		return integranteRemovido;
	}
	
	private void mostrarIntegrantes() {
		System.out.println("Total de integrantes: "+this.integrantes.size());
		if(this.getCantidadIntegrantes() > 0) {
			for (int i = 0; i < this.integrantes.size(); i++) {
				System.out.println(this.integrantes.get(i));
			}
		}
	}
	
	
	public void mostrar() {
		System.out.println("Nombre del grupo: "+this.nombre);
		mostrarIntegrantes();
		
	}
	
	public void vaciar() {
		this.integrantes.clear();
	}
	
}
