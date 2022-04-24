package zooAnimales;

public class Pez extends Animal{
	private Pez[] listado;
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	public static int totalPeces;
	public Pez(){totalPeces+=1;}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		 this.setNombre(nombre);
		 this.setEdad(edad);
		 this.setHabitat(habitat);
		 this.setGenero(genero);
		 this.colorEscamas = colorEscamas;
		 this.cantidadAletas = cantidadAletas;
		 
	totalPeces+=1;}
	
	
	public static int cantidadPeces() {return totalPeces;}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones+=1;
		return new Pez( nombre, edad, "oceano",genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos+=1;
		return new Pez( nombre, edad, "oceano",genero, "gris", 6);
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public void setListado(Pez[] a) {listado=a;}
	public Pez[] getListado(){return listado;}
	
	public void setColorEscamas(String a) {colorEscamas=a;}
	public String getColorEscamas() {return colorEscamas;}
	
	public void setCantidadAletas(int a) {cantidadAletas=a;}
	public int getCantidadAletas() {return cantidadAletas;}
}
