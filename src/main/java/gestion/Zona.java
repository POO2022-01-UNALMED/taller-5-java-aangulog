package gestion;
import java.util.ArrayList;

import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoonl;
	private ArrayList<Animal> animales;
	public Zona(){this.animales = new ArrayList<Animal>();}
	

	
	public Zona(String nombre, Zoologico zoo){
		this.nombre = nombre;
		this.zoonl = zoo;
	}
	
	public void setNombre(String a) {nombre=a;}
	public String getNombre(){return nombre;}
	
	public void setZoo(Zoologico a) {zoonl=a;}
	public Zoologico getZoo(){return zoonl;}
	
	public void setAnimales(ArrayList<Animal> a) {animales = a;}
	public ArrayList<Animal> getAnimales(){return animales;}
	
	public void agregarAnimales(Animal a) {
		this.animales.add(a);
	}
	public int cantidadAnimales() {
		return animales.toArray().length;
	}
}
