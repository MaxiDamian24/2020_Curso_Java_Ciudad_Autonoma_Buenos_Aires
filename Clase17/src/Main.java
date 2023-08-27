
public class Main {

	public static void main(String[] args) {
		
		Empleado empleado[] =new Empleado[5];
		
		empleado[0] = new Empleado("Jose", 3568.25, "20-36587257-4");
		empleado[1] = new Empleado("Maria", 653568.25, "14-36254236-6");
		empleado[2] = new Empleado("Damian", 13618.25, "15-36369856-7");
		empleado[3] = new Empleado("David", 25698.25, "22-36585698-0");
		empleado[4] = new Empleado("Daniel", 98620.25, "15-32587657-3");
		
		for(int i = 0; i< empleado.length; i++) {
			System.out.println(empleado[i].toString());
		}
		
		double sueldoMayor = empleado[0].getSueldo();
		double totalDeSueldos = empleado[0].getSueldo() ;
		System.out.println("Los ultimos tres digitos del cuit "+empleado[0].getCuit() +"antes del guion son " + empleado[0].getCuit().substring(8,11)+"\n");

		for(int i = 1; i< empleado.length; i++) {
			if(sueldoMayor < empleado[i].getSueldo()) {
				sueldoMayor = empleado[i].getSueldo();
			}
			totalDeSueldos += empleado[i].getSueldo();
			System.out.println("Los ultimos tres digitos del cuit "+empleado[i].getCuit() +"antes del guion son " + empleado[i].getCuit().substring(8,11)+"\n");
		}
		System.out.println("\nEl sueldo mayor es de $" +sueldoMayor +"\n");
		System.out.println("\nEl promedio de Sueldos es $:" +totalDeSueldos /empleado.length +"\n");
	}
}
