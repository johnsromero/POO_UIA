import java.io.*;
class Juegos{

  BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

  private String [] equipos1 = new String [9];
  private String [] equipos2 = new String [9];
  private int opcion;
  private int gFavor, gContra;


  public Juegos(){
    equipos1[0] = "Monterrey";
    equipos1[1] = "America";
    equipos1[2] = "Pachuca";
    equipos1[3] = "Leon";
    equipos1[4] = "Santos";
    equipos1[5] = "Cruz Azul";
    equipos1[6] = "Morelia";
    equipos1[7] = "Guadalajara";
    equipos1[8] = "Tigres";

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


  public String [] ganaOpierde(){

    try{

    for(int i=0;i<equipos1.length;i++){

      System.out.println("\t" + equipos1[i] + "\t\t vs. " + "\t\t" + equipos2[i]);
      System.out.println("\t1.-Gana" + "\t\t2.-Empate" + "\t3.-Gana");
      opcion = Integer.parseInt(entrada.readLine());
      if(opcion == 1){
        System.out.println("\t[ X ]" + "\t\t[  ]" + "\t\t[  ]");
      }else if(opcion == 2){
        System.out.println("\t[  ]" + "\t\t[ X ]" + "\t\t[  ]");
      }else if(opcion == 3){
        System.out.println("\t[  ]" + "\t\t[  ]" + "\t\t[ X ]");
      }

      System.out.println("\n-------------------------------------------------------------------------");

    }
  }catch(Exception e){

  }

    return equipos1;

  }


}
