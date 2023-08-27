package Clase12;

public class Main {

	public static void main(String[] args) {
		
		Persona persona1 = new Persona("Daniel",50,95,"Marron" );
		System.out.println("Nombre: " +persona1.Nombre + " \nEdad: "+ persona1.Edad + "\nPeso: " + persona1.Peso + "\nColor: " + persona1.ColorOjos);
		
		Auto auto1 = new Auto("Fiat", "1500", 5, 100000,"Joya nunca Taxi");
		System.out.println("");
		System.out.println("Modelo: " +auto1.Modelo + " \nModelo: "+ auto1.Modelo + "\nPuertas: " + auto1.Puertas + "\nKilometros: " + auto1.Kilometros);

		Arbol arbol1 = new Arbol("Bonsai", "Enano", 1, 2,"No");
		System.out.println("");
		System.out.println("Nombre: " +arbol1.Nombre + " \nApodo: "+ arbol1.Apodo + "\nAltura: " + arbol1.Altura + "\nExtinto: " + arbol1.Extinto);
		System.out.println("");
		
		persona1.Correr();
		System.out.println(persona1.Comer());
		System.out.println(persona1.Correr());
		System.out.println(persona1.Edad);
		persona1.CumplirAnios();
		persona1.CumplirAnios();
		System.out.println(persona1.Edad);
		persona1.CambiarNombre("Federico");
		
		Operacion operacion = new Operacion();
		
		System.out.println("La suma de 3 + 5 es: " + operacion.Sumo(3,5));
		System.out.println("La resta de 10 - 5 es: " + operacion.Resto(10,5));
		System.out.println("La suma de 8 * 10 es: " + operacion.Multiplico(8,10));
		System.out.println("La suma de 9 dividido 3 es: " + operacion.Divido(9,3));

	}
	
}
