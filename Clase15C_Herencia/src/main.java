
public class main {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Ariel","Gomez",26);
		persona1.CumplirAnios();
		
		Empleado empleado1 = new Empleado("Juan", "Ramirez", 34, 10000);
		empleado1.CumplirAnios();
		empleado1.AumentarSueldo();
		System.out.println("/////////////////////////////////////////////");
		System.out.println("/////////////////////////////////////////////");
		Auto unAuto = new Auto(5, 200, "ford");
		
		System.out.println("Un auto " + unAuto.getMarca() + " tiene una velocidad maxima de: " +unAuto.getVelocidadMaxima()+" km/h");
		System.out.println("Un auto " + unAuto.getMarca() + " recorre una distancia de: " +unAuto.distancia()+ " Kilometros");
		System.out.println("/////////////////////////////////////////////");
		ModeloAuto unModeloAuto = new ModeloAuto(5, 200, "ford", "falcon");
		System.out.println("Un auto " + unModeloAuto.getModelo() + " tiene un consumo: " + unModeloAuto.consumo()+" km/h");
		System.out.println("Un auto " + unModeloAuto.getModelo() + " tiene una velocidad Maxima de: " + unModeloAuto.getVelocidadMaxima()+ " Kilometros");

	}

}
