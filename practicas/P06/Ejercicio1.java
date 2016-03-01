import java.io.*;
public class Ejercicio1{


  public static float suma(float a, float b) {
        float c;
        c = a + b;
        return c;
    }

    public static float resta(float a, float b) {
        float c;
        c = a - b;
        return c;
    }

    public static float multiplicar(float a, float b) {
        float c;
        c = a * b;
        return c;
    }

    public static float dividir(float a, float b) {
        float c;
        c = a / b;
        return c;
    }

    public static void operaciones() throws Exception {

        int opcion, principal;

        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));


        do {

        do{
        System.out.println("1.- sumar");
        System.out.println("2.- restar");
        System.out.println("3.- multiplicar");
        System.out.println("4.- dividir");
        System.out.println("5.- salir");

        System.out.println("\nSelecciona una opcion.");
        opcion = Integer.parseInt(entrada.readLine());

        if(!(opcion>=1 && opcion <=5)){
          System.out.println("\nIntroduzca un numero entre 1-5\n");
        }
      }while(!(opcion>=1 && opcion <=5));



        switch (opcion) {
            case 1:
                System.out.println("\n---Operacion Suma---\n");
                System.out.println("Ingrese el primer valor: ");

                float a = Float.parseFloat(entrada.readLine());
                System.out.println("Ingrese el segundo valor: ");
                float b = Float.parseFloat(entrada.readLine());
                float resultado = suma(a, b);
                System.out.println("\nEl resultado de la suma es:" + resultado);

                break;

            case 2:
                System.out.println("\n---Operacion resta---\n");
                System.out.println("Ingrese el primer valor: ");
                float c = Float.parseFloat(entrada.readLine());
                System.out.println("Ingrese el segundo valor: ");
                float d = Float.parseFloat(entrada.readLine());
                float resultado1 = resta(c, d);
                System.out.println("\nEl resultado de la resta es: " + resultado1);

                break;

            case 3:
                System.out.println("\n---Operacion multiplicacion---\n");
                System.out.println("Ingrese el primer valor: ");
                float e = Float.parseFloat(entrada.readLine());
                System.out.println("Ingrese el segundo valor: ");
                float f = Float.parseFloat(entrada.readLine());
                float resultado2 = multiplicar(e, f);
                System.out.println("\nEl resultado de la multiplicacion es: " + resultado2);

                break;

            case 4:

                float h;
                float g,resultado3=0;

                System.out.println("\n---Operacion division---\n");
                System.out.println("Ingrese el primer valor: ");

                g = Float.parseFloat(entrada.readLine());
               do{
                 do{
                    System.out.println("Ingrese el segundo valor: ");
                   h = Float.parseFloat(entrada.readLine());
                    if (h == 0) {
                        System.out.println("\nNo se puede dividir entre 0\n");
                    }
                  }while(h<0);
                }while(h == 0);
                 resultado3 = dividir(g, h);
                System.out.println("El resultado de la division es: " + resultado3);

                break;

                case 5:
                System.out.println("\nFin del programa");
                System.exit(0);
        }

        System.out.println("\n ¿Desea volver al menu principal? Si[1], No[oprima cualquier otro numero]");

        principal = Integer.parseInt(entrada.readLine());
        if(principal!=1){
          System.out.println("\nFin del programa");
        }

      }while(principal ==1);

    }

    public static void main(String[] args) throws Exception {

        Ejercicio1.operaciones();

    }
}
