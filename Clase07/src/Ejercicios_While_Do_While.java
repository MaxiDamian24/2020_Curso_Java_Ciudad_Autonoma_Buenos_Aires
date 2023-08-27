import java.util.Scanner;
public class Ejercicios_While_Do_While {

	public static void main(String[] args) {
		int i = 0;
		
		
		// Ejercicio 01
		//1- Realizar un ciclo While que muestre los números del 1 al 100.
		i = 1;
		while (i<=100) {
			System.out.println("i vale: " + i);
			i++;
		}
		System.out.println("Fin del ejercicio 1");
		System.out.println(" ");
		System.out.println(" ");
		
		// Ejercicio 02
		// 2- Realizar un contador inverso que cuente del 50 al 0.
		
		i = 50;
		while (i>=0) {
			System.out.println("i vale: " + i);
			i--;
		}
		System.out.println("Fin del ejercicio 2");
		System.out.println(" ");
		System.out.println(" ");
		
		//Ejercicio 03
		// 3- Realizar un contador que solo muestre los números pares hasta 100.
		
		i = 1;
		int resto = 0;
		while (i<=100) {
			resto = i % 2;
			if (resto == 0) {
			System.out.println("i vale: " + i);
			}
			i ++;
		}
		System.out.println("Fin del ejercicio 3");
		System.out.println(" ");
		System.out.println(" ");
		
		// Ejercicio 04
		//4- Escribir todos los números del 100 al 0 de 7 en 7.
		
		i= 100;
		while (i>=0) {
			System.out.println("i vale: " + i);
			i -=7;
		}
		System.out.println("Fin del ejercicio 4");
		System.out.println(" ");
		System.out.println(" ");
		
		//Ejercicio 05
		// 5- Pedir números hasta que se teclee uno negativo, y mostrar la cantidad de números introducidos.
		
		i=0;
		int numeroEntrante = 0;
		Scanner teclado = new Scanner (System.in);
		
		do {
			System.out.println("Ingrese un numero");
			System.out.println("Para Salir ingrese un numero negativo");
			numeroEntrante = teclado.nextInt();
			i++;
		}while (numeroEntrante >= 0);
		System.out.println("Usted Ingreso " + i +" numeros.");
		System.out.println("Fin del Ejercicio 5");
		System.out.println(" ");
		System.out.println(" ");
		
		//Ejercicio 06
		//6- Pedir números hasta que se teclee un 0, mostrar la suma de todos los números introducidos.
		
		i=0;
		numeroEntrante = 0;
		
		do {
			System.out.println("Ingrese un numero");
			System.out.println("Para Salir ingrese el numero 0");
			numeroEntrante = teclado.nextInt();
			i += numeroEntrante;
		}while (numeroEntrante != 0);
		System.out.println("La sumatoria de los numeros ingresados es: " + i);
		System.out.println("Fin del Ejercicio 6");
		System.out.println(" ");
		System.out.println(" ");
		
		// Ejercicio 07
		//7- Pedir un número N, introducir N sueldos, y mostrar el sueldo máximo.
		
		int sueldoMaximo = 0;
		int sueldoEntrante = 0;
		numeroEntrante = 0;
		
		System.out.println("Ingrese un numero mayor que 0");
		numeroEntrante = teclado.nextInt();
		do {
			if (numeroEntrante > 0) {
			System.out.println("Ingrese un importe de sueldo");
			sueldoEntrante = teclado.nextInt();
			}
			if (sueldoMaximo < sueldoEntrante){
				sueldoMaximo = sueldoEntrante;
			}
			
			numeroEntrante --;
		}while (numeroEntrante > 0);
		System.out.println("El mayor sueldo ingresado es: $" + sueldoMaximo);
		System.out.println("Fin del Ejercicio 7");
		System.out.println(" ");
		System.out.println(" ");
		teclado.close();

	}

}
