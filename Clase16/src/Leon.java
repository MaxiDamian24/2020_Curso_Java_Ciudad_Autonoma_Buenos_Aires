
public class Leon extends Animal{
	private String Melena;

	public Leon(int cantidadPatas, String colorPelo, String colorOjos, String melena) {
		super(cantidadPatas, colorPelo, colorOjos);
		Melena = melena;
	}
	
	public String getMelena() {
		return Melena;
	}

	public void setMelena(String melena) {
		Melena = melena;
	}

	@Override
	public void EmitirSonido() {
		System.out.println("Estoy rugiendo");
	}
	

}
