package Clase12;

public class Persona {
	String Nombre;
	int Edad;
	int Peso;
	String ColorOjos;
	
	public Persona(String Nombre, int Edad, int Peso, String ColorOjos) {
		this.Nombre = Nombre;
		this.Edad = Edad;
		this.Peso = Peso;
		this.ColorOjos = ColorOjos;
	}
	public String Comer() {
		Peso +=1;
		return "estoy Comiendo, mi nuevo peso es " + Peso +" Kg.";
	}
	
	public String Correr() {
		Peso -= 1;
		return "Estoy Corriendo, mi nuevo peso es: " + Peso +" Kg.";
	}
	
	public void CumplirAnios() {
		Edad = Edad + 1;
		System.out.println("mi nueva edad es: " + Edad +" años");
	}
	public void CambiarNombre(String Nombre) {
		this.Nombre = Nombre;
		System.out.println("Mi nuevo nombre es: " + this.Nombre);
	}


}
