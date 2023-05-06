package com.alura.gerenciador.accion;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ModificarEmpresa implements Accion{
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String nombreEmpresa = request.getParameter("nombre");
		String fechaAberturaEmpresa = request.getParameter("fecha");
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println("Modificando empresa "+id);
		
		Date fechaAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			fechaAbertura = sdf.parse(fechaAberturaEmpresa);			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		DB db = new DB();
		Empresa empresa = db.buscarEmpresaPorId(id);
		empresa.setNombre(nombreEmpresa);
		empresa.setFechaAbertura(fechaAbertura);
		
		return "redirect:entrada?accion=ListaEmpresas";
		
	}
	
}
