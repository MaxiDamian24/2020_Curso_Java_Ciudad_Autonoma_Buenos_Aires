import java.util.Scanner;

public class EjercicioClase {

	public static void main(String[] args) {
		String usuario = "dany";
		String usuarioIngresado;
		String contrasenia = "qwe123";
		String contraseniaIngresada;
		boolean validaOk = false;
		int op, op2;
		double nota;
		
		Scanner teclado = new Scanner (System.in);
		System.out.println("Ingrese nombre de usuario");
		usuarioIngresado = teclado.nextLine();
		System.out.println("Ingrese contrasenia");
		contraseniaIngresada = teclado.nextLine();
		if (contraseniaIngresada.equals(contrasenia) && usuarioIngresado.equals(usuario)) {
			validaOk = true;
		}
		
		if (validaOk) {
			System.out.println("Elija una materia");
			System.out.println("1- Materia1");
			System.out.println("2- Materia2");
			op = teclado.nextInt();
			
		}

	}

}
