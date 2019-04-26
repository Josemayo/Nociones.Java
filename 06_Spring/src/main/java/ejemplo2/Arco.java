package ejemplo2;

public class Arco extends Arma{
	
	@Override
	public void usar() {
		System.out.println("como arco de tipo" + getTipo()  
				+ "tenso la cuerda y disparo la flecha");
	}

}
