import java.util.*;
class Usuario{

  private String nombre, direccion, mail, nickname, telefono, contrasena;
  private int dia, mes, anio;

    public Usuario(){

    }

    public Usuario(String inombre, String idireccion, String imail, String inickname, String icontrasena, String itelefono){
      nombre = inombre;
      direccion = idireccion;
      mail = imail;
      nickname = inickname;
      contrasena = icontrasena;
      telefono = itelefono;
    }

    public Usuario(int idia, int imes, int ianio){
      dia = idia;
      mes = imes;
      anio = ianio;
    }



    public void setNombre(String inombre){
        nombre = inombre;
      }

      public String getNombre(){
        return "Nombre: " + nombre;
      }


      public void setTelefono(String itelefono){
        telefono = itelefono;
      }
      public String getTelefono(){
        return "Telefono: " + telefono;
      }


      public void setDireccion(String idireccion){
        direccion = idireccion;
      }
      public String getDireccion(){
        return "Direccion: " + direccion;
      }


      public void setMail(String imail){
        mail = imail;
      }
      public String getMail(){
        return "Correo Electronico: " + mail;
      }


      public void setNickname(String inickname){
        nickname = inickname;
      }
      public String getNickname(){
        return "Nickname: " + nickname;
      }


      public void setContrasena(String icontrasena){
          contrasena = icontrasena;
        }

        public String getContrasena(){
          return "Contrasena: " + contrasena;
        }


      public void setFecha(int idia, int imes, int ianio){
        dia = idia;
        mes = imes;
        anio = ianio;
      }

      public String getFecha(){
        return "Fecha de nacimiento: " + dia + "/" + mes + "/" + anio;
      }



    }
