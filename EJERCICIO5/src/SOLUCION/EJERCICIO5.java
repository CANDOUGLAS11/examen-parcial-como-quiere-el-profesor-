package SOLUCION;

import java.util.Scanner;

public class EJERCICIO5 {
	
		public static String leer(String mensaje) {
			Scanner teclado=new Scanner(System.in);
			System.out.println(mensaje);
			
			return teclado.nextLine();
		}
	public static void main(String[] args) {
		String palabra= leer("ingrese la palabra a evaluar; ");
		char[] vectorp= new char[palabra.length()];
		
		
		for(int i=0;i<palabra.length();i++) {
			vectorp[i]=palabra.charAt(i);	
		}
		
		for(int i=0;i<palabra.length();i++)
		System.out.println(vectorp[i]);

		char[] a=new char[palabra.length()];
		char[] b=new char[palabra.length()];
		for(int i=0;i<palabra.length();i++) {
				a[i]=vectorp[i];
				b[i]=vectorp[palabra.length()-(++i)];
		}
		for(int i=0;i<palabra.length();i++) {
				if((a[i]==b[i])) 
					System.out.println("esta palabra es palindroma");
				
					else 
						System.out.println("esta no palabra es palindroma");
				
				
		}
	
	}

}
