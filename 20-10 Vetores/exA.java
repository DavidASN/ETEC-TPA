import java.util.Scanner;
public class exA {
public static void main(String[] args) {
	
	Scanner ler = new Scanner(System.in);
	final int TAMV=10;
	int a[], b[],i; 
	a = new int[TAMV];
	b = new int[TAMV];
	
	
	//laço de leitura
	
	for(i=0; i<TAMV; i++) {
		System.out.println("Digite o "+(i+1)+" valor do vetor A");
		a[i]= ler.nextInt();
		//fazer a multiplicação
		b[i]= a[i]*a[i];
		
	}
	
	System.out.println("\nB =");
	for(i=0; i<TAMV; i++) {
		System.out.println(b[i]+ " ");
	}
}
}
