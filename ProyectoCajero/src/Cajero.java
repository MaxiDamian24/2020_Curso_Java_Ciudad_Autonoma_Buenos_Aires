import java.util.Scanner;

public class Cajero {
	private double saldo;
	private  double importe;
	private int opcion;
	Scanner teclado = new Scanner(System.in);
	
	public Cajero(double saldo, int opcion,double importe) {
		 this.saldo = saldo;
		 this.opcion = opcion;
		 this.importe = importe;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getOpcion() {
		return opcion;
	}

	public void setOpcion(int opcion) {
		this.opcion = opcion;
	}
	public void salir() {
		System.out.println("Chau, Vuelva Pronto!!!!! \n");
	}
	
	public void mostrarSaldo() {
		System.out.println("Su saldo es: $"+this.getSaldo() +"\n");
	}
	public void retirarSaldo() {
		System.out.println("Ingrese un Importe: ");
		importe = teclado.nextInt();
		if (importe <= this.saldo) {
			this.setSaldo(this.saldo - importe);
			System.out.println("Operacin exitosa. \n"
					+ "Su nuevo saldo es: $" + this.getSaldo()+"\n");
		}else {
			System.out.println("Saldo insuficiente. \n"
					+ "Solo tiene disponible: $" + this.getSaldo()+"\n");
		}
		
	}
	
	public void depositarSaldo() {
		System.out.println("Ingrese el Importe a depositar: ");
		importe = teclado.nextInt();
		if(importe > 0) {
			this.setSaldo(this.saldo + importe);
			System.out.println("Operacin exitosa. \n"
					+ "Su nuevo saldo es: $" + this.getSaldo()+"\n");
		}else {
			System.out.println("Debe ingresar un valñor mayor a 0\n");
		}
	}
	public void opcionIncorrecta() {
		System.out.println("Debe ingresar un valor entre 1 y 4 \n");
	}
	public void mostrarMenu() {
		System.out.println("Ingrese una Opcion: \n"
				+ "1- Ver Saldo. \n"
				+ "2- Retirar Saldo. \n"
				+ "3- Depositar Saldo. \n"
				+ "4- Salir. \n");

	}

}
