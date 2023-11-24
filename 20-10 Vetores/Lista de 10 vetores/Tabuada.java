package vetores;
import java.util.Scanner;
public class Tabuada {
 public static void main(String[] args) {
	 Scanner ler = new Scanner(System.in);
	 int[] t = new int[5];
	 
	 for(int i =0; i<5 ; i++) {
		 System.out.println("Digite o "+(i+1)+" valor do vetor T");
			t[i]= ler.nextInt();
		
			for(int s=1; s<11;s++) {
				
				int V = t[i] * s;
				System.out.println(t[i]+"X"+s+"="+V);
			}
		}
	}
}

