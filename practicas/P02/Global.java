public class Global{

		byte h = 1;
		short i = 10;
		int j = 100;
		long k = 1000;
		char l = 'z';
		float m = 10000.00f;
		double n = 1000000.000000;
	

	public static void main(String[] args){

		Global nwObjeto = new Global();

		byte a = 127;
		short b = 32767;
		int c = 2000000;
		long d = 200000000;
		char e = '\u0061';
		float f = 923.9945f;
		double g = 123.4567890;

		System.out.println("\tTipos de datos primitivos\n\n");
		System.out.println("Enteros\n");
		System.out.println("Tipo de dato byte: " + a + " y " + nwObjeto.h);
		System.out.println("Tipo de dato short: " + b + " y " + nwObjeto.i);
		System.out.println("Tipo de dato int: " + c + " y " + nwObjeto.j);
		System.out.println("Tipo de dato long: " + d + " y " + nwObjeto.k);
		System.out.println("Tipo de dato char: " + e + " y " + nwObjeto.l);
		System.out.println("\nRelaes\n");
		System.out.println("Tipo de dato float: " + f + " y " + nwObjeto.m);
		System.out.println("Tipo de dato double: " + g + " y " + nwObjeto.n);

	}
}