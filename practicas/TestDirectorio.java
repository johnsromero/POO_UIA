import java.io.*;
import java.util.*;
public class TestDirectorio{


  public static void main(String[] args)throws IOException {
    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


    Usuario user = new Usuario();

    String inombre = " ", idireccion = " ",imail = " ", inickname = " ", icontrasena = " ", itelefono = " ";
    int idia = 0, imes = 0, ianio =0, i=0;

      for(i=0; i < 3;i++){

        System.out.print("Nombre: ");
        inombre = entrada.readLine();

        System.out.print("Telefono: ");
        itelefono = entrada.readLine();

        System.out.print("Direccion: ");
        idireccion = entrada.readLine();

        System.out.print("Correo Electronico: ");
        imail = entrada.readLine();

        System.out.print("Nickname: ");
        inickname = entrada.readLine();

        System.out.print("Contraseña: ");
        icontrasena = entrada.readLine();

        do{
        System.out.println("Fecha de nacimiento (dd/mm/aaaa) : ");
        System.out.print("Dia:"); idia = Integer.parseInt(entrada.readLine());
        System.out.print("Mes:"); imes = Integer.parseInt(entrada.readLine());
        System.out.print("Anio:"); ianio = Integer.parseInt(entrada.readLine());
        if(ianio > 1998){
          System.out.println("\nDebes ser mayor de edad para poder registrarte.\n");
        }else{
          ianio = ianio;
        }
      }while(ianio > 1998);

      System.out.println("\n--------------------------------------------------\n");

        Usuario persona = new Usuario();

        persona.setNombre(inombre);
        persona.setTelefono(itelefono);
        persona.setDireccion(idireccion);
        persona.setMail(imail);
        persona.setNickname(inickname);
        persona.setContrasena(icontrasena);
        persona.setFecha(idia, imes, ianio);

        //user[i] = persona;
      }



      //Iniciarsesion();


  }
}
