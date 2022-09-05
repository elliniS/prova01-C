package ifsc;

import java.util.Scanner;

public class ProvaCMain {

	public static void main(String[] args) {
		int[] numeros = new int[8]; 
		int i = 0; 
		
		do {
			
			Scanner s = new Scanner(System.in);
			
			System.out.println("digite o numero " + (i+1) + ":");
			numeros[i] = Integer.valueOf(s.nextLine());
			if(numeros[i] > 0) {
				i++;
			}
			else {
				System.out.println("Nao permitido numeros iguais ou menor que zero");
			}
		}while(i < 8);
		
		System.out.println(Soma(numeros));

	}
	
	public static int Soma(int[] numeros) {
		int n = 0;
		
		for(int numero : numeros) {
			n = n + numero;
		}
		
		return n; 
	}

}
