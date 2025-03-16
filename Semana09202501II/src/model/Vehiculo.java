package model;

public class Vehiculo {
	private String placa;
	private String modelo;
	private int anio;

	public Vehiculo(String placa, String modelo, int anio) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.anio = anio;
	}

	public Vehiculo() {
		super();
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Vehiculo [placa=");
		builder.append(placa);
		builder.append(", modelo=");
		builder.append(modelo);
		builder.append(", anio=");
		builder.append(anio);
		builder.append("]");
		return builder.toString();
	}

}
