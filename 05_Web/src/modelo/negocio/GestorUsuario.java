package modelo.negocio;

import java.util.ArrayList;

import modelo.entidades.Usuario;
import modelo.persistencia.DaoUsuario;

//Esta capa se encarga de llevar la logica de negocio de nuestra aplicacion
// , dicho de otra menaera la funcionalidad de nuestra aliicacion, para lo que
// se programo.

public class GestorUsuario {
	
	/**
	 * metodo que valida si un usuario esta registrado en el sistema
	 * @param user el usuario a validar
	 * @return true en caso de que el usuario este registrado, false en caso contrario
	 */
	
	public boolean validarUsuario(Usuario user) {
		// esta capa es la que se comunica con la base de datos 
		// podriamos validar que el usuario no este vacio
		if (user.getNombre().equals("") || user.getPassword().equals("")) {
			return false;
		}
		
		DaoUsuario daoUsuario = new DaoUsuario();
		ArrayList<Usuario> listaUsuario= daoUsuario.getListaUsuarios();
		
		for(Usuario usuarioAux : listaUsuario) {
			if (usuarioAux.getNombre().equals(user.getNombre()) && 
					usuarioAux.getPassword().equals(user.getPassword())) {
				return true; 
			}
		}
	
		return false;
	}
	

}
