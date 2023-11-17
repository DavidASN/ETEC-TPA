package matriz;

public class Matriz1 {
	public static void main(String[] args) {
		int a[][],i,j;
		a = new int [4][4];
		
		int valor = 2;
		for(i=0;i<4;i++){
			
			for(j=0;j<4;j++){
				a[i][j] = valor;
				valor *= 2;
				
			}
			
		}
		
		
			for(i=0;i<4;i++){
				System.out.println();
						
						for(j=0;j<4;j++){
						System.out.print(a[i][j]+ " ");
						}
						
					}
		
		
	}
}
