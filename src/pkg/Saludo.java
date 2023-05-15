package pkg;

import java.util.Scanner;

public class Saludo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num=0;
		boolean primo=true;
		System.out.println("Buenos días Ceinmark, soy Marta Gómez");
		
		System.out.print("Introduce un número para averiguar si es primo o no: ");
		num=ent.nextInt();
		
		for(int i=num-1;i>0;i--) {
			if(num%i==0) {
				primo = false;
				break;
			}
		}
		if(primo) {
			System.out.println("Es primo");
		} else {
			System.out.println("No es primo");
		}
		
	}
	
}
