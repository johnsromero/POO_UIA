import java.util.*;
public class Ejercicio3{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int a, b, aux, suma=0;
    String numeros="";

    System.out.println("\nIntroduce dos valores para calcular la suma de los multiplos de 5 comprendidos entre esos dos valores\n");
    System.out.print("Introduce el primer vaolor: ");
    a = sc.nextInt();
    System.out.print("Introduce el segundo valor: ");
    b = sc.nextInt();
    System.out.println("\n\n");

    if (a < 0 || b < 0){
      System.out.println("Has introducido un numero negativo. Solo numeros positivos");
      return;
    }

    if (a > b){
      aux = a;
      a = b;
      b = aux;
    }

        for(int i = a; i <= b; i = i + 5){
            numeros = numeros + " " + i;
            suma = suma + i;
        }
        System.out.println("Los multiplos son:" + numeros + "\n");
        System.out.println("La suma de todos los multiplos es: " + suma);

  }
}
