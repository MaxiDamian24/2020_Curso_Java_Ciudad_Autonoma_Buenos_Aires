import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int valor1;
		Scanner teclado = new Scanner(System.in);
		
		
		System.out.println("Ingrese un numero entero: ");
		valor1 = teclado.nextInt();

		if (valor1 >= 0) {
			System.out.print("El numero es Positivo ");
		}else {
			System.out.print("El numero es negativo ");
		}
		if (valor1%2 == 0) {
			System.out.println("y par");
		} else {
			System.out.println("y es impar");
		}
		System.out.println("Fin del Ejercicio 2");
		teclado.close();

	}

}
