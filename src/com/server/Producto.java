package com.server;

import java.util.ArrayList;
import java.util.Collection;

public class Producto {
	private String marca;
	private String descripcion;
	private String categoria;
	private Collection<Precio> precios;
	
	public Producto(String marca, String descripcion, String categoria){
		this.marca = marca;
		this.descripcion = descripcion;
		this.categoria = categoria;
		this.precios = new ArrayList<Precio>();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Collection<Precio> getPrecios() {
		return precios;
	}

	public void setPrecios(Collection<Precio> precios) {
		this.precios = precios;
	}
}
