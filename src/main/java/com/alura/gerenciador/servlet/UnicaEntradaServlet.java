package com.alura.gerenciador.servlet;

import java.io.IOException;

import com.alura.gerenciador.accion.EliminarEmpresa;
import com.alura.gerenciador.accion.ListaEmpresas;
import com.alura.gerenciador.accion.ModificarEmpresa;
import com.alura.gerenciador.accion.MostrarEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresa;
import com.alura.gerenciador.accion.NuevaEmpresaForm;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/entrada")
public class UnicaEntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAccion = request.getParameter("accion");
		String nombre = null;
		
		String nombreClase = "com.alura.gerenciador.accion."+paramAccion;
		
		
		if(paramAccion.equals("ListaEmpresas")) {
			
			ListaEmpresas accion = new ListaEmpresas();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("MostrarEmpresa")) {
			
			MostrarEmpresa accion =new MostrarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("EliminarEmpresa")) {
			
			EliminarEmpresa accion =new EliminarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("ModificarEmpresa")) {
			
			ModificarEmpresa accion =new ModificarEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("NuevaEmpresa")) {
			
			NuevaEmpresa accion =new NuevaEmpresa();
			nombre = accion.ejecutar(request, response);
			
		}else if(paramAccion.equals("NuevaEmpresaForm")) {
			
			NuevaEmpresaForm accion =new NuevaEmpresaForm();
			nombre = accion.ejecutar(request, response);
		}
		
		
		String[] tipoYDireccion = nombre.split(":");
		if(tipoYDireccion[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoYDireccion[1]);
			rd.forward(request, response);
		}else {
			response.sendRedirect(tipoYDireccion[1]);
		}
		
		
		
		
		
	}

}