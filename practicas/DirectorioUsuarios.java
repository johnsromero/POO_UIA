import java.util.*;
class DirectorioUsuarios{
  private Usuario [] user;
  private nElementos;

  public DirectorioUsuarios(){
    nElementos = 3;
    user = new Usuario[nElementos];
  }



  public boolean Iniciarsesion(){
    String nickname, String contrasena;

    Scanner leer = new Scanner(System.in);

    System.out.println("Inicio de sesion:");

    System.out.println("Nickname:");
    nickname = scan.next();
    System.out.println("Contraseña:");
    contrasena = scan.next();

    if(user[i].getNickname() == nickname && user[i].getContrasena() ==contrasena){
      return true;
    }else{
      return false;
    }
  }






}
