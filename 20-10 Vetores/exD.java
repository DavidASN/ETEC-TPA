package javaProjectArraysTpa;
import java.util.*;
public class media {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[]a = new int[10];
		int c = 0;
		for(int i = 0; i<10;i++) {
			System.out.println("Entre com o "+(i+1)+" número");
			a[i] = in.nextInt();
			c += a[i];
		}
		int media = c/10;
		System.out.println("A média dos numeros digitados por você é "+media);
	}
}
