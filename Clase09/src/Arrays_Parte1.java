import java.util.Scanner;
public class Arrays_Parte1 {

	public static void main(String[] args) {
		int array1[]= {5,4,8,10,7,12,24,35,65,12};
		
		Scanner teclado = new Scanner (System.in);
		int minimo = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (minimo > array1[i]) {
				minimo = array1[i];
			}
		}
		System.out.println();
		System.out.println("Comienzo Ejercicio 1");
		System.out.println();
		System.out.println("El numero menor del array es: " +minimo);
		System.out.println();
		System.out.println("Fin del Ejercicio 1");
		System.out.println();
		
		int maximo = array1[0];
		for (int i = 1; i < array1.length; i++) {
			if (maximo < array1[i]) {
				maximo = array1[i];
			}
		}
		System.out.println();
		System.out.println("Comienzo Ejercicio 2");
		System.out.println();
		System.out.println("El numero maximo del array es: " +maximo);
		System.out.println();
		System.out.println("Fin del Ejercicio 2");
		System.out.println();
		
		int suma = 0;
		for (int i = 0; i < array1.length; i++) {
			suma +=array1[i]; 
			
		}
		System.out.println();
		System.out.println("Comienzo Ejercicio 3");
		System.out.println();
		System.out.println("El suma total del array  es: " +suma);
		System.out.println();
		System.out.println("Fin del Ejercicio 3");
		System.out.println();
		
		suma = 0;
		for (int i = 0; i < array1.length; i++) {
			suma +=array1[i]; 
		}
		
		System.out.println();
		System.out.println("Comienzo Ejercicio 4");
		System.out.println();
		System.out.println("El promedio del array  es: " +(suma / array1.length));
		System.out.println();
		System.out.println("Fin del Ejercicio 4");
		System.out.println();
		
		int mayores10 = 0;
		int menores10 = 0;
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] >10) {
				mayores10 ++;
			}else {
				menores10 ++;
			}
		}
		
		System.out.println();
		System.out.println("Comienzo Ejercicio 5");
		System.out.println();
		System.out.println("Hay " +mayores10 +" numeros mayores que 10 y " +menores10 +" numeros menores o iguales a 10 en el array");
		System.out.println();
		System.out.println("Fin del Ejercicio 5");
		System.out.println();
		
		int longitudArray = 0;
		System.out.println("Ingrese un numero que sera la cantidad de elementos del Array");
		longitudArray =  teclado.nextInt();
		int array2[] = new int [longitudArray];
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Ingrese un numero ");
			array2[i] = teclado.nextInt();
		}
		System.out.println();
		System.out.println("Comienzo Ejercicio 6");
		System.out.println();
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Ingreso en el Array2[" +i +"] el valor " +array2[i]);
		
		}
		System.out.println();
		System.out.println("Fin del Ejercicio 6");
		System.out.println();
		
		teclado.close();
	}

}
