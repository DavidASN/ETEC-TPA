package newExercises;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;
		int a = 0;
	    int b = 1;
	    
	    System.out.println("Digite o número pra sequência");
	    n = ler.nextInt();
	    
	    int i = 0;
	    
	    
	    
	    while (i<n) {
	    	System.out.print(a + " ");
	    	int temporario = a;
	    	a = b;
	    	b = temporario + b;
	    	
	    	i++;
	    	
	    }
	    
		
	}

}
