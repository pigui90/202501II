package model;

public class Servidor {
	private static Servidor servidor;
	private static String ip;
	private static String conexion;
	
	/**
	 * Constructor privado con acceso solamente en la clase
	 */
	private Servidor() {
		
	}
	
	public static Servidor getServidor() {
		if(Servidor.servidor == null) {
			servidor = new Servidor();
			servidor.ip = "10.52.1.42";
			servidor.conexion = "10.52.1.42/database";
			
		}
		return Servidor.servidor;
	}
	
	public static String getIp() {
		return ip;
	}
	
	public static String getConexion() {
		return conexion;
	}
	
}
