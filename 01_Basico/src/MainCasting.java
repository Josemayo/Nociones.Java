
public class MainCasting {
	public static void main(String[] args) {
		double real = 5;
		int entero = (int)real; // se llama casting, y permite convertir un tipo en otro
		                        // simplemente le elimina los decimales.
		
		System.out.println(entero);
		
	    long numero = Math.round(real);
		System.out.println(numero);
		
	}

}
