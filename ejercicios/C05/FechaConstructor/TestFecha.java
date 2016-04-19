import java.util.*;
public class TestFecha{

public static void visualizaFecha(Fecha ifecha){
  int [] rf = new int [3];
  ifecha.obtenerFecha(rf);
  System.out.println(rf[0] +"/"+ rf[1] + "/"+ rf[2]);
}

  public static void main(String[] args){

    Fecha fecha1 = new Fecha();
    Fecha fecha2 = new Fecha(2);
    Fecha fecha3 = new Fecha(5,3);
    Fecha fecha4 = new Fecha(2,3,2011);

    System.out.println(fecha1);
    System.out.println(fecha2);
    System.out.println(fecha3);
    System.out.println(fecha4);






}
}
