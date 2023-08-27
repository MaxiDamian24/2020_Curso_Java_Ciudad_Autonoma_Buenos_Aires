import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		int edad;
		String nombre;
		double salario;
		
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese su nombre: ");
		nombre = teclado.nextLine();
		System.out.println("Ingrese su edad: ");
		edad = teclado.nextInt();
		System.out.println("Ingrese su Salario: ");
		salario = teclado.nextDouble();
		if (edad > 60) {
			salario += salario * 0.15;
		} else if (edad > 45) {
			salario += salario * 0.10;
		} else if(edad > 16) {
			salario += salario * 0.05;
		}
		if (edad <= 16) {
			System.out.println("Usted es menor, no puede trabajar");
		} else {
			System.out.println("Usted tiene " + edad + " años y su sueldo es: $" +salario);
		}
		System.out.println("Fin del Ejercicio 3");
		teclado.close();

	}

}
