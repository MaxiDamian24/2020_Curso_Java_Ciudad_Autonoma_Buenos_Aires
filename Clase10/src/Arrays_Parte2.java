import java.util.Scanner;

public class Arrays_Parte2 {

	public static void main(String[] args) {
		String arrayNombres[] = {"Juan", "Ignacio","Sandra", "Raul", "Natalia", "Federico", "Teresa", "Andres", "Rafael", "Rolando"};
		System.out.println();
		System.out.println("Comienzo del Ejercicio 1");
		System.out.println();
		for(int i = 0; i<arrayNombres.length; i++) {
			System.out.println("En el Array " +(i+1) +" esta el nombre " +arrayNombres[i] +" que tiene " +arrayNombres[i].length() +" caracteres");
		}
		System.out.println();
		System.out.println("Fin del ejercicio 1");
		System.out.println();
		System.out.println("Comienzo del Ejercicio 2");
		System.out.println();
		for (int i = 0; i < arrayNombres.length; i++) {
			System.out.println("En el Array " +(i+1) +" las primeras tres letras son " +arrayNombres[i].substring(0,3));
		}
		System.out.println();
		System.out.println("Fin del ejercicio 2");
		System.out.println();		
		System.out.println("Comienzo del Ejercicio 3");
		System.out.println();
		for (int i = 0; i < arrayNombres.length; i++) {
			System.out.println("En el Array " +(i+1) +" las ultimas tres letras son " +arrayNombres[i].substring(arrayNombres[i].length() -3,arrayNombres[i].length()));
		}
		System.out.println();		
		System.out.println("Fin del Ejercicio 3");
		System.out.println();
		System.out.println("Comienzo del Ejercicio 4");
		System.out.println();
		String arrayUsuario[]= new String[5];
		int arrayMaximo = 0;
		Scanner teclado = new Scanner (System.in);
		
		for(int i = 0; i < arrayUsuario.length; i ++) {
			System.out.println("Ingrese un nombre: ");
			arrayUsuario[i] = teclado.nextLine();
		}
		for (int i = 1; i<arrayUsuario.length ; i++) {
			if(arrayUsuario[arrayMaximo].length()<= arrayUsuario[i].length()) {
			arrayMaximo = i;	
			}
		}
		System.out.println("El nombre con mas caracteres es: " +arrayUsuario[arrayMaximo]);
		System.out.println();
		System.out.println("Fin del Ejercicio 4");
		System.out.println();
		System.out.println("Comienzo del Ejercicio 5");
		System.out.println();
		int conVocales = 0;
		for(int i = 0; i < arrayUsuario.length; i ++) {
			System.out.println("Ingrese un nombre: ");
			arrayUsuario[i] = teclado.nextLine();
			if (arrayUsuario[i].substring(0,1).equalsIgnoreCase("a") ||
				arrayUsuario[i].substring(0,1).equalsIgnoreCase("e") ||
				arrayUsuario[i].substring(0,1).equalsIgnoreCase("i") ||
				arrayUsuario[i].substring(0,1).equalsIgnoreCase("o") ||
				arrayUsuario[i].substring(0,1).equalsIgnoreCase("u")){
				conVocales ++;
				
			}
			
		}
		System.out.println("Hay " +conVocales +" palabras que comienzan con una vocal");
		System.out.println();
		System.out.println("Fin del Ejercicio 5");
		System.out.println();

		teclado.close();
	}

}
