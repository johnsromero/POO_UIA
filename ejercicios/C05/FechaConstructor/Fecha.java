import java.util.*;
public class Fecha{
  private int dia, mes, anio;

  public Fecha(){
    asignarfecha();
  }

  public Fecha(int idia){
    this();
    dia = idia;

    if(!fechaCorrecta()){
      System.out.println("La Fecha no es correcta. Se asigna la fecha actual");
      asignarfecha();
    }
  }

  public Fecha(int idia, int imes){
    this();
    dia = idia;
    mes = imes;

    if(!fechaCorrecta()){
      System.out.println("La Fecha no es correcta. Se asigna la fecha actual");
      asignarfecha();
    }
  }

  public Fecha(int idia, int imes, int ianio){
    dia = idia;
    mes = imes;
    anio = ianio;

    if(!fechaCorrecta()){
      System.out.println("La Fecha no es correcta. Se asigna la fecha actual");
      asignarfecha();
    }
  }


  public void asignarfecha(){
    GregorianCalendar FechaActual = new GregorianCalendar();
    dia = FechaActual.get(Calendar.DAY_OF_MONTH);
    mes = FechaActual.get(Calendar.MONTH)+1;
    anio = FechaActual.get(Calendar.YEAR);
  }

    public void asignarfecha(int idia){
      asignarfecha();
      dia = idia;
    }

    public void asignarfecha(int idia, int imes){
      asignarfecha();
      dia = idia;
      mes = imes;
    }

    public void asignarfecha(int idia, int imes, int ianio){
      dia = idia;
      mes = imes;
      anio = ianio;
    }

    public boolean fechaCorrecta(){
      boolean diaCorrecto, mesCorrecto, anioCorrecto;

      anioCorrecto = (anio>= 1582);
      mesCorrecto = (mes>0) && (mes<=12);

      switch(mes){
        case 2:
        if (bisiesto()){
          diaCorrecto = (dia >= 1) &&  (dia<=29);
        } else{
          diaCorrecto = (dia >= 1) &&  (dia<=28);
        }
        break;
        case 4: case 6: case 9: case 11:
        diaCorrecto = (dia>=1) && (dia<=30);
        break;
        default:
        diaCorrecto = (dia>=1) && (dia<=31);
      }

      return diaCorrecto && mesCorrecto && anioCorrecto;
    }

    protected boolean bisiesto(){
      return (anio%4 == 0);
    }

    public void obtenerFecha(int [] fecha){
      fecha[0] = dia;
      fecha[1] = mes;
      fecha[2] = anio;
    }


}
