import java.util.*;
public class Ejercicio4{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    int numero = 0;
    int entrada = 0;

    Random rd = new Random();
    numero = rd.nextInt(50) + 1;
    System.out.println("\nSe ha generado un numero aleatorio, intente adivinar cual es.\n");

    while(numero != entrada){
      entrada = sc.nextInt();
       if(entrada < numero){
         System.out.println("\nEl numero que ha introducido es menor al generado, vuelva a intentarlo.\n");
       }else if (entrada > numero){
         System.out.println("\nEl numero que ha introducido es mayor al generado, vuelva a intentarlo.\n");
       }else if (entrada == numero){
          System.out.println("\nFelicidades has acertado el numero generado: " + entrada);

       }
     }

  }
}
