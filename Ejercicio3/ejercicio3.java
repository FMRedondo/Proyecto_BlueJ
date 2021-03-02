 import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {

	
	Scanner sc = new Scanner(System.in);
	System.out.println("Introduzca el numero 1 >");
	   int numeroUno = sc.nextInt();
	   System.out.println("Introduce el numero 2 >");
	   int numeroDos = sc.nextInt();
	   System.out.println("Introduce el numero 3 >");
	   int numeroTres = sc.nextInt();
	   
	   // VEMOS EL NUMERO MAYOR
	   
	  if(numeroUno > numeroDos && numeroUno > numeroTres) {
		  System.out.println("el numero " + numeroUno + " es el mayor de los tres");
	  }
	  
	  else if(numeroDos > numeroUno && numeroDos > numeroTres) {
		  System.out.println("El numero " + numeroDos + " es el numero mayor");
	  }
	  
	  else {
		  System.out.println("El numero " + numeroTres + " es el numero mayor");
	  }
	  
	  // VEMOS EL NUMERO MENOR
	  
	  if(numeroUno < numeroDos && numeroUno < numeroTres) {
		  System.out.println("el numero " + numeroUno + " es el menor de los tres");
	  }
	  
	  else if(numeroDos < numeroUno && numeroDos < numeroTres) {
		  System.out.println("El numero " + numeroDos + " es el numero menor");
	  }
	  
	  else {
		  System.out.println("El numero " + numeroTres + " es el numero menor");
	  }
	  
	  // VEMOS SI HAY DOS O MAS NUMERO IGUALES
	  
	  if(numeroUno == numeroDos)
		  System.out.println("El numero uno es igual al numero dos " + numeroUno + " -> " + numeroDos);
	  
	  else if (numeroUno == numeroTres)
		  System.out.println("El numero uno es igual al numero tres " + numeroUno + " -> " + numeroTres);
	  
	  else if(numeroDos == numeroTres)
		  System.out.println("El numero dos es igual al numero tres" + numeroDos + "  -> " + numeroTres);
	  else
		  System.out.println("No hay numeros iguales");
	  
	   
	}
}
