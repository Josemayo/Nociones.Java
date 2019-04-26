package javabeans;

/*
 * Notacion javabean es un convenio java sobre la creaccion de objetos simples
 * tambien llamados POJOS (Plain Old Java Object)
 * Basicamente son objetos sencillos que no tienen herencia ni logica complicada
 * Para hacer una clase javabean es atributos privados y metodos accesores y 
 * modificadores publicos / getters/setters
 * Los atributos pasan a ser propiedades
 */
public class Persona {
	private String nombre;
	private int edad;
	private double peso;
	
	
	// boton dercho, 
	public Persona(String nombre, int edad, double peso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
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
		if(edad < 0) edad = 0;
		this.edad = edad;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}


	//anotacion (asegura que estas sobreescribiendo)
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + "]";
	}
	


}
