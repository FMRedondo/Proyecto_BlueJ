 import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class ejercicio5 {

	public static void limpiar(int lineas)
	{
	for (int i=0; i < lineas; i++)
	{
	System.out.println("");
	}
	}
	

	
	public static void main(String[] args) {
		int iva = 0;
		
	    ArrayList<Double> productos = new ArrayList<Double>();
	    
	    Scanner sc = new Scanner(System.in);
	    
	    for(;;){
	    	System.out.println("Introduce el valor deseado");
			 double valor = sc.nextDouble();
			 if(valor == 0) {
				 System.out.println("Porcentaje del IVA??");
				 iva =sc.nextInt();

				 System.out.println("CERRANDO COMPRA ");
				 System.out.println("---------------");
				 break;
			 }
			 
			 productos.add((double) valor);
			 
	    	}
	   
	    double total = 0;
	
	    for(double i:productos) {
	    	
	    	total += i;
	    }
	    
	    limpiar(1);
	    
	    System.out.println("El total de la compra es -> " + total + "€");
	    System.out.println("--------------------------------------");
	    System.out.println("El precio con IVA es de -> " + (total + (total * iva / 100)));
	    limpiar(2);
	}
	
}


