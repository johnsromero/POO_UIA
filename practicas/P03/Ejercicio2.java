public class Ejercicio2{
  public static void main(String[] args){

    int a = 1, b = 5, c = 2;
    float x , y;

    x = b * b - 4 * a * c;
    y = x / 2 * a;

    System.out.println("\nPara valores de a = 1, b = 5 y c = 2\n");
    System.out.println("Expresion: b^2 - 4ac/2a\n");
    System.out.println("Sustituyendo: " + b +  "*" + b + " - " + "4" + "*" + a + "*" + c + " / " + "2*" + a + "\n");
    System.out.println("Sustituyendo: " + b * b + " - " + 4*a*c + " / " + 2*a + "\n");
    System.out.println("Sustituyendo: " + x + " / " + " 2 \n");
    System.out.println("El resultado es: " + y);
  }
}
