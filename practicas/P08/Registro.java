class Registro{


    private String  nombre, mail, usuario, passw;
    private int     edad;

    public Registro(String nom, int ed, String user, String pass, String correo){

	this.nombre =nom;
	this.edad = ed;
	this.usuario = user;
	this.passw= pass;
	this.mail= correo;
    }


    public Registro(String nom, String user, String correo){

    this.nombre =nom;
    this.usuario = user;
    this.mail= correo;
    }



    void Mostrar(){


            System.out.println("Nombre: "+ nombre);
            System.out.println("Correo: "+ mail);
            System.out.println("usuario: "+ usuario);
            System.out.println("Edad: "+ edad);
    }

    public void datos(){
      System.out.println("Nombre: "+ nombre);
      System.out.println("usuario: "+ usuario);
      System.out.println("Correo: "+ mail);
    }




}
