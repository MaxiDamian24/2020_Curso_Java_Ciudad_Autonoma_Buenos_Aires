import java.util.Scanner;
import java.io.*;

public class Proyecto_Julio {
	private static BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in));
	private static boolean x = true;

	public static void main(String[] args)throws IOException {
		int valorSeleccionado = 0;
		int arraySueldos[]= new int[100];
		Scanner tecladoInt = new Scanner (System.in);
		Scanner tecladoString = new Scanner (System.in);
		int contadorSueldo = 0;
		
		do {
			System.out.println("Ingrese una Opcion:");
			System.out.println("1) Ingresar un sueldo.");
			System.out.println("2) Ver lista de sueldos.");
			System.out.println("3) Ver la cantidad de sueldos ingresados.");
			System.out.println("4) Ver mayor sueldo.");
			System.out.println("5) Ver menor sueldo.");
			System.out.println("6) Ver la suma de todos los sueldos.");
			System.out.println("7) Ver promedio de tosdos los sueldos.");
			System.out.println("8) Ver los sueldos netos.");
			System.out.println("9) Salir.");
			valorSeleccionado = tecladoInt.nextInt();
			switch(valorSeleccionado) {
				case 1:
					x = true;
					while(x){
						System.out.println("Introduce un Sueldo");
						try{
						arraySueldos[contadorSueldo]= Integer.parseInt(stdIn.readLine());
						contadorSueldo = contadorSueldo +1;
						x= false;
						}catch(NumberFormatException nfe){
						System.out.println("Solamente puedes escribir números");
						}
					}
				break;
				case 2:
					for (int i = 0; i < contadorSueldo; i++) {
						System.out.println("el sueldo " +(i+1) +(" es de: $") +arraySueldos[i]);
						
					}
					System.out.println();
				break;
				case 3:
					int totalSueldos = 0;
					for (int i = 0; i < contadorSueldo; i++) {
						totalSueldos ++; 
					}
					System.out.println("Se ingresron " + totalSueldos +" sueldos.");
					System.out.println();
				break;
				case 4: 
					int mayorSueldo = arraySueldos[0];
					for(int i = 1; i < contadorSueldo ; i++) {
						if (mayorSueldo < arraySueldos[i]) {
							mayorSueldo = arraySueldos[i]; 
						}
					}
					System.out.println("El mayor sueldo es $" +mayorSueldo);
					System.out.println();
					break;
				case 5:
					int menorSueldo = arraySueldos[0];
					for(int i = 1; i < contadorSueldo ; i++) {
						if (menorSueldo > arraySueldos[i]) {
							menorSueldo = arraySueldos[i]; 
						}
					}
					System.out.println("El menor sueldo es de $" +menorSueldo);
					System.out.println();
					break;
				case 6:
					int sumaDeSueldos = 0;
					for (int i = 0; i < contadorSueldo; i++) {
						sumaDeSueldos += arraySueldos[i]; 
					}
					System.out.println("El total de sueldos es: $" + sumaDeSueldos);
					System.out.println();
								
					break;
				case 7:
					sumaDeSueldos = 0;
					for (int i = 0; i < contadorSueldo; i++) {
						sumaDeSueldos += arraySueldos[i]; 
					}
					System.out.println("El promedio de sueldos es: $" + (sumaDeSueldos / contadorSueldo));
					System.out.println();
				    break;
				case 8:
					int sumaDeSueldosNetos = 0;
					for (int i = 0; i < contadorSueldo; i++) {
						System.out.println("El sueldo neto de $" + arraySueldos[i] +" es $" +(arraySueldos[i]*.83));
						sumaDeSueldosNetos += (arraySueldos[i]*.83); 
					}
					System.out.println("El promedio de los sueldos netos es: $" + (sumaDeSueldosNetos / contadorSueldo));
					System.out.println();
					break;
				case 9:
					System.out.println("Fin del Proyecto");
					System.out.println();
				break;
				default :
					System.out.println("Debe ingresar un numero entre 1 y 9, ingreso:  " +valorSeleccionado);
				break;
			}
			if (valorSeleccionado != 9) {
			System.out.println("Presione una tecla para seguir");
			String unaTecla = tecladoString.nextLine();
			}
		}while (valorSeleccionado != 9);
		tecladoInt.close();
		tecladoString.close();
	}
}
