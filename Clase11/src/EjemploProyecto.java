import java.util.Scanner;
public class EjemploProyecto {

	public static void main(String[] args) {
		int valorSeleccionado = 0;
		String arrayUsuarios[]= new String[100];
		Scanner tecladoInt = new Scanner (System.in);
		Scanner tecladoString = new Scanner (System.in);
		int contadorUsuario = 0;
		do {
			System.out.println("Ingrese una Opcion:");
			System.out.println("1) Crear usuario.");
			System.out.println("2) Ver lista de usuarios.");
			System.out.println("3) Ver la cantidad de usuarios extistentes.");
			System.out.println("4) Verificar si X usuario existe.");
			System.out.println("5) Ver el nombre de usuario más largo.");
			System.out.println("6) Ver nombre de usuario más corto.");
			System.out.println("7) Ver las primeras tres letras de cada ususario.");
			System.out.println("8) Salir.");
			valorSeleccionado = tecladoInt.nextInt();
			switch(valorSeleccionado) {
				case 1:
				do {
					System.out.println("Ingrese un nombre de usuario con mas de tres caracteres: ");
					arrayUsuarios[contadorUsuario]= tecladoString.nextLine();
					if(arrayUsuarios[contadorUsuario].length()<4) {
						System.out.println("El nombre de usuario " + arrayUsuarios[contadorUsuario]);
						System.out.println("DEBE TENER MAS DE TRES CARACTERES");
					}				
				}while (arrayUsuarios[contadorUsuario].length() <4);
				contadorUsuario = contadorUsuario +1;
				break;
				case 2:
					for (int i = 0; i < contadorUsuario; i++) {
						System.out.println("el usuario " +(i+1) +(" es ") +arrayUsuarios[i]);
						
					}
					System.out.println();
				break;
				case 3:
					System.out.println("Usted ingreso " + contadorUsuario +(" usuarios"));
					System.out.println();
				break;
				case 4: 
					System.out.println("Ingrese el nombre de usuario a buscar");
					String usuarioABuscar = tecladoString.nextLine();
					for(int i = 0; i < contadorUsuario; i++) {
						if (arrayUsuarios[i].equals(usuarioABuscar)){
							System.out.println("El usuario " +arrayUsuarios[i] +(" existe"));
							i = arrayUsuarios.length + 1 ;
						}
						if(i==(contadorUsuario-1)) {
							System.out.println("El Usuario " +usuarioABuscar +(" no existe"));
						}
					}
					System.out.println();
					break;
				case 5:
					String usuarioMasLargo = arrayUsuarios[0];
					for(int i = 1; i < contadorUsuario ; i++) {
						if (usuarioMasLargo.length() < arrayUsuarios[i].length()) {
							usuarioMasLargo = arrayUsuarios[i]; 
						}
					}
					System.out.println("El usuario con nombre mas largo es: " +usuarioMasLargo);
					System.out.println();
					break;
				case 6:
					String usuarioMasCorto = arrayUsuarios[0];
					for(int i = 1; i < contadorUsuario ; i++) {
						if (usuarioMasCorto.length() > arrayUsuarios[i].length()) {
							usuarioMasCorto = arrayUsuarios[i]; 
						}
					}
					System.out.println("El usuario con nombre mas corto es: " +usuarioMasCorto);
					System.out.println();
					break;
				case 7:
					for(int i = 0; i < contadorUsuario; i++) {
						System.out.println("Las tres primeras letras del Usuario " +arrayUsuarios[i] +" son " +arrayUsuarios[i].substring(0,3));
					}
				    System.out.println();
				    break;
				case 8:
					System.out.println("Fin de EjemploProyecto");
					System.out.println();
				break;
				default :
					System.out.println("Debe ingresar un numero entre 1 y 8, ingreso:  " +valorSeleccionado);
				break;
			}
			if (valorSeleccionado != 8) {
			System.out.println("Presione una tecla para seguir");
			String unaTecla = tecladoString.nextLine();
			}
		}while (valorSeleccionado != 8);
		tecladoInt.close();
		tecladoString.close();
		

	}

}
