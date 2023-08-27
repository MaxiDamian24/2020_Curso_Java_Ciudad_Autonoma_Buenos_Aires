import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Ejercicio 4
		String nombre;
		int edad;
		double montoInicial;
		Boolean puedeIngresar;
		String extraccion;
		Double montoARetirar;
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2 = new Scanner(System.in);		
		
				puedeIngresar = false;
				//extraccion = "N";
				System.out.println("Ingrese su edad: ");
				edad = teclado.nextInt();
			
				 if (edad > 18) {
				puedeIngresar = true;
				}else {
					System.out.println("Usted es menor de edad, no puede ingresar al sistema");
				}
				
				if (puedeIngresar) {
					System.out.println("Bienvenido al Sistema Bancario. Ingrese su nombre: ");
					nombre = teclado2.nextLine();
					System.out.println("Ingrese su monto Inicial: ");
					montoInicial = teclado.nextDouble();
					System.out.println("¿Desea hacer una extraccion? Conteste S para si o N para no");
					extraccion  = teclado2.nextLine();
					if (extraccion.equals("S") || extraccion.equals("s")) {
						System.out.println("Ingrese monto a retirar: ");
						montoARetirar = teclado.nextDouble();
						if (montoARetirar <= montoInicial) {
							montoInicial -= montoARetirar;
							System.out.println("Opersacion exitosa, su saldo es: $" +montoInicial);
						}else {
							System.out.println("Saldo insuficiente, quiere retirar $" +montoARetirar +" y su saldo es de $" +montoInicial);
						}
					}else System.out.println("Operacion Cancelada");
				}
				teclado.close();
				teclado2.close();
				System.out.println("Fin del Ejercicio 4");

	}

}
