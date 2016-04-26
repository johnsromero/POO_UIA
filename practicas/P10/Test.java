import java.io.*;
public class Test{

   public static void main(String[] args) throws IOException {

     String inombre = " ", idireccion = " ", imail = " ", icontrasena = " ", inickname = " ";
     int idia=0, imes=0, ianio=0, itelefono = 0, icantidadPartidos =0, x;

     BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

     Usuario datos = new Usuario(inombre, idireccion, imail, inickname, icontrasena, itelefono, idia, imes, ianio);
     Usuario iSesion = new Usuario(inickname, icontrasena);
     Partido j1 = new Partido();
     ComprobantePago comprobante1 = new ComprobantePago(datos.getNombre(), datos.getDireccion(), datos.getTelefono(), icantidadPartidos);


     do{

     int menu;
     System.out.println("Quinielapp\n");
     System.out.println("1.-Registro.\n2.-Inicio de sesion.\n3.-Comprobante de pago.\n4.-Jugar.\n");
     menu = Integer.parseInt(entrada.readLine());


     switch(menu){

       case 1:
     System.out.println("\n REGISTRO \n");

     System.out.print("Nombre: ");
     inombre = entrada.readLine();

     System.out.print("Telefono: ");
     itelefono = Integer.parseInt(entrada.readLine());

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
        datos.setFecha(idia, imes, ianio);

        System.out.println("\nDATOS\n");
        System.out.println("Nombre: "+ datos.getNombre());
        System.out.println("Nickname: "+ datos.getNickname());
        System.out.println("Mail: " +datos.getMail());
        System.out.println(datos.getFecha());
        System.out.println("Telefono: " + datos.getTelefono());
        System.out.println("Direccion: " +datos.getDireccion());

        break;

        case 2:

        boolean valida = iSesion.Iniciarsesion();

        iSesion.Iniciarsesion();
        if(iSesion.Iniciarsesion() == true){
          System.out.println("Bienvenido");
        }else{
          System.out.println("Contrasena o nickname incorrecto");
        }

        break;

        case 3:

        int opc;

        System.out.println("¿Cuantos partido desea jugar?");
        opc = Integer.parseInt(entrada.readLine());

        comprobante1.setcantidadPartidos(opc);

        comprobante1.mostrarComprobante();
        break;

        case 4:
        System.out.println(j1.ganaOpierde());
        break;
 }


 System.out.println("Presione [1] Para regresar al menu principal");
 x = Integer.parseInt(entrada.readLine());


 }while(x == 1);





  }
}
