
public class ModeloAuto extends Auto{
	private String Modelo;
	
	public ModeloAuto(int cantidadPuertas, int velocidadMaxima, String marca, String modelo) {
		super(cantidadPuertas, velocidadMaxima, marca);
		Modelo = modelo;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	
	public double consumo() {
		return getVelocidadMaxima() *0.1;
	}
	

}
