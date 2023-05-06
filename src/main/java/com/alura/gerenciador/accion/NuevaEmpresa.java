package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class NuevaEmpresa {
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Nueva empresa registrada");
		
		String nombreEmpresa = request.getParameter("nombre");
		String fechaAberturaEmpresa = request.getParameter("fecha");
		
		Date fechaAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(fechaAberturaEmpresa);			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Empresa empresa = new Empresa();
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		DB dataBase = new DB();
		dataBase.agregarEmpresa(empresa);
		
		request.setAttribute("empresa", empresa.getNombre());
		
		return "redirect:entrada?accion=ListaEmpresas";
	}
}
