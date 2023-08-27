import java.util.Scanner;
public class Ciclo_For_Ejercicios {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int numero = 0;
		int sumatoria = 0;
		int sueldo = 0;
		int sueldoMaximo = 0;
		int pidoNumero = 0;
		boolean salgo = false;
		for(int i = 0; i<=100; i++) {
			System.out.println("I vale: " +i);
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 1");
		System.out.println("");
		
		for(int i = 50; i>=0; i--) {
			System.out.println("I vale: " +i);
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 2");
		System.out.println("");
		
		for(int i = 2; i<=100; i +=2) {
			System.out.println("I vale: " +i);
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 3");
		System.out.println("");
		
		for(int i = 100; i>=1; i-=7) {
			System.out.println("I vale: " +i);
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 4");
		System.out.println("");
		
		for(int i = 0; numero>=0; i++) {
			System.out.println("Ingrese un numero ");
			System.out.println("Para terminar Ingrese un numero negativo");
			numero = teclado.nextInt();
			if (numero<=0) {
			System.out.println("Uscted ingreso " +i +" numeros");
			System.out.println("Ingreso " + numero +", sale del sistema");
			}
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 5");
		System.out.println("");
		
		numero = 0;	
		for(int i = 0; !salgo; i++) {
			System.out.println("Ingrese un numero ");
			System.out.println("Para terminar Ingrese 0");
			numero= teclado.nextInt();
			sumatoria += numero;
			if (numero==0) {
			System.out.println("La sumatoria de los numeros es: " +sumatoria);
			salgo = true;
			}
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio 6");
		System.out.println("");
		
		numero = 0;	
		System.out.println("Ingrese un numero ");
		pidoNumero= teclado.nextInt();
		for(int i = 0; i< pidoNumero; i++) {
			System.out.println("Ingrese un sueldo ");
			sueldo= teclado.nextInt();
			
			if (sueldoMaximo < sueldo) {
				sueldoMaximo = sueldo;
			}
		}
		System.out.println(" El sueldo maximo ingresado es de $ " +sueldoMaximo);
		System.out.println("");
		System.out.println("Fin del Ejercicio 7");
		System.out.println("");
		teclado.close();
	}

}
