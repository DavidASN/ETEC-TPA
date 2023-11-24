package vetores;

public class Fatorialv {
	public static void main(String[] args) {
		int[] a = new int [15];
		int[] b = new int [15];
		
		for(int i=0; i<15 ; i +=1) {
			a[i] = i;
			if(i < 2) {
				b[i] = 1;
				continue;
			}
			
			int p = 1;
            for (int k = 2; k <= a[i]; k++) {
                p *= k;
            }
            b[i] = p;
		}
		
		for(int j = 0; j<15  ; j +=1) {
			System.out.print(a[j]+"    fatorial: ");
			System.out.println(b[j]);
		}
	}
}
