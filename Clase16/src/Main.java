
public class Main {

	public static void main(String[] args) {
/*		Leon leon1 = new Leon(4, "Mostaza", "Azules", "Mucha");
		Pajaro pajaro1 = new Pajaro(2, "Verde", "Marrones", "Corto");
		
		leon1.EmitirSonido();
		pajaro1.EmitirSonido();

	}
*/
		Alumno alumno1 = new Alumno(22, "Daniel", 1.68, "Sistemas");
		Empleado empleado1 = new Empleado(23, "Pedro", 1.70, 5, "Banco");
		System.out.println("////////////////////////////////");
		alumno1.Ocupacion();
		System.out.println("////////////////////////////////");
		empleado1.Ocupacion();
	}
		
}
