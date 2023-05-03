package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NuevaEmpresaServLet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Nueva empresa registrada");
		
		String nombreEmpresa = req.getParameter("nombre");
		String fechaAberturaEmpresa = req.getParameter("fecha");
		
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
		
		resp.sendRedirect("listaEmpresas");
		
//		RequestDispatcher rd = req.getRequestDispatcher("/listaEmpresas");
//		req.setAttribute("nombreEmpresa", empresa.getNombre());
//		rd.forward(req, resp);
	}

}
