package newExercises;
import java.util.*;
public class Fatorial {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Digite um número ");
    int numero = in.nextInt();

    long fatorial = 1;
    int i = 1;

    while (i <= numero) {
        fatorial *= i;
        i++;
    }

    System.out.println("O fatorial de " + numero + " é: " + fatorial);


 

 

}
}

