package com.alura.gerenciador.accion;

import java.io.IOException;
import java.util.List;

import com.alura.gerenciador.modelo.DB;
import com.alura.gerenciador.modelo.Empresa;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaEmpresas implements Accion{
	
	public String ejecutar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Listando empresas");
		
		DB dataBase = new DB();
		List<Empresa> listaEmpresas = dataBase.getEmpresas();
		
		request.setAttribute("listaEmpresas",listaEmpresas);
		
		return "forward:ListaEmpresas.jsp";
		
	}
	
}
