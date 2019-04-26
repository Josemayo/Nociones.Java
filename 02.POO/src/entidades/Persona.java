package entidades;

public class Persona {
	// las dos visibilidades mas importantes son public y private
	// y se pueden dar tanto a atributos como a metodos
	// con public podemos acceder desde cualquier otra clase,
	// con private solo podemos acceder desde la propia clase
	public String nombre;
	public int edad;
	public double peso;
	private int metros;
	public Direccion direccion;
    // los atributos se inicializan a null si son referencias y 
	// a 0 si son primitivos o a false si son booleanos
	
	
	
	
	//todos los objetos tienen que tener un constructor
	//constructor por defecto
	public Persona() {
		
	}
	
	
	
	
	public Persona(String nombre, int edad, double peso, int metros) {
		super();  //palabra reservada que invoca al constructor padre
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.metros = metros;
	}




	public void andar(int metros) {
		// con this hacemos una referencia al propio objeto
		// con this accemos referencia a atributos
		this.metros += metros;
	}
	
	public int getMetros() {
		return metros;  // aqui no hay duda de que los metros son el atributo de clase 
		
	}
	
	

}
