
public class Clase03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minInt = -2147483648 ;
		int maxInt = 2147483647;
		byte minByte = -128;
		byte maxByte = 127;
		long minLong = -9223372036854775808L;
		long maxLong = 9223372036854775807L;
		float minFloat = 1.175494351e-38F;
		float maxFloat = 3.402823466e+38F;
		char char1= 'J';
		boolean minBool = true;
		boolean maxBool = false;
		String string1 = "Hola Mundo";
		System.out.println("int va desde " + minInt + " hasta " + maxInt);
		System.out.println("byte va desde " + minByte + " hasta " + maxByte);
		System.out.println("long va desde " + minLong + " hasta " + maxLong);
		System.out.println("float va desde " + minFloat + " hasta " + maxFloat);
		System.out.println("Un ejemplo de char es " + char1);
		System.out.println("boolean puede ser " + minBool + " o " + maxBool);
		System.out.println("String sirve para texto como este: " + string1);
	}

}
