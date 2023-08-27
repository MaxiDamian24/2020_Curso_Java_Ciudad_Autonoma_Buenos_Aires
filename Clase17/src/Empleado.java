
public class Empleado {
	private String Nombe;
	private double Sueldo;
	private String Cuit;
	public Empleado(String nombe, double sueldo, String cuit) {
		super();
		Nombe = nombe;
		Sueldo = sueldo;
		Cuit = cuit;
	}
	public String getNombe() {
		return Nombe;
	}
	public void setNombe(String nombe) {
		Nombe = nombe;
	}
	public double getSueldo() {
		return Sueldo;
	}
	public void setSueldo(double sueldo) {
		Sueldo = sueldo;
	}
	public String getCuit() {
		return Cuit;
	}
	public void setCuit(String cuit) {
		Cuit = cuit;
	}
	@Override
	public String toString() {
		return "Empleado [Nombe=" + Nombe + ", Sueldo=" + Sueldo + ", Cuit=" + Cuit + "]";
	}
	
	

}
