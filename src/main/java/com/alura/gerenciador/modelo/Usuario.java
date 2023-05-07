package com.alura.gerenciador.modelo;

public class Usuario {

	private String login;
	private String contraseña;
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	public boolean esIgual(String login, String contraseña) {
		if(!this.login.equals(login)) {
			return false;
		}
		if(!this.contraseña.equals(contraseña)) {
			return false;
		}
		return true; 
	}
	
}
