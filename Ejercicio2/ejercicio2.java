 import java.util.Scanner;


public class ejercicio2 {
	public static void main(String[] args) {
			
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Introduce el numero que desea multiplicar >");
		   int numero = sc.nextInt();
		   System.out.println("------------ " + "TABLA DEL " + numero + " ----------");
		   for(int i = 1; i <= 10; i++) {
			   int multi = i * numero;
			   
			   System.out.println(i + " * " + numero + " = " + multi);
			   
		   }
		  
	}
}
