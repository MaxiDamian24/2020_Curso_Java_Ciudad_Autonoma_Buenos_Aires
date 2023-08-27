
public class Pajaro extends Animal{
	private String Pico;

	public Pajaro(int cantidadPatas, String colorPelo, String colorOjos, String pico) {
		super(cantidadPatas, colorPelo, colorOjos);
		Pico = pico;
	}
	
	public String getPico() {
		return Pico;
	}

	public void setPico(String pico) {
		Pico = pico;
	}

	public void EmitirSonido() {
		System.out.println("Estoy Pajareando.");
	}

}
