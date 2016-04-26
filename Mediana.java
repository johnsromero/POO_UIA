import java.io.*;

public class Mediana{

public static void main(String[] args){


BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in);


int n, result;

do{

System.out.println("Introduce el tamaño del arreglo");

n=Integer.parseInt(entrada.readline());


if(n%2)

System.out.println("introduce un número impar");

}while(n%2);


int [] array= new int[n];

for(int i=0; i<n; i++){

System.out.println("valor"+(i+1));

array[i] = Integer.parseInt(entrada.readline());

}


Array.sort=array;

int j;

for(j; array){

System.out.println(array[j]+"\n");

}


float mediana;

mediana = array[j]/2;

result=(int) mediana.math;


System.out.println("la median es" + array[mediana]);


}

}
