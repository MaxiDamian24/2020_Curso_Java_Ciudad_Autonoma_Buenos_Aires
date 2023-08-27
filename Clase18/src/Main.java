import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
/*		int numero = 11;
		List<Integer> lista = new ArrayList<>();
				
		// llenar la lista .add()
		lista.add(10);
		lista.add(5);
		lista.add(2);
		lista.add(numero);
		lista.add(10);
		
		//Conocer tamaño de la lista .size()
		System.out.println("El tamaño de la lista es: " + lista.size());
		
		//Saber si la lista esta vacia .isEmpty()
		System.out.println("¿La lista esta vacia? " + lista.isEmpty());
		
		//limpiar/borrar lista .clear()
		lista.clear();
		System.out.println("¿La lista esta vacia? " + lista.isEmpty());
		
		//llamar un elemento de una lista .get(), la posicion comienza en 0
		lista.add(10);
		lista.add(5);
		lista.add(2);
		lista.add(numero);
		lista.add(10);		
		System.out.println("El elemento de la posicion 3 es:  " + lista.get(3));
		
		//Recorrido de lista con for comun
		
		for(int i=0; i < lista.size();i++) {
			System.out.println("  for comun: " + lista.get(i));
		}
		// for dinamico
		
		for(Integer aux: lista) {
			System.out.println(" for dinamico: " + aux);
		}
		
		// metodo contains
		System.out.println("¿el elemento 10 pertenece a la lista? " + lista.contains(10));
		
		// metodo remove
		
		for(Integer aux: lista) {
			System.out.println(" for dinamico: " + aux);
		}
		
		System.out.println("Elimino el numero 11 ");
		lista.remove(3);
		for(Integer aux: lista) {
			System.out.println(" for dinamico: " + aux);
		}
*/	
		
		List<String> listaString = new ArrayList<>();
		

		listaString.add("Primero");
		listaString.add("Segundo");
		listaString.add("Tercero");
		listaString.add("Cuarto");
		listaString.add("Quinto");
		
		System.out.println("El tamaño de la lista es: " + listaString.size());
		

		System.out.println("¿La listaString esta vacia? " + listaString.isEmpty());

		for(int i=0; i < listaString.size();i++) {
			System.out.println("  for comun: " + listaString.get(i));
		}

		
		for(String aux: listaString) {
			System.out.println(" for dinamico: " + aux);
		}
		
		System.out.println("El elemento de la posicion 2 es:  " + listaString.get(2));
		
		System.out.println("Elimino el elemento Tercero");
		listaString.remove(2);
		System.out.println("¿el elemento Tercero pertenece a la lista? " + listaString.contains("Tercero"));
		
		System.out.println("Borro los elementos de la lista ");
		
		listaString.clear();
		
		for(String aux: listaString) {
			System.out.println(" for dinamico: " + aux);
		}
		for(int i=0; i < listaString.size();i++) {
			System.out.println("  for comun: " + listaString.get(i));
		}
		if(listaString.size() == 0) {
			System.out.println("La listaString esta vacia");
		}
				
	}


	
	
}
