 import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		System.out.println("Elige un numero para ver si es par | impar o primo | no primo");
		 Scanner sc = new Scanner(System.in);
		 int numero = sc.nextInt();
		 System.out.println("El numero introducido es " + numero);
		
		 // VEMOS SI EL NUMERO ES PAR O IMPAR
		 
		 if(numero % 2 == 0) 
			 System.out.println("El numero " + numero + " es PAR");
		 
		 else 
			 System.out.println("El numero " + numero + " es IMPAR");
		 
		 
		 // VEMOS SI EL NUMERO ES PRIMO O NO
		 
	        if ((numero % 2 == 0 && numero > 2) || numero == 1)
	            System.out.println("El numero no es primo");
	        
	        else {
	        	 for(int i = 3; i * i <= numero; i += 2){
	        		 if (numero % 1 == 0 || numero == 5) {
	        			 i = numero;
	        			 System.out.println("El numero es primo");
	        		 }
	        	 }
	        }
	    } 
	}