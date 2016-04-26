import java.util.*;
class DirectorioUsuarios{
  private Usuario [] user;
  private int nElementos;

  public DirectorioUsuarios(){
    nElementos = 3;
    user = new Usuario[nElementos];
  }




  public boolean Iniciarsesion(String nickname, String contrasena){
    int i=0;
      Usuario persona = new Usuario();

    Scanner scan = new Scanner(System.in);

    System.out.println("Inicio de sesion:");

    System.out.println("Nickname:");
    nickname = scan.next();
    System.out.println("Contraseña:");
    contrasena = scan.next();

    if(persona.getNickname().equals(nickname) && persona.getContrasena().equals(contrasena)){
      return true;
    }else{
      return false;
    }
  }






}
