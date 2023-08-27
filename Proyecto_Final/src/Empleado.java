import java.util.List;
import java.util.Scanner;

public class Empleado {
	Scanner tecladoTexto = new Scanner(System.in);
	Scanner tecladoNumero = new Scanner(System.in);
	private String nombre;
	private String apellido;
	private Double sueldo;
	private int dni;
	private int antiguedad;
	
	public Empleado(String nombre, String apellido, Double sueldo, int dni, int antiguedad) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.dni = dni;
		this.antiguedad = antiguedad;
	}
	public Empleado() {
		
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", sueldo=" + sueldo + ", dni=" + dni
				+ ", antiguedad=" + antiguedad + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
		
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	
	public Empleado agregarEmpleado() {
		System.out.println("Ingrese Nombre del Empleado: ");
		setNombre (tecladoTexto.nextLine());
		System.out.println("Ingrese Apellido del Empleado: ");
		setApellido (tecladoTexto.nextLine());
		System.out.println("Ingrese sueldo del Empleado: $");
		setSueldo (tecladoNumero.nextDouble());
		System.out.println("Ingrese DNI del Empleado: ");
		setDni (tecladoNumero.nextInt());
		System.out.println("Ingrese Antiguedad (meses) del Empleado: ");
		setAntiguedad (tecladoNumero.nextInt());
		Empleado empleado = new Empleado(nombre, apellido, sueldo, dni, antiguedad );
		return empleado;
		
	}
	public void AumentarSueldo() {
		double aumentarImporte = 0;
		aumentarImporte = (getSueldo() * getAntiguedad())/100;
		setSueldo(getSueldo()+aumentarImporte); 
	}

}
