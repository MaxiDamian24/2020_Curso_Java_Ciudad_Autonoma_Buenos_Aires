
public class Empleado extends Persona{
	private double Sueldo;
	
	public Empleado(String nombre, String apellido, int edad, double sueldo) {
		super(nombre, apellido, edad);
		Sueldo = sueldo;
	}
	
	public double getSueldo() {
		return Sueldo;
	}

	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}
	public void AumentarSueldo() {
		Sueldo = Sueldo *1.1;
		System.out.println("Felicitaciones " +getNombre() +" su nuevo sueldo es: $" + Sueldo);
		}

}
