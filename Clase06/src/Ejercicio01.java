import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		double montoInicial = 0;
		double montoIngresado;
		int opcionIngresada = 0;
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese monto Inicial: ");
		montoInicial = teclado.nextDouble();
		
		System.out.println("Ingrese una opcion: ");
		System.out.println("1 - Muestra el Saldo");
		System.out.println("2 - Extraccion ");
		System.out.println("3 - Depositar");
		System.out.println("4 - Salir del Sistema");
		opcionIngresada = teclado.nextInt();
		
		switch (opcionIngresada){
		case 1:
			System.out.println("Su saldo es: $" + montoInicial);
			break;
		case 2:
			System.out.println("Ingrese el monto a retirar: $");
			montoIngresado = teclado.nextDouble();
			if (montoIngresado <= montoInicial && montoIngresado >0) {
				montoInicial -= montoIngresado;
				System.out.println("Extraccion exitosa, usted retiro $" +montoIngresado +" su saldo es de; $" +montoInicial);
			}else {
				System.out.println("El monto no debe ser mayor a $" +montoInicial +", ni menor que 0");
			}
			break;
		case 3:
			System.out.println("Ingrese el monto a depositar: $");
			montoIngresado = teclado.nextDouble();
			if (montoIngresado >0) {
				montoInicial += montoIngresado;
				System.out.println("Deposito realizado, su saldo es de; $" +montoInicial);
			} else {
				System.out.println("Debe ingresar un monto mayor a 0");
			}
			break;
		case 4: 
			System.out.println("Salio del Sistema");
			break;
		default:
			System.out.println("Opcion incorrecta");
		
		}
		System.out.println("Fin del Ejercicio");
		teclado.close();
	}

}
