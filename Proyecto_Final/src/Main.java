import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		int opcion = 0;
		
		Scanner tecladoNumero = new Scanner(System.in);
		Sistema sistema = new Sistema();

	do {
		sistema.MuestroMenu();
		opcion = tecladoNumero.nextInt();
		switch(opcion) {
		case 1:
			sistema.AgregoEmpleado();
			break;
		case 2: 
			sistema.AgregoJefe();
			break;
		case 3:
			sistema.MuestroEmpleadoJefe();
			break;
		case 4:
			sistema.BuscarEmpleadoJefe();
			break;
		case 5:
			sistema.MayorSueldo();
			break;
		case 6:
			sistema.MenorSueldo();
			break;
		case 7:
			sistema.PromedioSueldos();
			break;
		case 8:
			sistema.AumentarSueldos();
			break;
		case 9:
			sistema.BorrarEmpleadoJefe();
			break;
		case 10:
			opcion = 10;
			System.out.println("Adios, vuelva prontosss!!!!!");
			break;	
		default:
			opcion = 0 ;
			System.out.println("Opcion invalida, debe ingresar un valor entre 1 y 10");
			break;
		}
	
	}while (opcion != 10);

	}

}
