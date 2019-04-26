import java.util.Arrays;

public class MainFunciones {
	//una funcion, que es la funcion principal, en java se conocen como metodos.
	//no existen funciones globales, todos los metodos estan asociados a una clase
    public static void main(String[] args) {
	saludo("felix");
	saludo("marta");
	int resultado=sumar(2,4);
	System.out.println(resultado);
	int[] resultados=operaciones(4,2);
	System.out.println(Arrays.toString(resultados));
	double resultadoReal = sumar(2.4,4.7);
	System.out.println(resultadoReal);
    }
    /*
     * 1 - visibilidad
     * 2 - si es estatico o dinamico, si es estatico se pone "static"
     * 3 - valor de retorno, void cuando no queremos retornar nada
     * 4 - nombre del metodo
     * 5 - argumentos de entrada
     */
    public static void saludo(String nombre) {
    	System.out.println("yo te saludo"+ nombre);
    }
    
    
    
    public static int sumar(int numero1, int numero2) {
    	int resultado = numero1 +  numero2;
    	return resultado;
    }
    
    public static int[] operaciones(int numero1, int numero2) {
    	int[] resultados = new int[4];
    	resultados[0]= numero1 + numero2;
    	resultados[1]= numero1 - numero2;
    	resultados[2]= numero1 * numero2;
    	resultados[3]= numero1 / numero2;
    	return resultados;
    }
    
    // existe lo que se conoce como sobrecarga de metodos
    // un metodo esta sobrecargado cuando tiene un mismo nombre pero
    // distinto tipo o numero de argumentos de entrada
    
    public static double sumar (double real1, double real2) {
    	return real1 + real2;
    }
    // sobrecarga por numero de argumentos
    //public static int sumar (int numero1, int numero2, int numero3) {
    //	int resultado = numero1+numero2+numero3;
    //	return resultado;
    //}
    
    // sobrecarga solo es con los parametros de entrada, nunca con los de salida
    // daria error!!
    
    // tambien podemos hacer el numero de parametros de un metodo variables
    public static void sumar(int... numeros) {
        // numeros sera tratado como un array
    int resultado=0;
    for (int i: numeros) {
    	//resultado = resultado +i;
    	resultado+= i; //equivale a la de arriba
    }
    return resultado;
    }
    
}
