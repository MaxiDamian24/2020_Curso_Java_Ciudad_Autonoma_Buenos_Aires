import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		String nombre;
		int edad;
		String ingresar = "No";
		String materia;
		double nota1Trimestre, nota2Trimestre, nota3Trimestre;
		double promedio = 0;
		double nota1Cuatrimestre, nota2Cuatrimestre;
		Scanner teclado = new Scanner(System.in);
		Scanner teclado2= new Scanner(System.in);
		
		System.out.println("Ingrese su nombre:");
		nombre = teclado.nextLine();
		System.out.println("Ingrese su edad:");
		edad = teclado.nextInt();
		if (edad > 18 ) {
			ingresar = "Universidad";
		}else if (edad >= 13) {
			ingresar = "Secundario";
		}
		
		if (ingresar == "Secundario") {
			System.out.println("Ingrese Materia: ");
			materia = teclado2.nextLine();
			System.out.println("Ingrese la nota del primer trimestre;");
			nota1Trimestre =  teclado.nextDouble();
			System.out.println("Ingrese la nota del segundo trimestre;");
			nota2Trimestre =  teclado.nextDouble();
			System.out.println("Ingrese la nota del tercer trimestre;");
			nota3Trimestre =  teclado.nextDouble();
			promedio = (nota1Trimestre + nota2Trimestre + nota3Trimestre)/3;
			if (promedio >= 6 && promedio <= 10) {
				System.out.println("Aprobo con " + promedio);
			}else if (promedio <6 && promedio >=0){
				System.out.println("Desaprobo con " + promedio);
			}else {
				System.out.println("Promedio no Existe");
			}
		}
		if (ingresar == "Universidad") {
			System.out.println("Ingrese Materia: ");
			materia = teclado2.nextLine();
			System.out.println("Ingrese la nota del primer cuatrimestre: ");
			nota1Cuatrimestre =  teclado.nextDouble();
			System.out.println("Ingrese la nota del segundo cuatrimestre: ");
			nota2Cuatrimestre =  teclado.nextDouble();
			promedio = (nota1Cuatrimestre + nota2Cuatrimestre)/2;
			if (promedio >= 8 && promedio <= 10) {
				System.out.println("Promociono con " + promedio);
			}else if (promedio >= 4 && promedio < 8){
				System.out.println("Aprobo con " + promedio);
			}else if (promedio < 4 && promedio >= 0){
				System.out.println("Desaprobo con " +promedio);
			} else {
				System.out.println("Promedio no existe");
			}
		}
		teclado.close();
		teclado2.close();
		System.out.println("Fin del Ejercicio Extra");

	}

}
