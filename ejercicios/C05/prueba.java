import java.util.*;
public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador=0;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        while(n>=0){
              if(n%10==2)  //Si el número acaba en dos
                 contador++;       //esta variable contendrá cuántos números acabados en 2 se han leído.
              System.out.print("Introduce un número entero: ");
              n = sc.nextInt();
    }
        System.out.println("Se han introducido " + contador + " números acabados en 2");
    }
}
