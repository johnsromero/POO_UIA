import java.io.*;
import java.util.Arrays;

public class Ejercicio {
  public static void main(String[] args)throws IOException{

  int elementos, i, k=0;
  double resultado, mediana;

  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

  System.out.println("\n----Introducir el numero de elementos del arreglo. (Debe ser impar)---- ");

  elementos = Integer.parseInt(entrada.readLine());

  int[] array = new int[elementos];

  System.out.println("\n----Introducir los valores del arreglo.----\n");

  for (i =0; i < elementos; i++) {
    System.out.print("Ingrese el elemento "+ (i+1) +" : ");
    array[i] = Integer.parseInt(entrada.readLine());
    System.out.println();
    }

    mediana = elementos / 2;
    Arrays.sort(array);

    System.out.println("\n----Estos son los valores que ha ingresado----\n");

    for (int j : array) {
      System.out.println("El elemento " + (k+1) + " es: " + j);
      k++;
  }

  System.out.println("\n----La mediana de este conjunto de valores es: [ " + array[(int) Math.ceil(mediana)] + " ]----");

}
}
