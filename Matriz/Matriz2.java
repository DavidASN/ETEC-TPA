import java.util.Random;
public class Ex002 {
	
	public static void main(String[] args) {
		Random ran = new Random();
		int b [][] = new int[3][3];
		
		int menor = 100, maior = -100;
		int posicaoXMA = 0,posicaoYMA = 0;
		int posicaoXME = 0,posicaoYME = 0;
		
		
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
					posicaoXME = i+1;
					posicaoYME = j+1;
				}
				if(b[i][j] > maior) {
					maior = b[i][j];
					posicaoXMA = i+1;
					posicaoYMA = j+1;
				}
			}
		}
		System.out.println("Maior:"+maior+" esta na linha "+posicaoXMA+" e na coluna "+posicaoYMA);
		System.out.println("Menor:"+menor+" esta na linha "+posicaoXME+" e na coluna "+posicaoYME);
		
	}

}
