
public class MainSentenciasControl {
	public static void main (String[] args) {
		//condicionales
		int numero = 10;
		if(numero>= 10) {
			System.out.println("el numero es mayor que 10");
		
		}else if(numero<10) {
			System.out.println("el numero es menor que 10");
			
		}else {
			System.out.println("el numeor es 10");
		}
			// inicializacion de la variable, condicion del bucle incremento del bucle
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
		int numero2 = 0;
		while(numero2 <=10) {
			System.out.println(numero2);
			numero2++;
		}
		String diaSemana = "LUNES";
		switch (diaSemana) { //ponemos a valorar la variable
		case "LUNES":
			System.out.println("el dia de la semana es lunes");
			break; // con el break rompemos la sentencia switch
			// la ejecuccion continuara hasta que se encuentre un break
		case "MARTES":
			System.out.println("el dia es martes");
			break;
			
		case "MIERCOLES":
			System.out.println("el dia es miercoles");
			break;

		default:
			break;
		}
		// if (true|| false)   //true OR false
		// if (true&& false)   //true AND false
		// if (true!ture false)   //  not
	}

}
