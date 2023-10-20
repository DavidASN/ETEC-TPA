import java.util.Scanner;
public class exB {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	final int TAMV=10;
	int a[], b[], c[], i; 
	a = new int[TAMV];
	b = new int[TAMV];
	c = new int[TAMV];
	
	//laço de leitura do A
	
	for(i=0; i<TAMV; i++) {
		System.out.println("Digite o "+(i+1)+" valor do vetor A");
		a[i]= ler.nextInt();
	}
	
	//laço de leitura do B
	
	for(i=0; i<TAMV; i++) {
		System.out.println("Agora digite o "+(i+1)+" valor do vetor B");
		b[i]= ler.nextInt();
		//soma
		c[i]= a[i]+b[i];
	}
	
	
	
	
	
	
	System.out.print("\nA =");
	for(i=0; i<TAMV; i++) {
		System.out.print(a[i]+ " ");
	}
	
	System.out.print("\nB =");
	for(i=0; i<TAMV; i++) {
		System.out.print(b[i]+ " ");
	}
	
	System.out.print("\nC =");
	for(i=0; i<TAMV; i++) {
		System.out.print(c[i]+ " ");
	}
}
}
