import java.util.Scanner;

public class EjercicioExtra {

	public static void main(String[] args) {
		int numeroIngresado = 0;
		int edadIngresada = 0;
		int sumatoriaEdades = 0;
		int mayoresDe18 = 0;
		int menoresDe18 = 0;

		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Ingrese un numero entero: ");
		numeroIngresado = teclado.nextInt();
		
		while (numeroIngresado > 0) {
			System.out.println("Ingrese una edad: ");
			edadIngresada = teclado.nextInt();
			if (edadIngresada >= 18) {
				mayoresDe18 ++;
			}else {
				menoresDe18 ++;
			}
			sumatoriaEdades += edadIngresada; 
			numeroIngresado --;
		}
		System.out.println("El promedio de edad es " + sumatoriaEdades / (mayoresDe18 + menoresDe18) + " años");
		System.out.println("Se ingresaron " +mayoresDe18 +" edades mayores de 18 años");
		System.out.println("Se ingresaron " +menoresDe18 +" edades menores de 18 años");
		
		int primerDigito = 1;
		int segundoDigito = 0;
		do {
			segundoDigito = 0;
			System.out.println();
			System.out.println("Tabla del " +primerDigito);
			do {
				System.out.println(+primerDigito +" * " +segundoDigito +" = " +primerDigito * segundoDigito);
				segundoDigito ++;
			}while (segundoDigito <= 10);
			primerDigito ++;
		}while (primerDigito <= 10);
		
		
		teclado.close();
	}

}
