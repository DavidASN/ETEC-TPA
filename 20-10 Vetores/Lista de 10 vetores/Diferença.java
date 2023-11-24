package vetores;
import java.util.Scanner;
public class Diferença {
	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);
		int a[] = new int [10];
		int b[] = new int [10];
	
		 for (int i = 0; i < 10; i++) {
	            int j = i + 1;
	            System.out.println("Digite o " + j + "º número de A");
	            a[i] = ler.nextInt();
	        }
		 
		 
		 for (int i = 0; i < 10; i++) {
	            int j = i + 1;
	            System.out.println("Digite o " + j + "º número de B");
	            b[i] = ler.nextInt();
	        }

		   int contadorI = 0;
		for (int i = 0; i < 10; i++) {
	            boolean igual = false;
	            for (int j = 0; j < 10; j++) {
	                if (b[i] == a[j]) {
	                    igual = true;
	                    break;
	                }
	            }
	            if (!igual) {
	                contadorI++;
	            }
	        }

	        int[] c = new int[contadorI];
	        int p = 0;

	        for (int i = 0; i < 10; i++) {
	            boolean achado = false;
	            for (int j = 0; j < 10; j++) {
	                if (b[i] == a[j]) {
	                    achado = true;
	                    break;
	                }
	            }
	            if (!achado) {
	                c[p] = b[i];
	                p++;
	            }
	        }

	        for (int i = 0; i < contadorI; i++) {
	            System.out.println("O número " + c[i] + " não é presente nas duas listas ao mesmo tempo, é uma diferença!");
	        }
	    }
	}
