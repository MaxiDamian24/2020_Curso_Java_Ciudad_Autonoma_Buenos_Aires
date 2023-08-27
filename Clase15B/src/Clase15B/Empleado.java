package Clase15B;

public class Empleado {
	String Nombre;
	int Sueldo;
	public Empleado(String Nombre, int Sueldo) {
		this.Nombre = Nombre;
		this.Sueldo = Sueldo;
	}
	public Empleado() {
		
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getSueldo() {
		return Sueldo;
	}
	public void setSueldo(int sueldo) {
		Sueldo = sueldo;
	}
	public String AumentarSueldo() {
		Sueldo += Sueldo * 0.10;
		return "el Sueldo con 10% de aumento  es: " + Sueldo;
	}
	public String DisminuirSueldo() {
		Sueldo -= Sueldo * 0.10;
		return "el Sueldo con 10% de disminucion es: " + Sueldo;
	}
	

}



