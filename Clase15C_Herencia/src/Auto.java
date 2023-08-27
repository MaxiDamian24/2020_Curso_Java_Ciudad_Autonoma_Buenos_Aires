
public class Auto {
	private int CantidadPuertas;
	private double VelocidadMaxima;
	private String Marca;
	public Auto(int cantidadPuertas, int velocidadMaxima, String marca) {
		CantidadPuertas = cantidadPuertas;
		VelocidadMaxima = velocidadMaxima;
		Marca = marca;
	}
	
	public int getCantidadPuertas() {
		return CantidadPuertas;
	}

	public void setCantidadPuertas(int cantidadPuertas) {
		CantidadPuertas = cantidadPuertas;
	}

	public double getVelocidadMaxima() {
		return VelocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		VelocidadMaxima = velocidadMaxima;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double distancia() {
		return VelocidadMaxima * 100; 
	}
	

}
