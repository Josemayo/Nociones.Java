package controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuario;

	/*
	 * Para la creacion de servlests se usa un concepto que se llama
	 * inversion de control Este concepto nos dice que nosotros no vamos
	 * a gstionar directamente el ciclo de vida de este objeto Servlet
	 * si no que va a ser Tomcat el que lo gestione.
	 */

/* 
 * la anotacion WebServlet le dice a tomcat que tiene que gestionar
 * el ciclo de vida de este objeto(IoC-Invesrion de control)
 * La manera de acceder a este servlet va a ser segun el nombre que este dentro 
 * de la anotacion
 */

@WebServlet("/ControladorUsuario")
public class ControladorUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombreUsuario");
		String password=request.getParameter("passwordUsuario");
		
		Usuario usuario= new Usuario();
		usuario.setNombre(nombre);
		usuario.setPassword(password);
		
		GestorUsuario gu = new GestorUsuario();
		if (gu.validarUsuario(usuario)) {
			request.setAttribute("usuario", usuario);
			request.getRequestDispatcher("principal.jsp").forward(request, response);
		}else {
			request.getRequestDispatcher("error.html").forward(request, response);;
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
