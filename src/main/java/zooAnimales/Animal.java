package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona[] zona;
	public Animal(){totalAnimales+=1;}

	public Animal(String nombre, int edad, String habitat, String genero){
		this.nombre=nombre;
		this.edad=edad;
		this.habitat=habitat;
		this.genero=genero;
		//this.zona=zona;
		totalAnimales+=1;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static void totalPorTipo() {
		System.out.println(
				"Mamiferos: "+Mamifero.cantidadMamiferos()+
				"\nAves: "+Ave.cantidadAves()+
				"\nReptiles: "+Reptil.cantidadReptiles()+
				"\nPeces: "+Pez.cantidadPeces()+
				"\nAnfibios: "+Anfibio.cantidadAnfibios());
	}
	
	@Override
	public String toString(){
		if(this.zona ==null) {
		return "Mi nombre es "+this.getNombre()+", tengo una edad de "+this.getEdad()+", habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
	}
		else if (this.zona.length==1){
			return "Mi nombre es "+this.getNombre()+" tengo una edad de "+this.getEdad()+" habito en "+this.getHabitat()+" y mi genero es "+this.getGenero()+", la zona en la que me ubico es "+this.getZona()+", en el RELLENAR ACORDE";
		}
		else {
			return "Mi nombre es "+this.getNombre()+" tengo una edad de "+this.getEdad()+" habito en "+this.getHabitat()+" y mi genero es "+this.getGenero();
		}
	}
		
		
//	public void setTotalAnimales(int a) {totalAnimales=a;}
	public static int getTotalAnimales(){return totalAnimales;}
	
	public void setNombre(String a) {nombre=a;}
	public String getNombre(){return nombre;}
	
	public void setEdad(int a) {edad=a;}
	public int getEdad(){return edad;}
	
	public void setHabitat(String a) {habitat=a;}
	public String getHabitat(){return habitat;}
	
	public void setGenero(String a) {genero=a;}
	public String getGenero(){return genero;}
	
	public void setZona(Zona[] a) {zona=a;}
	public Zona[] getZona(){return zona;}
}
