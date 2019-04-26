package entidades;

public class Persona extends Object implements Movible {

	private String nombre;
	private int edad;
	private int posicion;
	
	
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	@Override
	public void moverseLento() {
		System.out.println("soy la persona" + nombre + "y me muevo 5 metros");
		posicion +=5;
		// TODO Auto-vgenerated method stub
		
	}
	@Override
	public void moverseRapido() {
		System.out.println("soy la persona" + nombre + "y me muevo 20 metros");
		posicion +=20;
		// TODO Auto-generated method stub
		
	}
	@Override
	public int moverse(int metros) {
		System.out.println("soy la persona" + nombre + "y me muevo" + metros+ " metros");
		posicion +=metros;
		// TODO Auto-generated method stub
		return 0;
	}
	
	
		
}
	
	