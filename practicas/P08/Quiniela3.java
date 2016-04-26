import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Quiniela3{

	static String [] nombre;
	static String [] mail;
	static String [] usuarios;
	static String [] passws;
	static int    [] edad;
	static String entrada;
	static int    contador=0, aux=0, opcion=0;

	public static void main(String[]args)throws IOException{



		nombre = new String[20];
		mail = new String[20];
		usuarios = new String[20];
		passws = new String[20];
		edad = new int[20];

		System.out.println("\nQuinielapp\n\n");

		Menu();

	}

	public static void Menu()throws IOException{
				Juegos boleto = new Juegos();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		do{

			System.out.println("Seleccione una opcion:\n"
			+"\n1.- Registrar"
			+"\n2.- Mostrar Registro"
			+"\n3.- Jugar"
			+"\n4.- Salir");


			opcion=0;
			aux=0;

			System.out.print("\n");
			entrada=br.readLine();

			boolean ValAux =ValidaNumero(entrada);

			if(ValAux==true){
				opcion= Integer.parseInt(entrada);
				aux=1;
			}else{

				System.out.println("\nOpcion invalida.\n");
			}

			switch(opcion){

				case 1:	Registrar();

				break;

				case 2:
				

				break;

				case 3:
				Boleto jugador1 = new Boleto("00001", 15, 9);
				Registro usuario2 = new Registro(nombre[contador],usuarios[contador], mail[contador]);


				System.out.println("Datos del Boleto\n\n");
				System.out.print("Numero de boleto: ");
				System.out.println(jugador1.getJugador());
				System.out.print("Jornada: ");
				System.out.println(jugador1.getJornada());
				System.out.print("Numero de partidos: ");
				System.out.println(jugador1.getPartidos());

				usuario2.datos();

				 System.out.println(boleto.ganaOpierde());

				break;

				case 4:Salir();
			}


		}while(opcion!=4);
	}


    public static void Registrar()throws IOException{

            BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

            do{

                    aux=0;
                    entrada="";

                    System.out.print("Nombre: ");
                    String entrada = br.readLine();
                    aux= Comparar(nombre,entrada);

                            do{
                                    String entradaAux="";
                                    aux=0;
                                    entrada="";

                                    System.out.print("Usuario: ");
                                    entrada = br.readLine();

                                    aux=Comparar(usuarios, entrada);

                                    if(aux==0){

                                            System.out.println("El usuario que ingreso ya existe.");

                                    }

                                    else{

                                            System.out.println("Confirma tu usuario:");
                                            entradaAux = br.readLine();

                                            if(entrada.equalsIgnoreCase(entradaAux)){

                                                    usuarios[contador]=entrada;
                                                    aux=2;

                                            }

                                            else{

                                                    System.out.println("El usuario no coincide.");

                                            }
                                    }


                            }while(aux!=2);

                            do{

                                    opcion=0;
                                    aux=0;

                                    System.out.print("Edad:");
                                    entrada=br.readLine();

                                    boolean ValAux =ValidaNumero(entrada);

                                    if(ValAux==true){

                                            opcion= Integer.parseInt(entrada);

                                            if(opcion>=18 && opcion<100){

                                                    edad[contador]=opcion;
                                                    aux=1;

                                            }

                                            else{
                                                    System.out.println("Lo sentimos no eres mayor de edad");
                                                    Salir();
                                            }

                                    }

                                    else{

                                            System.out.println("Ingresa una opcion valida.");
                                    }

                            }while(aux!=1);



                            do{
                                    String entradaAux="";
                                    aux=0;
                                    entrada="";

                                    System.out.print("Correo: ");
                                    entrada = br.readLine();

                                    aux=Comparar(mail, entrada);

                                    if(aux==0){

                                            System.out.println("El correo que ingreso ya existe");

                                    }

                                    else{

                                            System.out.println("Confirmar correo");
                                            entradaAux = br.readLine();

                                            if(entrada.equalsIgnoreCase(entradaAux)){

                                                    mail[contador]=entrada;
                                                    aux=2;

                                            }

                                            else{

                                                    System.out.println("Confirmar correo");

                                            }
                                    }


                            }while(aux!=2);

                            do{

                                    String entradaAux="";
                                    aux=0;
                                    entrada="";

                                    System.out.print("Contraseña: ");
                                    entrada = br.readLine();

                                    System.out.println("Confirmar contraseña: ");
                                    entradaAux = br.readLine();

                                    if(entrada.compareTo(entradaAux)!=0){

                                            System.out.println("Confirmar contraseña");

                                    }

                                    else{

                                            passws[contador]=entrada;
                                            aux=1;
                                    }

                            }while(aux!=1);

                            aux=2;




            }while(aux!=2);


				    Registro usuario1 = new Registro(nombre[contador],edad[contador],usuarios[contador],passws[contador], mail[contador]);
            usuario1.Mostrar();
            contador++;



    }

    public static int Comparar(String arreglo[], String dato){

        for(int i=0; i<=contador; i++){

            if(dato.equalsIgnoreCase(arreglo[i])){

                return 0;

            }

        }

        return 1;


    }


    public static boolean ValidaNumero(String cadena){

            try {

                    Integer.parseInt(cadena);
                    return true;
            }

            catch (NumberFormatException nfe){
                    return false;
            }
    }



    public static void Salir(){

    	System.out.println("Fin del programa\n\n");
    }





}
