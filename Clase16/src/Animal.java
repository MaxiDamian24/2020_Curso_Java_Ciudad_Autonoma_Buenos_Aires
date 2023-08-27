
public abstract class Animal {
	private int CantidadPatas;
	private String ColorPelo;
	private String ColorOjos;
	public Animal(int cantidadPatas, String colorPelo, String colorOjos) {
		super();
		CantidadPatas = cantidadPatas;
		ColorPelo = colorPelo;
		ColorOjos = colorOjos;
	}
	
	public int getCantidadPatas() {
		return CantidadPatas;
	}

	public void setCantidadPatas(int cantidadPatas) {
		CantidadPatas = cantidadPatas;
	}

	public String getColorPelo() {
		return ColorPelo;
	}

	public void setColorPelo(String colorPelo) {
		ColorPelo = colorPelo;
	}

	public String getColorOjos() {
		return ColorOjos;
	}

	public void setColorOjos(String colorOjos) {
		ColorOjos = colorOjos;
	}

	public void Caminar() {
		System.out.println("Estoy Caminando.");
	}
	public abstract void EmitirSonido();
	
}
