
public class MainArrays {
public static void main(String[] args) {
	int numero = 5;
	int[] arrayNumeros = new int[5];
	// este tipo de arrays son arrays estaticos, es decir, 
	// una vez inicializado el array a un tamanio, siempre sera ese tamanio
	arrayNumeros[0] = 23;
	arrayNumeros[1] = 45;
	
	//recorremos el array
	for(int i=0;i < arrayNumeros.length;i++) {
		System.out.println(arrayNumeros[i]);
	}
	for(int i : arrayNumeros) {   // opcion recomendable porque no se desborda
		System.out.println(i);
	}
}
}
