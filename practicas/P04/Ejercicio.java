import java.io.*;
public class Ejercicio {
  public static void main(String[] args) throws IOException {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader leer = new BufferedReader(isr);
    System.out.print("Introduzca un texto: ");
    String entrada = leer.readLine();
    for (int i = 0; i <= entrada.length()-1; i++) {

      /*El método charAt devuelve un valor de carácter igual al carácter situado en la posición especificada por index
      y con substring devuelve un cadena con carácter Inicial Incluido y un carácter Final Excluido.*/
      entrada = entrada.charAt(entrada.length()-1) + entrada.substring(0, entrada.length() - 1);
      System.out.println(entrada);
        }
    }
}
