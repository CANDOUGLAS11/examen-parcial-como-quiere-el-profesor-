package SOLUCION;

public class EJERCICIO7 {
	//siendo sizeof  un metodo que te devuelve el tamaño en bytes, de la variable
	public static void main(String[] args) {
		
		int i,x=4,w=9,q;
		for(i=-1;i<20;i+=3) {
			x++;
			for(q=4;q<11;q++) {
				do{
					i=+3;
					//como int=i, entonces sizeof(i)=4
					w= 4;
					i=x+w;
					x=w+i;
				}while(x<15);
			}
			
		}

		System.out.println("x: "+x+" i: "+i);
		//x=69 e i=68

	}

}
