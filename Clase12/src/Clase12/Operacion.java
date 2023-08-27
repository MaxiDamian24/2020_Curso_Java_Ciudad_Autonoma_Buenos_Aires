package Clase12;

public class Operacion {
//	int Primero; // caracteristicas o atributos
// 	int Segundo; //idem
	int Total;
	
	public int Sumo (int Primero, int Segundo) {
		Total = Primero + Segundo;
		return Total;
	}
	public int Resto(int Primero, int Segundo) {
		Total = Primero - Segundo;
		return Total;
	}
	public int Multiplico(int Primero, int Segundo) {
		Total = Primero * Segundo;
		return Total;
	}
	public int Divido (int Primero, int Segundo) {
		Total = Primero / Segundo;
		return Total;
	}

}
