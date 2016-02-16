import java.io.*;
import java.util.*;
public class Ejercicio2 {
  public static void main(String[] args) throws IOException{

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(isr);


    System.out.print("Introduzca un texto: ");
    String entrada = leer.readLine();
    StringTokenizer num = new StringTokenizer(entrada);


    System.out.println("EL numero de caracteres es: " + entrada.length());
    System.out.println ("El numero de palabras es: "+ num.countTokens());

}
}
