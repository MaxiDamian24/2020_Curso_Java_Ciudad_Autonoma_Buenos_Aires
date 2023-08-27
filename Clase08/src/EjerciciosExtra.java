import java.util.Scanner;
public class EjerciciosExtra {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int edad = 0;
		int sumoEdad = 0;
		int mayoresDe18 = 0;
		int menoresDe18= 0;
		int pidoNumero = 0;
		System.out.println("Ingrese un numero ");
		pidoNumero= teclado.nextInt();
		for(int i = 0; i< pidoNumero; i++) {
			System.out.println("Ingrese una edad: ");
			edad= teclado.nextInt();
			sumoEdad += edad;
			if (edad >= 18) {
				mayoresDe18 ++;
			}else {
				menoresDe18 ++;
			}
			if (i+1>=pidoNumero) {
				System.out.println(" El promedio de edad ingresada es: " +(sumoEdad /(mayoresDe18 + menoresDe18)));
				System.out.println("Ingreso " +mayoresDe18 +" edades mayores de 18 años");
				System.out.println("Ingreso " +menoresDe18 +" edades menores de 18 años");
			}
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio Extra 1");
		System.out.println("");
		
		for (int i=1; i<=10; i++) {
			System.out.println("Tabla del " +i);
			for (int j = 0; j<= 10; j++) {
			System.out.println("" +i +" * " +j +" = " + (i*j) );
			}
		}
		System.out.println("");
		System.out.println("Fin del Ejercicio Extra 2");
		System.out.println("");
			
				teclado.close();

	}

}
