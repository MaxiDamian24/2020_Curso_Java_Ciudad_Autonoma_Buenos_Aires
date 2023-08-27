
public abstract class Persona {
	private int Edad;
	private String Nombre;
	private double Altura;
	public Persona(int edad, String nombre, double altura) {
		super();
		Edad = edad;
		Nombre = nombre;
		Altura = altura;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getAltura() {
		return Altura;
	}
	public void setAltura(double altura) {
		Altura = altura;
	}
	public void Saludar() {
		System.out.println("Hola como estan!!!");
	}
	public abstract void Ocupacion();

}
