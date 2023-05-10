package com.alura.gerenciador.accion;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class LogOut implements Accion {

	@Override
	public String ejecutar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession sesion = request.getSession();
//		sesion.removeAttribute("loginUsuario"); //solo se elimina un atributo y en caso de que se tenganmas se tendria que repetir el proceso con cada uno :(
		sesion.invalidate();
		
		return "redirect:entrada?accion=LoginForm";
	}

}
