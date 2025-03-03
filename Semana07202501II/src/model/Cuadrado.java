package model;

public class Cuadrado extends Poligono{

	private double lado;

	
	public Cuadrado() {
		super();
	}


	public Cuadrado(double lado) {
		super();
		this.lado = lado;
	}


	public Cuadrado(int cantidadLados, double lado) {
		super(cantidadLados);
		this.lado = lado;
	}
	
	@Override
	public double calculaArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public double calculaPerimetro() {
		return this.lado * 4;
	}
	
	
	
	
	
}
