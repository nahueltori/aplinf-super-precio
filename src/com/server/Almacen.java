package com.server;

public class Almacen {
	private String nombre;
	private String zona;
	
	public Almacen(String nombre, String zona){
		this.nombre = nombre;
		this.zona = zona;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

}
