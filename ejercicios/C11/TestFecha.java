import java.util.*;
public class TestFecha{

public static void visualizaFecha(Fecha ifecha){
  int [] rf = new int [3];

  ifecha.obtenerFecha(rf);

  System.out.println(rf[0] +"/"+ rf[1] + "/"+ rf[2]);
}

  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    Fecha fecha1 = new Fecha();

    int dia, mes, anio;

    do{
      System.out.println("Dia:"); dia = scan.nextInt();
      System.out.println("Mes:"); mes = scan.nextInt();
      System.out.println("Anio:"); anio = scan.nextInt();
      fecha1.asignarfecha(dia, mes, anio);
    }while(fecha1.fechaCorrecta());

    visualizaFecha(fecha1);
  }
}
