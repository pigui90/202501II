package model;

public class Poligono {
	
	private int cantidadLados;

	public Poligono() {
		super();
	}

	public Poligono(int cantidadLados) {
		super();
		this.cantidadLados = cantidadLados;
	}

	public int getCantidadLados() {
		return cantidadLados;
	}

	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
	
	public double calculaArea() {
		return 0.0;
	}
	
	public double calculaPerimetro() {
		return 0.0;
	}
	
}
