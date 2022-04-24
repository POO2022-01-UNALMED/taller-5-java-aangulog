package zooAnimales;

public class Reptil extends Animal{
	private Reptil[] listado;
	static public int iguanas;
	static public int serpientes;
	private String colorEscamas;
	private int largoCola;
	public static int totalReptiles;
	public Reptil(){totalReptiles+=1;}
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola) {
		 this.setNombre(nombre);
		 this.setEdad(edad);
		 this.setHabitat(habitat);
		 this.setGenero(genero);
		 this.colorEscamas = colorEscamas;
		 this.largoCola = largoCola;
		 
	totalReptiles+=1;}
	
	
	
	public static int cantidadReptiles() {return totalReptiles;}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas+=1;
		return new Reptil(nombre, edad, "humedal",genero,"verde",3);
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes+=1;
		return new Reptil(nombre, edad, "jungla",genero,"blanco",1);
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public void setListado(Reptil[] a) {listado=a;}
	public Reptil[] getListado(){return listado;}
	
	public void setColorEscamas(String a) {colorEscamas=a;}
	public String getColorEscamas() {return colorEscamas;}
	
	public void setLargoCola(int a) {largoCola=a;}
	public int getLargoCola() {return largoCola;}
	
	
}
