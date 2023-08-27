
public class Alumno extends Persona {
	private String Carrera;

	public Alumno(int edad, String nombre, double altura, String carrera) {
		super(edad, nombre, altura);
		Carrera = carrera;
	}

	public String getCarrera() {
		return Carrera;
	}

	public void setCarrera(String carrera) {
		Carrera = carrera;
	}
	@Override 
	public void Ocupacion() {
		System.out.println("Estudio la carrera " + Carrera);
	}
}
