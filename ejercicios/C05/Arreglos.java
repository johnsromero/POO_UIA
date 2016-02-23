import java.io.*;
public class Arreglos{
  public static void main(Strings[] args){
    int [] alumnoscalif = new int[20];
    InputStreamReader isr = new InputStreamReader(System.in);

    for(int i = 0; i<20; i++){
      if(i % 2 == 0){
        System.out.println("Introduce la calificacion: ");
        alumnoscalif[i] = (int) isr.readLine();
      }
      System.out.println(i + ":" + alumnoscalif[i]);
    }
  }
}
