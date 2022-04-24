package zooAnimales; 

public class Mamifero extends Animal{
	private static Mamifero[] listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	public static int totalMamiferos;
	

	public Mamifero(){totalMamiferos+=1;
//	if(listado == null) {
//		listado = new Mamifero[0];
//		listado[0] = this;
// 	}
//	else {
//		Mamifero[] newarr=new Mamifero[totalMamiferos-1];
//		for (int i=0; i<totalMamiferos-2;i++) {
//			newarr[i]=listado[i];
//		}
//		newarr[totalMamiferos-1]=this;
//		listado=newarr;
//		}
	}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		 this.setNombre(nombre);
		 this.setEdad(edad);
		 this.setHabitat(habitat);
		 this.setGenero(genero);
		 this.pelaje = pelaje;
		 this.patas=patas;
		 
	totalMamiferos+=1;}
	
	
	
	public static int cantidadMamiferos() {return totalMamiferos;}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero){
		caballos+=1;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero){
		leones+=1;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);}
	
	public static void setListado(Mamifero[] a) {listado=a;}
	public static Mamifero[] getListado(){return listado;}
	
//	public void setCaballos(int a) {caballos=a;}
//	public int getCaballos(){return caballos;}
//	
//	public void setLeones(int a) {leones=a;}
//	public int getLeones(){return leones;}
	
	public void setPelaje(boolean a) {pelaje=a;}
	public boolean getPelaje(){return pelaje;}
	
	public void setPatas(int a) {patas=a;}
	public int getPatas(){return patas;}
	
	public boolean isPelaje() {
		return this.pelaje;
	}
}
