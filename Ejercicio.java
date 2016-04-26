import java.io.*;

public class Ejercicio{

public static void main(String[] args){

int a,b;

BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

int aux, suma;


System.out.println("se introduciran dos valores y se imprimira la suma de los multiplos entre esos dos valores");


do{

System.out.println("Introduzca el primer valor");

a=Integer.parseInt(entrada.readline());


System.out.println("Introduzca el segundo valor");

b=Integer.parseInt(entrada.readline());

if(a<0 || b<0){

System.out.println("no se pueden introducir numero negativos");

}

}while(a<0 || b<0);


if(a>b){

a=aux;

a=b;

b=aux;

}

for(int i=a;i<b;i =i+5){

suma = suma + i;

}


System.out.println(suma);


}

}