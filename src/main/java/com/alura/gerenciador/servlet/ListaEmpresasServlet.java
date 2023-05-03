package com.alura.gerenciador.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DB dataBase = new DB();
		List<Empresa> listaEmpresas = dataBase.getEmpresas();
		
		request.setAttribute("listaEmpresas",listaEmpresas);
		RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresas.jsp");
		rd.forward(request, response);
		
	}

}
