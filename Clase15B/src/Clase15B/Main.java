package Clase15B;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		Scanner teclado2 =new Scanner(System.in);
		Empleado pepe = new Empleado("Pepe", 55000);
		Empleado tota = new Empleado("Tota", 65000);
		Empleado pepe2 = new Empleado();
		Empleado tota2 = new Empleado();
		
		System.out.println("El sueldo de " + pepe.getNombre()+ " es: " + pepe.getSueldo() );
		System.out.println(pepe.AumentarSueldo());
		System.out.println("/////////////////////////////////////////////");
		System.out.println("El sueldo de " + tota.getNombre()+ " es: " + tota.getSueldo() );
		System.out.println(tota.DisminuirSueldo());
		
		
		System.out.println("Ingrese el nombre: ");
		pepe2.setNombre(teclado.nextLine());
		System.out.println("Ingrese el Sueldo: ");
		pepe2.setSueldo(teclado.nextInt());
		System.out.println("El sueldo de " + pepe2.getNombre()+ " es: " + pepe2.getSueldo() );
		System.out.println(pepe2.AumentarSueldo());
		System.out.println("/////////////////////////////////////////////");
		
		System.out.println("Ingrese el nombre: ");
		tota2.setNombre(teclado2.nextLine());
		System.out.println("Ingrese el Sueldo: ");
		tota2.setSueldo(teclado2.nextInt());
		System.out.println("El sueldo de " + tota2.getNombre()+ " es: " + tota2.getSueldo() );
		System.out.println(tota2.DisminuirSueldo());
		System.out.println("/////////////////////////////////////////////");
	}

}
