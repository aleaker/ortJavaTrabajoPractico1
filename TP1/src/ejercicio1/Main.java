package ejercicio1;

public class Main {

	public static void main(String[] args) {
		Grupo grupo = new Grupo("Los borbotones");
		
		grupo.agregarIntegrante("Alejo Akerfeld");
		grupo.agregarIntegrante("Facundo Lafuente");
		grupo.agregarIntegrante("Mauro Pavesi");
		grupo.agregarIntegrante("Mariano Gualtieri");
		grupo.agregarIntegrante("Barny Gomez");

		fueAgregado(grupo,"Barny Gomez");
		fueAgregado(grupo,"Homero Simpson");
		
		grupo.mostrar();
		
		grupo.removerIntegrante("Barny Gomez");
		grupo.removerIntegrante("Barny Gomez");
	
		grupo.mostrar();
		grupo.vaciar();
		grupo.mostrar();
	
	
	
	
	
	
	
	
	
	}	
	
	public static void fueAgregado(Grupo grupo, String nombre) {
		String answ = " ";
		
		if(grupo.buscarIntegrante(nombre) == null) {
			answ = " no ";}
		
		System.out.println(nombre+answ+"fue agregado");
		}
}
