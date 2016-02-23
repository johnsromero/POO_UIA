import java.io.*;
public class Ejercicio3 {
  public static void main(String[] args)throws IOException{

    int i, n=10;

    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

    float [] calificacion = new float [n];
    String [] nombre = new String [n];
    String [] nota = new String [4];
    nota[0] = "suspenso.";
    nota[1] = "bien.";
    nota[2] = "notable.";
    nota[3] = "sobresaliente.";

    System.out.println("\nSe almacenara el nombre y calificacion de 10 alumnos.\n");

    for(i=0;i<n;i++){
      System.out.println("Introducir el nombre del alumno ["+ (i+1) +"]:");
      nombre[i] = entrada.readLine();
      do{
      System.out.println("Introduce la calificacion del alumno ["+ (i+1) +"]:");
      calificacion[i] = Float.parseFloat(entrada.readLine());
    }while(!(calificacion[i] >= 0 && calificacion[i] <=10));
    System.out.println();
    }

    for(i=0;i<n;i++){
      if(calificacion[i] >= 0 && calificacion[i] <= 4.9){
      System.out.println("Alumno ["+ (i+1) + "]: " + nombre[i] + ", " + calificacion[i] + ", " + nota[0]);
    }
    else if(calificacion[i] >= 5  && calificacion[i] <= 6.9){
      System.out.println("Alumno ["+ (i+1) + "]: " + nombre[i] + ", " + calificacion[i] + ", " + nota[1]);
    }
    else if(calificacion[i] >= 7  && calificacion[i] <= 8.9){
      System.out.println("Alumno ["+ (i+1) + "]: " + nombre[i] + ", " + calificacion[i] + ", " + nota[2]);
    }
    else if(calificacion[i] >= 9  && calificacion[i] <= 10){
      System.out.println("Alumno ["+ (i+1) + "]: " + nombre[i] + ", " + calificacion[i] + ", " + nota[3]);
    }
  }


  }
}
