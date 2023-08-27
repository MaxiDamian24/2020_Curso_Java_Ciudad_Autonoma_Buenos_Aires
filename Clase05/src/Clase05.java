import java.util.Scanner;

public class Clase05 {

	public static void main(String[] args) {
		
		int valor1;
		int valor2;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Escriba un numero entero: ");
		valor1 = teclado.nextInt();
		System.out.println("Escriba otro numero entero: ");
		valor2 = teclado.nextInt();
		if (valor1 == valor2) {
			System.out.println("Ambos numeros son Iguales, el numero es " +valor1);
		}else if (valor1>valor2){
			System.out.println("El primer numero, el " +valor1 +" es mayor que el numero, el " +valor2);
		}else {
			System.out.println("El primer numero, el " +valor1 +" es menor que el numero, el " +valor2);
		}
		
		System.out.println("Fin del Ejercicio 1");
		teclado.close();
	}

}
