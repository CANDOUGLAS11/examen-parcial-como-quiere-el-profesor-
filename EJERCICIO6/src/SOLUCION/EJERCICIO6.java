package SOLUCION;

import java.util.Scanner;

public class EJERCICIO6 {
	public static int leer(String mensaje) {
		Scanner teclado=new Scanner(System.in);
		System.out.println(mensaje);
		
		return teclado.nextInt();}

	public static void main(String[] args) {
		
		int tamanio=leer("ingrese la cantidad de números: ");
		int[]numeros= new int[tamanio];
		for(int i=0;i<tamanio;i++) {
			numeros[i]=leer("ingrese el numero "+(i+1)+" de la lista");
		}
		int a;
		int b;
		int[] vectormax=new int [4];
		for(int i=0;i<tamanio-5;i++) { 
				a=numeros[i]*numeros[i+1]*numeros[i+2]*numeros[i+3];
				b=numeros[i+1]*numeros[i+2]*numeros[i+3]*numeros[i+4];
		
				if (a > b) {
			
					 vectormax[ 0 ] = numeros[i];
					 vectormax[ 1 ] = numeros[i + 1 ];
					 vectormax[ 2 ] = numeros[i + 2 ];
					 vectormax[ 3 ] = numeros[i + 3 ];
			
				} else {
				
					vectormax [ 0 ] = numeros [i + 1 ];
					vectormax [ 1 ] = numeros [i + 2 ];
					vectormax [ 2 ] = numeros[i + 3 ];
					vectormax [ 3 ] = numeros [i + 4 ];												
			}
		}
		
		for(int i=0;i<4;i++) {
		System.out.println("los cuatro numeros consecutivos con mayor producto son:  ");
		System.out.println(vectormax[i]);
		
		}
		
		
		
		
		

	}

}
