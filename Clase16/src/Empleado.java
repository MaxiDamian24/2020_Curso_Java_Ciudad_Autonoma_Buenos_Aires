
public class Empleado extends Persona{
	private int Antiguedad;
	private String Empresa;

	public Empleado(int edad, String nombre, double altura, int antiguedad, String empresa) {
		super(edad, nombre, altura);
		Antiguedad = antiguedad;
		Empresa = empresa;
	}

	public String getEmpresa() {
		return Empresa;
	}

	public void setEmpresa(String empresa) {
		Empresa = empresa;
	}

	public int getAntiguedad() {
		return Antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		Antiguedad = antiguedad;
	};
	@Override 
	public void Ocupacion() {
		System.out.println("Soy un empleado que trabja en la empresa " + Empresa + " hace " +Antiguedad +" años" );
	}

}
