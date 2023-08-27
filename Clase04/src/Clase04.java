
public class Clase04 {

	public static void main(String[] args) {
		// Ejercicios de Operadores
		int resultado = 0;
		Boolean valorDeVerdadA = false;
		Boolean valorDeVerdadB = false;
		Boolean valorDeVerdad = false;
		
		//Ejercicio 1
		resultado = 5*(3+6);
		System.out.println("El resultado de 5*(3+6) es: " + resultado);
		
		//Ejercicio 2
		resultado = 6/3+5*(1+2);
		System.out.println("El resultado de 6/3+5*(1+2) es: " + resultado);
		
		//Ejercicio 3
		resultado = 2*4/6+3-2*5;
		System.out.println("El resultado de 2*4/6+3-2*5  es: " + resultado);
		
		//Ejercicio 4
		valorDeVerdadA = true;
		valorDeVerdadB = false;
		valorDeVerdad = valorDeVerdadA || valorDeVerdadB;
		System.out.println("El valor de verdad de Verdadero || Falso es: " + valorDeVerdad);
		valorDeVerdad = valorDeVerdadA && !valorDeVerdadB;
		System.out.println("El valor de verdad de Verdadero && NoFalso es: " + valorDeVerdad);
		valorDeVerdad = !valorDeVerdadA || !valorDeVerdadB;
		System.out.println("El valor de verdad de NoVerdadero || NoFalso es: " + valorDeVerdad);
		valorDeVerdad = !(valorDeVerdadA && valorDeVerdadB);
		System.out.println("El valor de verdad de No(Verdadero && Falso) es: " + valorDeVerdad);

	}

}
