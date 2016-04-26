import java.util.*;
class Usuario{

    private String nombre, direccion, mail, nickname, contrasena;
    private int dia, mes, anio, telefono;

    public Usuario(String inombre, String idireccion, int itelefono){
      nombre = inombre;
      direccion = idireccion;
      telefono = itelefono;
    }

    public Usuario(String inombre, String idireccion, String imail, String inickname, String icontrasena, int itelefono, int idia, int imes, int ianio){
      nombre = inombre;
      direccion = idireccion;
      mail = imail;
      nickname = inickname;
      contrasena = icontrasena;
      telefono = itelefono;
      dia= idia;
      mes = imes;
      anio = ianio;
    }

    public Usuario(String inickname, String icontrasena){
      nickname = inickname;
      contrasena = icontrasena;
    }



      public void setNombre(String inombre){
          nombre = inombre;
        }

        public String getNombre(){
          return nombre;
        }


        public void setTelefono(int itelefono){
          telefono = itelefono;
        }
        public int getTelefono(){
          return telefono;
        }


        public void setDireccion(String idireccion){
          direccion = idireccion;
        }
        public String getDireccion(){
          return direccion;
        }


        public void setMail(String imail){
          mail = imail;
        }
        public String getMail(){
          return mail;
        }


        public void setNickname(String inickname){
          nickname = inickname;
        }
        public String getNickname(){
          return nickname;
        }


        public void setContrasena(String icontrasena){
            contrasena = icontrasena;
          }

          public String getContrasena(){
            return contrasena;
          }


        public void setFecha(int idia, int imes, int ianio){
          dia = idia;
          mes = imes;
          anio = ianio;
        }

        public String getFecha(){
          return "Fecha de nacimiento: " + dia + "/" + mes + "/" + anio;
        }



        public boolean Iniciarsesion(){
          int i=0;

          Scanner scan = new Scanner(System.in);

          System.out.println("Inicio de sesion:");

          System.out.println("Nickname:");
          nickname = scan.next();
          System.out.println("Contraseña:");
          contrasena = scan.next();

          if(getNickname().equals(nickname) && getContrasena().equals(contrasena)){
            return true;
          }else{
            return false;
          }
        }









      }
