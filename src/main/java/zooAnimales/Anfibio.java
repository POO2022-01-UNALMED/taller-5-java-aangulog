package zooAnimales;

public class Anfibio extends Animal{
	private Anfibio[] listado;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	public static int totalAnfibios;
	public Anfibio(){totalAnfibios+=1;}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso) {
		 this.setNombre(nombre);
		 this.setEdad(edad);
		 this.setHabitat(habitat);
		 this.setGenero(genero);
		 this.colorPiel = colorPiel;
		 this.venenoso = venenoso;
		 
	totalAnfibios+=1;}
	
	public static int cantidadAnfibios() {return totalAnfibios;}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas+=1;
		return new Anfibio(nombre, edad, "selva", genero, "rojo", true);}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras+=1;
		return new Anfibio(nombre, edad, "selva", genero, "negro y amarillo", false);}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public void setListado(Anfibio[] a) {listado=a;}
	public Anfibio[] getListado(){return listado;}
	
	public void setColorPiel(String a) {colorPiel=a;}
	public String getColorPiel() {return colorPiel;}
	
	public void setLargoCola(boolean a) {venenoso=a;}
	public boolean getLargoCola() {return venenoso;}
	
	public boolean isVenenoso() {
		return this.venenoso;
	}
}
