import java.util.*;
class Partido{

  private String [] equipos1;
  private String [] equipos2;
  private int jornada;
  private int totalGoles;
  private int noElementos;
  private int opcion;

  public Partido(){
    noElementos = 9;
    equipos1 = new String[noElementos];

    equipos1[0] = "Monterrey";
    equipos1[1] = "America";
    equipos1[2] = "Pachuca";
    equipos1[3] = "Leon";
    equipos1[4] = "Santos";
    equipos1[5] = "Cruz Azul";
    equipos1[6] = "Morelia";
    equipos1[7] = "Guadalajara";
    equipos1[8] = "Tigres";

    equipos2 = new String[noElementos];
    equipos2[0] = "Tijuana";
    equipos2[1] = "Pumas";
    equipos2[2] = "Puebla";
    equipos2[3] = "Toluca";
    equipos2[4] = "Queretaro";
    equipos2[5] = "Chiapas";
    equipos2[6] = "Dorados";
    equipos2[7] = "Veracruz";
    equipos2[8] = "Atlas";

  }
  Scanner sc = new Scanner(System.in);

  public void setJornada(int ijornada){
    jornada = ijornada;
  }

  public int getJornada(){
    return jornada;
  }

  public void setTotalGoles(int itotalGoles){
    totalGoles = itotalGoles;
  }

  public int getTotalGoles(){
    return totalGoles;
  }



  public String [] ganaOpierde(){

      for(int i=0;i<equipos1.length;i++){

        System.out.println("\t" + equipos1[i] + "\t\t vs. " + "\t\t" + equipos2[i]);
        System.out.println("\t1.-Gana" + "\t\t2.-Empate" + "\t3.-Gana");
        opcion = sc.nextInt();
        if(opcion == 1){
          System.out.println("\t[ X ]" + "\t\t[  ]" + "\t\t[  ]");
        }else if(opcion == 2){
          System.out.println("\t[  ]" + "\t\t[ X ]" + "\t\t[  ]");
        }else if(opcion == 3){
          System.out.println("\t[  ]" + "\t\t[  ]" + "\t\t[ X ]");
        }
        System.out.println("\n-------------------------------------------------------------------------");
      }
      return equipos1;
    }

    /*public void setTotalGol(int opc){

    System.out.println("Participa para ganar la Bolsa de Gol Millonario por $15 pesos. Si[1, No[cualquier numero]");
    opc = sc.nextInt();
    if(opc == 1){
      System.out.println("Escribe el total de goles anotados en los 9 partidos");
      opc1 = sc.nextInt();
    }else{
      System.out.println("");
  }
  */





}
