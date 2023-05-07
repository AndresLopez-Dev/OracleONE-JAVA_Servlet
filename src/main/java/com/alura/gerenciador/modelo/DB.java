package com.alura.gerenciador.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DB {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static List<Usuario> listaUsuarios = new ArrayList<>();
	private static Integer llaveSecuencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		empresa.setId(DB.llaveSecuencial++);
		empresa.setNombre("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(DB.llaveSecuencial++);
		empresa2.setNombre("Oracle");
		Empresa empresa3 = new Empresa();
		empresa3.setId(DB.llaveSecuencial++);
		empresa3.setNombre("Pragma");
		
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);
		listaEmpresas.add(empresa3);
		
		Usuario usuario1 = new Usuario();
		usuario1.setLogin("Andres");
		usuario1.setContraseña("1234");
		Usuario usuario2 = new Usuario();
		usuario2.setLogin("David");
		usuario2.setContraseña("123");
		
		listaUsuarios.add(usuario1);
		listaUsuarios.add(usuario2);
	}
	
	public void agregarEmpresa(Empresa empresa) {
		empresa.setId(DB.llaveSecuencial++);
		DB.listaEmpresas.add(empresa);
	}
	
	public List<Empresa> getEmpresas() {
		return DB.listaEmpresas;
	}

	public void eliminarEmpresa(Integer id) {
		Iterator<Empresa> it= listaEmpresas.iterator();
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscarEmpresaPorId(Integer id) {

		for (Empresa empresa : listaEmpresas) {
			if(empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
		
	}

	public Usuario existeUsuario(String paramLogin, String paramContrasena) {
		
		for (Usuario usuario: listaUsuarios) {
			if(usuario.esIgual(paramLogin, paramContrasena)) {
				return usuario;
			}
		}
		
		return null;
	}
	
}
