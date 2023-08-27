import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int opcion;
//		double importe = 0;
		Scanner teclado = new Scanner(System.in);
		Cajero cajeroAutomatico = new Cajero (500,10,0);
		do {
			cajeroAutomatico.mostrarMenu();
			opcion = teclado.nextInt();
			switch(opcion) {
			case 1:
				cajeroAutomatico.mostrarSaldo();
				break;
			case 2: 
				cajeroAutomatico.retirarSaldo();
				break;
			case 3:
				cajeroAutomatico.depositarSaldo();
				break;
			case 4:
				cajeroAutomatico.salir();
				break;
			default:
				cajeroAutomatico.opcionIncorrecta();
				break;
			}
		
		}while(opcion !=4);

	}

}
