import java.util.Scanner;

public class Calculadora {

	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Scanner sc2 =new Scanner(System.in);
		String respuesta="";
		
		Calculadora calc = new Calculadora();
		do {
			System.out.println("Elija una opción \n1) sumar \n2) restar \n3) multiplicar \n4) dividir");
			int opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				calc.sumar();
				break;
			case 2:
				calc.restar();
				break;
			case 3:
				calc.multi();
				break;
			case 4:
				calc.dividir();
				break;
			default :
				System.out.println("Error opción no válida");
			}
			
			do {
				System.out.println("Desea realizar otra operación (s/n)");
				respuesta=sc2.nextLine();
				if(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n")) {
					System.out.println("Error, escriba s o n");
				}
			}while(!respuesta.equalsIgnoreCase("s") && !respuesta.equalsIgnoreCase("n"));
			
			
		}while(respuesta.equalsIgnoreCase("s"));

		sc.close();
		sc2.close();
	}
	
	/**
	 * Método en el que se pide un número
	 * @return numero introducido
	 */
	public int pideNumero() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num=sc.nextInt();

		return num;
	}
	
	/**
	 * Método que imprime por pantalla la suma de 2 números
	 */
	public void sumar() {
		Calculadora calc = new Calculadora();
		int num1=calc.pideNumero(); 
		int num2=calc.pideNumero();
		int suma=num1+num2;
		System.out.println("La suma de "+num1+"+"+num2+"="+suma);
	}
	/**
	 * Método que imprime por pantalla la resta de 2 números
	 */
	public void restar() {
		Calculadora calc = new Calculadora();
		int num1=calc.pideNumero(); 
		int num2=calc.pideNumero();
		int resta=num1-num2;
		System.out.println("La resta de "+num1+"-"+num2+"="+resta);
	}
	/**
	 * Método que imprime por pantalla la multiplicación de 2 números
	 */
	public void multi() {
		Calculadora calc = new Calculadora();
		int num1=calc.pideNumero(); 
		int num2=calc.pideNumero();
		int multi=num1*num2;
		System.out.println("La multiplicación de "+num1+"*"+num2+"="+multi);
	}
	/**
	 * Método que imprime por pantalla la division de 2 números
	 */
	public void dividir() {
		Calculadora calc = new Calculadora();
		int num1=calc.pideNumero(); 
		int num2=calc.pideNumero();
		if(num2==0) {
			System.out.println("No se puede dividir entre 0");
		}else {
			float divi=num1/num2;
			System.out.println("La division de "+num1+"/"+num2+"="+divi);
		}
	}
}
