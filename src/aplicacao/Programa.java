package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Linhas da matriz: ");
		int x = sc.nextInt();
		System.out.print("Colunas da matriz: ");
		int y = sc.nextInt();
		
		int[][] mat = new int [x][y];
		for (int i=0; i<x; i++) {
			for (int j=0; j<y; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Numero: ");
		int n = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == n) {
					System.out.println("Posicao: "+i+","+j+":");
					if (j>0) {
						System.out.println("Izquierda: "+mat[i][j-1]);
					}
					if (j<mat[i].length-1) {
						System.out.println("Derecha: "+mat[i][j+1]);
					}
					if (i>0) {
						System.out.println("Arriba: "+mat[i-1][j]);
					}
					if (i<mat.length-1)
					System.out.println("Abaixo: "+mat[i+1][j]);
				}
			}
		}
		
		sc.close();
	}

}
