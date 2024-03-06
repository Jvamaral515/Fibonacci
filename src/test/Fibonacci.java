package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int nMenos1 = 0;
		int nMenos2 = 1;
		
		System.out.print("Digite um numero: ");
		int value = sc.nextInt();

		List<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(nMenos1);
		fibonacci.add(nMenos2);

		for (int i = 0; i <= value; i++) {
			int n = nMenos1 + nMenos2;
			nMenos2 = nMenos1;
			nMenos1 = n;
			fibonacci.add(n);
		}
		
		if(verifyValue(fibonacci, value)) {
			System.out.printf("%d faz parte da sequencia de Fibonacci%n", value);
		}
		else {
			System.out.printf("%d não faz parte da sequencia de Fibonacci%n", value);
		}
	}
	
	public static boolean verifyValue(List<Integer> list, int value) {
		boolean verify = false; 
		for (Integer x : list) {
			if(x == value) {
				verify = true;
				break;
			}
		}
		return verify;
	}
}
