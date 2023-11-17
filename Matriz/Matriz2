package javaProjectTPAMatriz;
import java.util.Random;
public class Matriz2 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		int b [][] = new int[3][3];
		
		int menor = 100, maior = -100;
		
		for(int i = 0; i< 3; i++) {
			for(int j = 0 ; j< 3; j++) {
				b[i][j] = ran.nextInt()%10;
			}
		}

		for(int i=0;i<3;i++){
			System.out.println();
					
					for(int j=0;j<3;j++){
					System.out.print("[ "+b[i][j]+"] ");
					}
					
		}
		System.out.println();
		for(int i=0; i<3 ; i++) {
			for(int j = 0; j<3 ; j++) {
				if(b[i][j] < menor) {
					menor = b[i][j]; 
				}
				if(b[i][j] > maior) {
					maior = b[i][j]; 
				}
			}
		}
		System.out.println("Maior:"+maior);
		System.out.println("Menor:"+menor);
	}

}
