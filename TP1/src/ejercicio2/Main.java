package ejercicio2;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
	
		
		Atleta atleta1 = new Atleta("Antonio", 9.81);
		Atleta atleta2 = new Atleta("Bruno", 9.85);
		Atleta atleta3 = new Atleta("Carlos", 9.86);
		Atleta atleta4 = new Atleta("Daniel", 10.01);
		Atleta atleta5 = new Atleta("Esteban", 9.97);
		Atleta atleta11 = new Atleta("Mariana", 10.01);
		Atleta atleta12 = new Atleta("Luis", 9.80);
		Atleta atleta13 = new Atleta("Cesar", 9.97);
		Atleta atleta14 = new Atleta("Marisa", 10.01);
		Atleta atleta15 = new Atleta("Silvia", 9.80); 
		
		Carrera carrera = new Carrera();
		carrera.agregarAtleta(atleta1);
		carrera.agregarAtleta(atleta2);
		carrera.agregarAtleta(atleta3);
		carrera.agregarAtleta(atleta4);
		carrera.agregarAtleta(atleta5);
		carrera.agregarAtleta(atleta11);
		carrera.agregarAtleta(atleta12);
		carrera.agregarAtleta(atleta13);
		carrera.agregarAtleta(atleta14);
		carrera.agregarAtleta(atleta15);
		
		
		carrera.getGanadores();
		
	
	}
	
	

}
