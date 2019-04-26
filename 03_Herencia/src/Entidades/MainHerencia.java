package Entidades;

import java.util.ArrayList;

public class MainHerencia {
	public static void main(String[] args) {
		Empleado empleado = new Programador();
		empleado.setDni("5353535f");
		empleado.setNombre("Bud Spen");
		empleado.setNomina(1000);
		
		Jefe jefe = new Jefe();
		jefe.setDni("23232323j");
		jefe.setNombre("terence");
		jefe.setNomina(1600);
		jefe.setIncentivos(300);
		
		Director director = new Director();
		director.setDni("4343434k");
		director.setNombre("Harry");
		director.setNomina(2300);
		
		ArrayList<Empleado> ListaEmpleados = new ArrayList<>();
		ListaEmpleados.add(empleado);
		ListaEmpleados.add(jefe);
		
		director.setListaEmpleados(ListaEmpleados);
		
		ArrayList<Empleado> empresa = new ArrayList<>();
		empresa.add(empleado);  //0
		empresa.add(jefe);       //1
		empresa.add(director);  //2
		
		calcularSueldo(empresa);
	
		Empleado empleado1 = empresa.get(1);
		System.out.println(empleado1.getNombre());
		Jefe jefe1 = (Jefe)empresa.get(1);
		System.out.println(jefe1.getIncentivos());
		
		// instanceof nos devuelve true en caso de que la refeerencia
		//este apuntando a un objeto de ese tipo
		//es una manera de hacer seguro un casting
		
		//if(empresa.get(1) instanceof Jefe {  
		//	Jefe jefe1 = (Jefe)empresa.get(1);
			
		//}
	}
		
		public static void calcularSueldo(ArrayList<Empleado> empresa) {
			for(Empleado e: empresa) {
				System.out.println(e.calcularSueldo());
			}
		 
		
	}

			
}
