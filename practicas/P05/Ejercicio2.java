import java.io.*;
import java.util.*;
public class Ejercicio2{
  public static void main(String[] args) {

    int elementos, i = 0, j = 0, k = 0, numero = 0, entrada = 0, num = 0, contador = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("\n----Introducir el numero de elementos del arreglo.---- ");
    elementos = entrada = sc.nextInt();

    int[] array = new int[elementos];
    int[] result = new int[elementos];

    System.out.println("\n----Se ha generado un arreglo de valores aleatorios entre 1 y 300----\n");

    for (i = 0; i < elementos; i++) {
      Random rd = new Random();
      numero = rd.nextInt(300) + 1;
      array[i] = numero;
      }

    for (i = 0; i < elementos; i++) {
      System.out.println("Elemento " + (i + 1) + " del arreglo: " + array[i]);
      }

    do {
      System.out.println("\nIngresa un numero entre 0 y 9:");
      num = sc.nextInt();
    } while (!(num >= 0 && num <= 9));

    for (i = 0; i < elementos; i++) {
    if (array[i] % 10 == num) {
      result[i] = array[i];
      contador++;
      }
    }

    if (contador == 0) {
        System.out.println("\n----No se encontraron numeros en el arreglo con la terminacion: " + num + "----");
        }

    System.out.println();
    for (i=0;i<elementos;i++){
     if(result[i]!='0'){
      System.out.println(result[i]);
       }
     }

}
}
