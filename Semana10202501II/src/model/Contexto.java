package model;

public class Contexto {

	private Estrategia estrategia;
	
	public Contexto(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
	
	public Contexto() {
		
	}
	
	public void calculaImpuesto() {
		this.estrategia.calcularImpuestos();
	}
	
	public void setEstrategia(Estrategia estrategia) {
		this.estrategia = estrategia;
	}
}
