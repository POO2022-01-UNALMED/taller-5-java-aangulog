package zooAnimales;

public class Ave extends Animal{
	private Ave[] listado;
	static public int halcones;
	static public int aguilas;
	private String colorPlumas;
	public static int totalAves;
	public Ave(){totalAves+=1;}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		 this.setNombre(nombre);
		 this.setEdad(edad);
		 this.setHabitat(habitat);
		 this.setGenero(genero);
		 this.colorPlumas = colorPlumas;
		 
	totalAves+=1;}
	
	
	
	public static int cantidadAves() {return totalAves;}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones+=1;
		return new Ave(nombre,edad,"montanas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas+=1;
		return new Ave(nombre,edad,"montanas", genero, "blanco y amarillo");
	}
	
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public void setListado(Ave[] a) {listado=a;}
	public Ave[] getListado(){return listado;}
	
	public void setColorPlumas(String a) {colorPlumas=a;}
	public String getColorPlumas() {return colorPlumas;}



	
	
	
}
