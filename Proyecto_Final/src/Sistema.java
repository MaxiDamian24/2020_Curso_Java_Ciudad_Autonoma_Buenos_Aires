import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Sistema {
	int opcion = 0;
	
	Scanner tecladoNumero = new Scanner(System.in);
//	Sistema sistema = new Sistema();
	Empleado empleado = new Empleado();
	Jefe jefe = new Jefe();
	List <Empleado> listaEmpleado = new ArrayList<>(); 
//	List <Jefe> listaJefe = new ArrayList<>();
	
	public void MuestroMenu() {
		System.out.println("");
		System.out.println("Bienvenido al Sistema de Sueldos de los Jefes / Empleados");
		System.out.println("Elija una Opcion: ");
		System.out.println("01) Agregar un Empleado");
		System.out.println("02) Agregar un Jefe");
		System.out.println("03) Ver Lista");
		System.out.println("04) Buscar Empleado/Jefe");
		System.out.println("05) Ver Mayor Sueldo");
		System.out.println("06) Ver menor Sueldo");
		System.out.println("07) Ver promedio de Sueldos");
		System.out.println("08) Aumentar Sueldos");
		System.out.println("09) Eliminar empleado / jefe");
		System.out.println("10) Salir");
	}
	public void AgregoEmpleado( ) {
		listaEmpleado.add(empleado.agregarEmpleado());
		System.out.println(empleado);
	}
	public void AgregoJefe() {
		listaEmpleado.add(jefe.agregarJefe());
		System.out.println( jefe);
	}
	public void MuestroEmpleadoJefe() {
		for(Empleado aux: listaEmpleado) {
			System.out.println(aux);
		};
	}
	public void BuscarEmpleadoJefe() {
		System.out.println("Ingrese numero de DNI");
		boolean encontrado = false;
		int dniIngresado = tecladoNumero.nextInt();
		Iterator<Empleado> empl = listaEmpleado.iterator();
		while(empl.hasNext()) {
			Empleado aux = empl.next();
			if (aux.getDni() == dniIngresado) {
				encontrado = true;
				System.out.println("Se ha encontrado el siguiente Empleado: ");
				System.out.println(aux);
				break;
			}
		}
		if (!encontrado) {
			System.out.println("No se ha encontrado a nadie con el siguiente DNI: " +dniIngresado);
		}
	}
	public void MayorSueldo() {
		String nombreMaximo="";
		String apellidoMaximo="";
		double sueldoMaximo = 0;
		
		for (Empleado aux: listaEmpleado) {
			if(aux.getSueldo() > sueldoMaximo) {
				nombreMaximo = aux.getNombre();
				apellidoMaximo = aux.getApellido();
				sueldoMaximo = aux.getSueldo();
			}
		}
		System.out.println("El sueldo Maximo es de " + nombreMaximo +" " +apellidoMaximo +" con $" +sueldoMaximo);
	}
	public void MenorSueldo() {
		String nombreMinimo="";
		String apellidoMinimo="";
		double sueldoMinimo = 0;

		for (Empleado aux: listaEmpleado) {
			if(sueldoMinimo == 0) {
				nombreMinimo = aux.getNombre();
				apellidoMinimo = aux.getApellido();
				sueldoMinimo = aux.getSueldo();
			}
			if(aux.getSueldo() < sueldoMinimo) {
				nombreMinimo = aux.getNombre();
				apellidoMinimo = aux.getApellido();
				sueldoMinimo = aux.getSueldo();
			}
		}
		System.out.println("El sueldo minimo es de " + nombreMinimo +" " +apellidoMinimo +" con $" +sueldoMinimo);
	}
	public void PromedioSueldos() {
		double sueldosEmp = 0;
		double cantEmp = 0;
		for (Empleado aux: listaEmpleado) {
			sueldosEmp += aux.getSueldo();
			cantEmp += 1;
		}
		System.out.println("El promedio de sueldos es: $" + (sueldosEmp/cantEmp));
	}
	public void BorrarEmpleadoJefe() {
		boolean seBorro = false; 
		System.out.println("Ingrese DNI del jefe/Empleado para borrarlo ");
		int dniABorrar = tecladoNumero.nextInt();
		Iterator<Empleado> emp = listaEmpleado.iterator();
		while(emp.hasNext()) {
			Empleado aux = emp.next();
			if (aux.getDni() == dniABorrar) {
				System.out.println("Se ha borrado el siguiente Empleado/Jefe: ");
				System.out.println(aux);
				seBorro = true;
				emp.remove();
				break;
			}
			if(!seBorro) {
				System.out.println("No se encontro el DNI " +dniABorrar +" en la lista de Empleaados/jefes, debe estar ingresado para poder borrarlo");
			}
			break;
		}
	}
	public void AumentarSueldos() {
	
		for (Empleado aux: listaEmpleado) {
			
			aux.AumentarSueldo(); 
		}
		System.out.println("El aumento de sueldo ha sido exitoso!!!!");
	}
		
}
