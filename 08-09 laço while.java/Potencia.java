package newExercises;
import java.util.*;
public class Potencia {
public static void main(String[] args) {
int i=0, base, exp;
Scanner ler=new Scanner(System.in);
		System.out.println("digite o valor da base");
		base=ler.nextInt();
		System.out.println("digite o valor do Expoente");
		exp = ler.nextInt();
		int resultado = 1;
		while(i <= exp) {
				resultado*=base;
		i +=1;
		if(i == exp) {
			System.out.println(resultado);
		}
}
}
}
