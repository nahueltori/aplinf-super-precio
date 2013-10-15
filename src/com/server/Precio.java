package com.server;

import java.util.ArrayList;
import java.util.Collection;

public class Precio {
	private double importe;
	private Collection<Almacen> almacenes;
	
	public Precio(double importe){
		this.importe = importe;
		this.almacenes = new ArrayList<Almacen>();
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public Collection<Almacen> getAlmacenes() {
		return almacenes;
	}

	public void setAlmacenes(Collection<Almacen> almacenes) {
		this.almacenes = almacenes;
	}

}
