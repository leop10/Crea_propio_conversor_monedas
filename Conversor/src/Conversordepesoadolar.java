
import java.util.Scanner;

public class Conversordepesoadolar {

	public static void main(String[] args) {
		EXTERNA:
		while(true) {
			System.out.println("CONVERSOR DE MONEDAS");
			System.out.println("1 - Pesos Argentinos a dolares\n"
					+ "2 - Pesos Mexicanos a dolares\n"
					+ "3 - salir");
			System.out.print("INGRESE UNA OPCION: ");
			Scanner Leer = new Scanner(System.in);
			char opcion = Leer.next().charAt(0);
			
			switch (opcion) {
			case '1':
				convertir(183.10, "Pesos Argentinos");
				break;
			case '2':
			convertir(18.87, "Pesos Mexicano");
			break;
			case '3':
				System.out.println("CERRANDO PROGRAMA");
				break EXTERNA;
			default:
				System.out.println("OPCION INCORRECTA");
				break;
			}
		}	
	}
	
	static void convertir(double valorDolar, String pais) {
		Scanner Leer = new Scanner(System.in);
		System.out.printf("Ingrese la cantidad de %s :", pais);
	    double cantidadMoneda = Leer.nextDouble();
	    
	    double dolares = cantidadMoneda / valorDolar;
	    
	    dolares = (double) Math.round(dolares * 100d)/100;
	    
	   System.out.println("-----------------------------------"); 
	   System.out.println("|    Tiene $"+dolares+" Dolares   |");
	   System.out.println("-----------------------------------"); 
	}
}
