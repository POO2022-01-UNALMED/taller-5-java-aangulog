package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;
	public Zoologico(){this.zonas = new ArrayList<Zona>();}
	
	public Zoologico(String nombre, String ubicacion, Zona[] zonas){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = zonas;
	}
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.zonas = new ArrayList<Zona>();
	}

	public void setNombre(String a) {nombre=a;}
	public String getNombre(){return nombre;}
	
	public void setUbicacion(String a) {ubicacion=a;}
	public String getUbicacion(){return ubicacion;}
	
//	public void setZonas(Zona[] a) {zonas=a;}
	public ArrayList<Zona> getZona(){return zonas;}
	
	public void agregarZonas(Zona a) {
		zonas.add(a);
	}
	
	public int cantidadTotalAnimales() {
		int kiii=0;
		for (int i=0;i<zonas.toArray().length;i++) {
			kiii+=this.zonas.get(i).cantidadAnimales();
		}
		return kiii;
	}
}
