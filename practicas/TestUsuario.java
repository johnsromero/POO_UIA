import java.io.*;
public class TestUsuario{

  public static void main(String[] args)throws IOException {

    BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
    String inombre = " ", itelefono = " ", idireccion = " ", imail = " ", icontrasena = " ", inickname = " ";
    int idia=0, imes=0, ianio=0;

    Usuario datos = new Usuario(inombre, itelefono, idireccion, imail, inickname, icontraseña);
    Usuario fecha = new Usuario(idia, imes, ianio);
    Usuario def = new Usuario();


      System.out.println("\n REGISTRO \n");

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

         datos.setNombre(inombre);
         datos.setTelefono(itelefono);
         datos.setDireccion(idireccion);
         datos.setMail(imail);
         datos.setContrasena(icontrasena);
         datos.setNickname(inickname);
         fecha.setFecha(idia, imes, ianio);

         System.out.println("\nDATOS\n");
         System.out.println(datos.getNombre());
         System.out.println(datos.getTelefono());
         System.out.println(datos.getDireccion());
         System.out.println(datos.getMail());
         System.out.println(datos.getNickname());
         System.out.println(fecha.getFecha());

    }
}
