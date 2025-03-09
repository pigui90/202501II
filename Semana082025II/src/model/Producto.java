package model;

import java.math.BigDecimal;

public class Producto {
	private BigDecimal precio;
	private BigDecimal descuento;
	private String nombre;
	private int cantidad;

	public Producto(BigDecimal precio, BigDecimal descuento, String nombre, int cantidad) {
		super();
		this.precio = precio;
		this.descuento = descuento;
		this.nombre = nombre;
		this.cantidad = cantidad;
	}

	public Producto() {
		super();
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	public BigDecimal getDescuento() {
		return descuento;
	}

	public void setDescuento(BigDecimal descuento) {
		this.descuento = descuento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public BigDecimal calculaPrecioDescuento() {
		return precio.subtract(precio.multiply(descuento).divide(new BigDecimal (100)));
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nombre: " + nombre + "\nCantidad: " + cantidad + "\nPrecio: " + precio + "\nDescuento: " + descuento;
	}

}
