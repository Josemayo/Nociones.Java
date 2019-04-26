package entidades;

public class Coche implements Movible{

		private String matricula;
		private String marca;
		private int posicion;
		
		
		public int getPosicion() {
			return posicion;
		}
		public void setPosicion(int posicion) {
			this.posicion = posicion;
		}
		public String getMatricula() {
			return matricula;
		}
		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		@Override
		public String toString() {
			return "Coche [matricula=" + matricula + ", marca=" + marca + "]";
		}
		
		@Override
		public void moverseLento() {
			System.out.println("soy la coche" + matricula + "y me muevo 10 metros");
			posicion +=5;
			// TODO Auto-vgenerated method stub
			
		}
		@Override
		public void moverseRapido() {
			System.out.println("soy la coche" + matricula + "y me muevo 50 metros");
			posicion +=20;
			// TODO Auto-generated method stub
			
		}
		@Override
		public int moverse(int metros) {
			System.out.println("soy la coche" + matricula + "y me muevo" + metros+ " metros");
			posicion +=metros;
			// TODO Auto-generated method stub
			return 0;
		}
		
		
}
