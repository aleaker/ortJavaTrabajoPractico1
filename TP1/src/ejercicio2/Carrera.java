package ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;   
public class Carrera {
	public ArrayList<Atleta> listaAtletas;
	
	public Carrera(){
		this.listaAtletas = new ArrayList<Atleta>();
	}
	
	public void agregarAtleta(Atleta atleta) {
		this.listaAtletas.add(atleta);
	}
	
	public List<Double> getTiempos() {
		double tiempoAux;
		List<Double> listaTiempos = new ArrayList<Double>(); //https://sayemdb.wordpress.com/2011/05/17/an-intro-to-design-pattern-2/
		
		
		for (int i = 0; i < listaAtletas.size(); i++) {
			tiempoAux = listaAtletas.get(i).getTiempo();
			listaTiempos.add(tiempoAux);
			}
		Collections.sort(listaTiempos);
		listaTiempos = listaTiempos.stream().distinct().collect(Collectors.toList());
	
		return listaTiempos;
	}
	
	public ArrayList<Atleta> getAtletasPorTiempo(double tiempo) {
		ArrayList<Atleta> ganadores =  new ArrayList<Atleta>();
		Atleta atletaAux;
		
		for (int i = 0; i < listaAtletas.size(); i++) {
			atletaAux = listaAtletas.get(i);
			if(atletaAux.getTiempo() == tiempo) {
				ganadores.add(atletaAux);
			}
		}
		return ganadores;
	}
	
	public void getGanadores(){
		ArrayList<Atleta> podio;
		List<Double> tiempos = this.getTiempos();
		
		for (int i = 0; i < 3; i++) {
			podio = getAtletasPorTiempo(tiempos.get(i));
			System.out.println("puesto "+(i+1)+": ");
			for (int j = 0; j < podio.size(); j++) {
				System.out.println(podio.get(j).getNombre());
			}
		}
	}
	

	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
