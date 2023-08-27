
public class Jefe extends Empleado{
	private int cantEmpleados;

	public Jefe(String nombre, String apellido, Double sueldo, int dni, int antiguedad, int cantEmpleados) {
		super(nombre, apellido, sueldo, dni, antiguedad);
		this.cantEmpleados = cantEmpleados;
	}
	public Jefe() {
		
	}

	@Override
	public String toString() {

		return "Jefe [  Nombre= "+ getNombre() + ", Apellido=" + getApellido() + ", Sueldo()=" + getSueldo() + ", Dni="
		+ getDni() + ", Antiguedad()=" + getAntiguedad() + ", cantEmpleados=" + cantEmpleados + "]";		
	}

	public int getCantEmpleados() {
		return cantEmpleados;
	}

	public void setCantEmpleados(int cantEmpleados) {
		this.cantEmpleados = cantEmpleados;
	}
	public void AumentarSueldo() {
		double aumentarImporte = 0;
		aumentarImporte = (getSueldo() * getCantEmpleados())/100;
		setSueldo(getSueldo()+aumentarImporte); 
	}
	
	public Jefe agregarJefe() {
		System.out.println("Ingrese Nombre del Jefe: ");
		setNombre(tecladoTexto.nextLine());
		System.out.println("Ingrese Apellido del Jefe: ");
		setApellido(tecladoTexto.nextLine());
		System.out.println("Ingrese sueldo del Jefe: $");
		setSueldo(tecladoNumero.nextDouble());
		System.out.println("Ingrese DNI del Jefe: ");
		setDni(tecladoNumero.nextInt());
		System.out.println("Ingrese Antiguedad (meses) del Jefe: ");
		setAntiguedad (tecladoNumero.nextInt());
		System.out.println("Ingrese Cantidad de Empleados a cargo del Jefe: ");
		setCantEmpleados(tecladoNumero.nextInt());
		Jefe jefe = new Jefe(getNombre(), getApellido(), getSueldo(), getDni(), getAntiguedad(), getCantEmpleados() );
		return jefe;
		
	}

}
