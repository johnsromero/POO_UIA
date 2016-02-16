public class Ejercicio1{
  public static void main(String[] args){
  int a = 10, b = 3, c = 1, d, e;
  float x, y;
  boolean bo = false;

  x = a/b;
  //c = a < b && c; No se puede inicializar una variable de tipo entero con operadores logicos.
  bo = a < b && a < c;
  d = a + b++;
  e = ++a - b;
  y = (float)a/b;

  System.out.println("\n" + x);
  System.out.println(+ a + " < " + b + " && " + a + " < " + c + "\t Es: " + bo);
  System.out.println(d);
  System.out.println(e);
  System.out.println(y);



  }
}
