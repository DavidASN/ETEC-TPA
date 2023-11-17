package javaProjectTPAMatriz;
import java.util.Random;
public class Matriz3 {
	public static void main(String[] args) {
		Random ran = new Random();
		int c[][] = new int[3][5];
		int soma;
		
		for(int i = 0; i< 3; i++) {
			 soma = 0;
			for(int j = 0 ; j< 5; j++) {
				if(j<4) {
					c[i][j] = ran.nextInt()%10;
					soma+=c[i][j];
				} else {
					c[i][j] = soma;
				}
			}
		}
		
		for(int i=0;i<3;i++){
			System.out.println();
					
					for(int j=0;j<5;j++){
					System.out.print("[ "+c[i][j]+"] ");
					}
					
				}

		
	}

}
